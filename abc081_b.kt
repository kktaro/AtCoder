fun main(args: Array<String>) {
    val numCount = readLine()!!.toInt()
    var numbers = createNumbers(readLine()!!.split(" "))
    var divCount = 0

    while (true) {
        val canDiv = mutableListOf<Boolean>()
        for (number in numbers) {
            canDiv.add(if (number % 2 == 0) true else false)
        }
        if (canDiv.count { it } == canDiv.size) {
            // 全て偶数
            divCount++
            numbers = numbers.map { it / 2 }
        } else {
            break
        }
    }

    print("$divCount")
}

fun createNumbers(input: List<String>): List<Int> {
    val res = mutableListOf<Int>()
    for (num: String in input) {
        res.add(num.toInt())
    }
    return res
}
