object Exp6{
    def main(args:Array[String]){
        val data1 = Array(("Changsha",35.1),("Beijing",27.7),("Shanghai",32.8),("Shenyang",24.6));
        val data2 = Array(("Changsha",36.3),("Beijing",30.4),("Shanghai",33.5));
        val data3 = Array(("Changsha",34.5),("Beijing",31.1),("Shanghai",32.0),("Shenyang",22.7));
        val data = data1 ++ data2 ++ data3;
        val groupdata: Map[String, Array[(String, Double)]] = data.groupBy(_._1); 
        val result = groupdata.mapValues(t => {
            val totalSum = t.map(_._2).sum;
            val len = t.length;
            totalSum / len;
        })
        result.foreach(println)
    }
}