fun main(args: Array<String>) {
    val firstLine = readLine()!!.split(" ")
    val billCount = firstLine[0].toInt()
    val sumMoney = firstLine[1].toLong()

    var n1000 = -1
    var n5000 = -1
    var n10000 = -1

    fun printResult() = print("$n10000 $n5000 $n1000")

    // 全て1000円の金額よりもお年玉の金額が小さい場合、
    // 全て10000円の金額よりもお年玉の金額が大きい場合
    // はあり得ない
    if (billCount * 1000 > sumMoney || billCount * 10000 < sumMoney) {
        printResult()
        return
    }

    loop1000@ for (count1000 in billCount downTo 0) {
        loop5000@ for (count5000 in 0..billCount - count1000) {
            val count10000 = billCount - count1000 - count5000
            if (count10000 * 10000L + count5000 * 5000L + count1000 * 1000L == sumMoney) {
                n1000 = count1000
                n5000 = count5000
                n10000 = count10000
                break@loop1000
            }
        }
    }

    printResult()
}
