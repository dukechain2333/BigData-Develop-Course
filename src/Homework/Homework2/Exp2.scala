object Exp2{
  def main(args:Array[String]){
    for(row <- 1 to 9){
      for (col <- 1 to row){
        var ans = row * col;
        print(col+"*"+row+"="+ans+" ");
      }
      println();
    }
  }
}
