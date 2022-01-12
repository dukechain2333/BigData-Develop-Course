import org.apache.spark.{SparkConf,SparkContext}

object PhoneCount{
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("PhoneCount").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val rdd1 = sc.makeRDD(List(("Iphone",2),("Huawei",6),("OPPO",4),("Iphone",1),("Huawei",4),("Xiaomi",3),("OPPO",6)))
    val rdd2 = rdd1.groupByKey()
    val rdd3 = rdd2.mapValues(arr=>{
      var total:Int = arr.reduce(_+_)
      var day:Int = arr.size
      var avg = total/day
      avg
    })
    var rdd4 = rdd3.map(x=>(x._2,x._1)).sortByKey(false).map(x=>(x._2,x._1))
    rdd4.collect().foreach(println)
  }
}
