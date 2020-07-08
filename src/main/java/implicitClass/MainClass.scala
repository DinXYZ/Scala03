package implicitClass

object MainClass {
  def main(args: Array[String]): Unit = {
    import MyStringAdObj._
    println("1@1.a".isEmail)
    println("".isEmptyMy)
  }
}
