fun main(args: Array<String>) {
    val n500 = readLine()!!.toInt()
    val n100 = readLine()!!.toInt()
    val n50 = readLine()!!.toInt()
    val sum = readLine()!!.toInt()
    var completeCount = 0

    for (count500 in 0..n500) {
        for (count100 in 0..n100) {
            for (count50 in 0..n50) {
                if (count500 * 500 + count100 * 100 + count50 * 50 == sum) {
                    completeCount++
                }
            }
        }
    }

    print(completeCount)
}
