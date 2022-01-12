import org.apache.spark.{SparkConf,SparkContext}

object Sale {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Sale").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val lines = sc.textFile("sale.txt")
    var num =0
    val result  = lines.map(line => {
        val fields = line.split(",")
        val label = fields(0)
        val num = fields(1).toInt
        (num,label)
      })
    val result1 = result.sortByKey(false).take(10).foreach(x => {
      num = num +1
      println(num + "\t\t" + x._2 +"\t" + x._1)
    })
    println("钱泽昊 191650126")
  }
}
