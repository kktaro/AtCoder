fun main(args: Array<String>) {
    val (prefectureCount, cityCount) = readLine()!!.split(" ").map { it.toInt() }

    val prefectures = MutableList<MutableList<Int>>(prefectureCount, { mutableListOf<Int>() })

    val outputOrder = mutableListOf<Pair<Int, Int>>()

    // 各市の情報を格納
    for (i in 1..cityCount) {
        val (targetPrefecture, targetYear) = readLine()!!.split(" ").map { it.toInt() }
        prefectures[targetPrefecture - 1].add(targetYear)
        outputOrder.add(Pair(targetPrefecture, targetYear))
    }

    // 格納した市を県ごとにソート
    for (prefecture in prefectures) {
        prefecture.sort()
    }

    for (order in outputOrder) {
        val prefectureNumber = order.first.toString().padStart(6, '0')
        val cityNumber =
                (prefectures[order.first - 1].indexOfFirst { it == order.second } + 1)
                        .toString()
                        .padStart(6, '0')

        println("$prefectureNumber$cityNumber")
    }
}
