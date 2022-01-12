import org.apache.spark.{SparkContext,SparkConf}
import org.apache.spark.sql.SparkSession

object Sparksql{
  def main(args:Array[String]): Unit ={
    val conf = new SparkConf().setAppName("Sample").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val spark = SparkSession.builder().getOrCreate()
    val df = spark.read.json("/usr/local/spark-2.3.0-bin-hadoop2.7/examples/src/main/resources/people.json")
    df.createOrReplaceTempView("people")
    val sqlDF = spark.sql("Select * From people")
    sqlDF.show()
  }
}
