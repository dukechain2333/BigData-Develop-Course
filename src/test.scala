import org.apache.spark.{SparkConf, SparkContext}

object test {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("test").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val data = sc.makeRDD(List(1, 7, 8, 5, 3, 18, 34, 9, 0, 12, 8))
    var i = 0
    val tmpData = data.map(x => {
      i += 1
      (x, i)
    })
    val sortedData = tmpData.sortByKey()
    sortedData.foreach(x => print(x._2 + "\t"))
  }
}
