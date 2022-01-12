object Exp2_reg{
    def main(args:Array[String]){
        for (i<-(0 to 10)){
            println("Fibonacci of "+(i+1)+" is: "+Fibonacci(i));
        }
    }

    def Fibonacci(n:Int):Int={
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
}