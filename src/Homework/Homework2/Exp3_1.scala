object Exp3_1{
  def main(args:Array[String]){
    var lst1 = List(1,7,9,8,0,3,5,4,6,2);
    var ansList:List[Int] = Nil;
    for (i <- lst1){
      ansList = ansList :+ (i*20);
    }
    println(ansList);
  }
}
