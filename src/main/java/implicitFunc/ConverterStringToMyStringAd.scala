package implicitFunc

object ConverterStringToMyStringAd {
    implicit def stringToMyStringAd(string : String) = new MyStringAd(string)
}
