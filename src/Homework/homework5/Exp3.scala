package Homework.homework5

class Employee(initialSalary: Double) {
  private var salary = initialSalary

  def tax(amount: Double) = {
    salary -= amount
    salary
  }

  def bonus(amount: Double) = {
    salary += amount
    salary
  }

  def getSalary(): Double = {
    return salary
  }
}

class Programmer(initialSalary: Double) extends Employee(initialSalary) {

  override def tax(amount: Double): Double = super.tax(amount + 20)

  override def bonus(amount: Double): Double = super.bonus(amount - 20)
}

object Exp3 {
  def main(args: Array[String]): Unit = {
    val initialSalary = 1000
    val amountTax = 100
    val amountBonus = 200
    val employee = new Employee(initialSalary)
    employee.tax(amountTax)
    employee.bonus(amountBonus)
    println("Employee's salary is " + employee.getSalary())
    val programmer = new Programmer(initialSalary)
    programmer.tax(amountTax)
    programmer.bonus(amountBonus)
    println("Programmer's salary is " + programmer.getSalary())
  }
}
