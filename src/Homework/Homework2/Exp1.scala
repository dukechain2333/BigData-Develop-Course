object Exp1{
  def main(args:Array[String]){
    for(row <- 1 to 10){
      var tmp = row;
      for (col <- 1 to row){
        print(tmp+" ");
        tmp += row;
      }
      println();
    }
  }
}
