package Homework.homework5

class Point {
  var x: Float = 0;
  var y: Float = 0;
  var z: Float = 0;

  def this(x: Float, y: Float, z: Float) {
    this()
    this.x = x;
    this.y = y;
    this.z = z;
    println("Point class established")
  }
}

class Dimension extends Point {
  var label = "";

  def this(label: String, x: Float, y: Float, z: Float) {
    this();
    this.label = label;
    this.x = x;
    this.y = y;
    this.z = z;
    println("Dimension class established")
  }

}

object Exp2 {
  def main(args: Array[String]): Unit = {
    var point = new Point(10,10,10)
    var dimension = new Dimension("Cube", 10, 10, 10);
  }
}


