package implicitClass

object MyStringAdObj {
  implicit class MyStringAdClass(string: String){
    def isEmail() : Boolean = string.matches("(\\w@\\w\\.\\w)")
    def isEmptyMy() : Boolean = string.isBlank
  }
}
