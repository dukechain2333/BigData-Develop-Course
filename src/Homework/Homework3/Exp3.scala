object Exp3{
    def main(args:Array[String]){
        var lst1 = List(1,7,9,8,0,3,5,4,6,2);
        var result = 0;
        for (factor <- lst1){
            result += factorial(factor);
        }
        println("列表内元素阶乘的和为：" + result);
    }

    def factorial(n:Int):Int={
        if (n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}