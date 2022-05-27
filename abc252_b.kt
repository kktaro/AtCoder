fun main(args: Array<String>) {
    val (likeCount, dislikeCount) = readLine()!!.split(" ").map { it.toInt() }
    val foods = readLine()!!.split(" ").map { it.toInt() }
    val dislikeFoods = readLine()!!.split(" ").map { it.toInt() }

    val maxDelicious = foods.max()
    for ((index, food) in foods.withIndex()) {
        if (food == maxDelicious) {
            if (dislikeFoods.contains(index + 1)) {
                print("Yes")
                return
            }
        }
    }
    print("No")
}
