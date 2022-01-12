object Exp1_2{
    def main(args:Array[String]){
        var map1 = Map(1->"one",2->"two",3->"three",4->"four",5->"five");
        if(map1.contains(3)){
            println("Key 3 exsits, it's value is:"+map1(3))
        }
        else{
            println("Key 3 doesn't exist!")
        }
        if(map1.contains(9)){
            println("Key 9 exsits, it's value is:"+map1(3))
        }
        else{
            println("Key 9 doesn't exist!")
        }
    }
}