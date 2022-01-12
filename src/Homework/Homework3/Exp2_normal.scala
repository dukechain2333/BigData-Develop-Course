object Exp2_normal{
    def main(args:Array[String]){
        for (i<-(1 to 11)){
            println("Fibonacci of "+(i)+" is: "+Fibonacci(i));
        }
    }
    def Fibonacci(n:Int):Int = {
        var second = 1;
        var first = 0;
        var result = 0;
        if (n==1){
            return result;}
        else if(n==2){
            return second;
        }
        else {
            for (i <- 3 to n){
                result = first + second;
                first = second;
                second = result;
            }
            return result;
        }
    }
}