fun main(args: Array<String>) {
    val firstNumber = readLine()!!.toInt()
    val secondLine = readLine()!!.split(" ")
    val secondNumber = secondLine[0].toInt()
    val thirdNumber = secondLine[1].toInt()
    val strings = readLine()!!

    print("${firstNumber + secondNumber + thirdNumber} $strings")
}
