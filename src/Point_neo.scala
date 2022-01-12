class Point_neo(x:Float,y:Float,z:Float){

}

class Dimension_neo(x:Float,y:Float,z:Float,label:String) extends Point_neo(x,y,z){

}

object ddddddddd{
  def main(args: Array[String]): Unit = {
    val point = new Point_neo(1,2,3)
    val dimension = new Dimension_neo(2,3,4,"he")
  }
}