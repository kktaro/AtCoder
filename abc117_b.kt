fun main(args: Array<String>) {
    val flowerCount = readLine()!!.toInt()
    val flowers = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var takeCount = 0

    fun takeWater(l: Int, r: Int) {
        if (l > r) return
        if (r >= flowerCount) return

        for (i in l..r) {
            flowers[i]--
        }

        takeCount++
    }

    while (true) {
        if (flowers.count { it == 0 } == flowers.size) break
        val firstFlowerIndex = flowers.indexOfFirst { it >= 1 }
        val selectedHeight = flowers[firstFlowerIndex]
        for (searchIndex in firstFlowerIndex + 1..flowerCount) {
            if (searchIndex == flowerCount || flowers[searchIndex] < selectedHeight) {
                takeWater(firstFlowerIndex, searchIndex - 1)
                break
            }
        }
    }

    print(takeCount)
}
