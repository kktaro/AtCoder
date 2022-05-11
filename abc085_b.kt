fun main(args: Array<String>) {
    val numCount = readLine()!!.toInt()
    val mochiList = createMochiList(numCount)
    val resultMochiList = mochiList.distinct().sorted()

    print(resultMochiList.size)
}

fun createMochiList(count: Int): List<Int> {
    val res = mutableListOf<Int>()

    for (i in 1..count) {
        res.add(readLine()!!.toInt())
    }

    return res.toList()
}
