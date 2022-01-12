class BankAccount {
  private var balance: Float = 0;

  def this(initMoney: Float) {
    this()
    this.balance = initMoney;
    println("Your account is created. The balance now is $" + this.balance)
  }

  def deposit(money: Float): Unit = {
    if (money > 0) {
      println("You requested for deposit $" + money)
      this.balance += money
      println("Your balance now is $" + this.balance)
    }
    else {
      println("Please input a correct amount！")
    }
  }

  def withdraw(money: Float): Unit = {
    if (money > 0) {
      if (this.balance > money) {
        println("You requested for withdraw $" + money)
        this.balance -= money
        println("Your balance now is $" + this.balance)
      }
      else {
        println("Sorry, your balance is $" + this.balance + "and it is not enough for your withdraw request")
      }
    }
    else {
      println("Please input a correct amount！")
    }
  }
}

object BankAccount {
  def main(args: Array[String]): Unit = {
    var bankAccount = new BankAccount(1000)
    bankAccount.deposit(100)
    bankAccount.withdraw(200)
  }
}
