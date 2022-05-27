fun main(args: Array<String>) {
    val (ballCount, actionCount) = readLine()!!.split(" ").map { it.toInt() }
    val balls = MutableList<Int>(ballCount) { it + 1 }
    val positions = MutableList<Int>(ballCount) { it }

    fun swap(targetNumber: Int) {
        val targetIndex = positions[targetNumber - 1]
        val swappedIndex = targetIndex + if (targetIndex >= ballCount - 1) -1 else 1
        val ballTmp = balls[targetIndex]
        balls[targetIndex] = balls[swappedIndex]
        balls[swappedIndex] = ballTmp

        val positionTmp = positions[targetIndex]
        positions[targetIndex] = positions[swappedIndex]
        positions[swappedIndex] = positionTmp
    }

    for (i in 1..actionCount) {
        val targetNumber = readLine()!!.toInt()
        swap(targetNumber)
    }

    print(balls.joinToString(separator = " ", transform = { it.toString() }))
}
