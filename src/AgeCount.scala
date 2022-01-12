import java.io.PrintWriter
import org.apache.spark.{SparkConf, SparkContext}

object AgeCount {
  def main(args: Array[String]): Unit = {
    generate_data()
    val conf = new SparkConf().setAppName("AgeCount").setMaster("local")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")
    val data = sc.textFile("age_data.txt")
    var length = data.count()
    val tmpData = data.map(line => {
      val fields = line.split("\t")
      val age = fields(1).toInt
      age
    })
    var total: Int = tmpData.reduce(_ + _)
    var average = total / length
    println("Average age of " + length + " people is: " + average)
  }

  def generate_data(): Unit = {
    val file = new PrintWriter("age_data.txt")
    for (x <- 1 to 10000) {
      file.println(x + "\t" + scala.util.Random.nextInt(100))
    }
    file.close()
    println("Data successfully generated.")
  }
}
