package lcdnumbers {
  object Program extends Application {
    implicit def LcdInt2String(number: Int): LcdInt = new LcdInt(number)
    print(1234567890 asLcd)
  }  

  class LcdInt(number: Int) {
    
    val numbers = List(
      List(" _ ", "| |", "|_|"),
      List("   ", "  |", "  |"),
      List(" _ ", " _|", "|_ "),
      List(" _ ", " _|", " _|"),
      List("   ", "|_|", "  |"),
      List(" _ ", "|_ ", " _|"),
      List(" _ ", "|_ ", "|_|"),
      List(" _ ", "|_ ", "|_|"),
      List(" _ ", "|_|", "|_|"),
      List(" _ ", "|_|", " _|")
    )

    def asLcd(): String = {
      number.toString.map{d => numbers(d.asDigit)}.transpose.map(_ mkString) mkString("\n")
    }
    
  }
}
