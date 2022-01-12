import org.apache.spark.{SparkConf,SparkContext}
object rank {
  def main(args:Array[String]): Unit ={
    val conf = new SparkConf().setAppName("rank").setMaster("local")
    val sc = new SparkContext(conf)
//    sc.setLogLevel("ERROR")
    val lines = sc.textFile("src/class1.txt,src/class2.txt,src/class3.txt")
    var num = 0
    val result  = lines.filter(line => (line.trim().length > 0) && (line.split(",").length == 4))
      .map(line => {
                val fields = line.split(",")
                val userid = fields(1)
                val core = fields(2).toInt
                val classs = fields(3)
                (core,(classs,userid))
      })
    println("rank" +"\t" + "class"  +"\t" + "\t" + "userid" +"\t" + "core" +"\n")
    val result1 = result.sortByKey(false).take(10).foreach(x => {
      num = num +1
      println(num + "\t\t" + x._2._1+ "\t\t" + x._2._2 +"\t" + x._1)
    })
  }
}
