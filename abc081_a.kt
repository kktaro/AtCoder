fun main(args: Array<String>) {
    val firstLine = readLine()!!
    val count = firstLine.count { it == '1' }

    print("$count")
}
