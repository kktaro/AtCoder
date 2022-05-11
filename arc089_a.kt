fun main(args: Array<String>) {
    val goalCount = readLine()!!.toInt()
    val goals = mutableListOf<Pair<Int, Pair<Int, Int>>>()
    goals.add(Pair(0, Pair(0, 0)))
    for (i in 1..goalCount) {
        val line = readLine()!!.split(" ")
        goals.add(Pair(line[0].toInt(), Pair(line[1].toInt(), line[2].toInt())))
    }
    val deer = Deer(Pair(0, 0))

    var goalIndex = 0
    var nextGoal = goals[goalIndex]

    for (time in 1..goals.maxBy { it.first }!!.first) {
        if (nextGoal.first == time - 1 && nextGoal.second == deer.point) {
            // 目的に時間通りに到着
            if (goalIndex == goals.size - 1) {
                print("Yes")
                return
            } else {
                goalIndex++
                nextGoal = goals[goalIndex]
            }
        } else if (nextGoal.first < time) {
            // 時間に間に合わない
            print("No")
            return
        }

        if (nextGoal.second.first != deer.x) {
            // x座標がずれている
            if (nextGoal.second.first > deer.x) {
                deer.moveRight()
            } else {
                deer.moveLeft()
            }
        } else if (nextGoal.second.second != deer.y) {
            // y座標がずれている
            if (nextGoal.second.second > deer.y) {
                deer.moveUp()
            } else {
                deer.moveDown()
            }
        } else {
            // 時間がずれている
            deer.moveUp()
        }
    }
    if (nextGoal.second == deer.point) 
        print("Yes")
    else
        print("No")
}

class Deer(point: Pair<Int, Int>) {
    var x = point.first
        private set
    var y = point.second
        private set
    val point: Pair<Int, Int>
        get(): Pair<Int, Int> = Pair(x, y)

    fun moveUp() = y++
    fun moveDown() = y--
    fun moveRight() = x++
    fun moveLeft() = x--
}
