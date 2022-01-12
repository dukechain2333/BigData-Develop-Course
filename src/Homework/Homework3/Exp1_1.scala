object Exp1_1{
    def main(args:Array[String]){
        var map1 = Map(1->"one",2->"two",3->"three",4->"four",5->"five");
        for ((k,v)<-map1){
            println("k:"+k+"    v:"+v)
        }
    }
}