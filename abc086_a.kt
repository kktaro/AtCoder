fun main(args: Array<String>) {
    val firstLine = readLine()!!.split(" ")
    val firstNumber = firstLine[0].toInt()
    val secondNumber = firstLine[1].toInt()
    val res = firstNumber * secondNumber

    print("${if(res % 2 == 0) "Even" else "Odd" }")
}
