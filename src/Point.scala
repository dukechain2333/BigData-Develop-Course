class Point(){
  var x:Float = 0;
  var y:Float = 0;
  var z:Float = 0;

  def this(x:Float,y:Float,z:Float){
    this()
    this.x = x;
    this.y = y;
    this.z = z;
  }
}

class Dimension extends Point{
  var label = "";

  def this(label:String,x:Float,y:Float,z:Float){
    this()
    this.label = label;
    this.x = x;
    this.y = y;
    this.z = z;
  }

}

object Point{
  def main(args: Array[String]): Unit = {
    var dimension = new Dimension("Cube",10,10,10);
  }
}
