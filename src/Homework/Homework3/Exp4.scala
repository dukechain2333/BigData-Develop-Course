import scala.math._

object Exp4{
    def main(args:Array[String]){
        var from = 1;
        var to = 3;
        println("The sqaure sum of sequentional numbers from "+from+" to "+to+" is: "+apply(square,from,to));
    }
    
    def apply(f:Int=>Double,from:Int,to:Int):Double={
        if(to==from){
            return f(from);
        }
        else{
            return f(to)+apply(f,from,to-1)
        }
    }

    val square = (x: Int) => pow(2,x);
}