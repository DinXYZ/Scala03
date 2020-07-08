package implicitFunc

class MyStringAd(string : String) {
  def isEmail() : Boolean = string.matches("\\w@\\w\\.\\w")
  def isEmptyMy() : Boolean = string.isBlank
}
