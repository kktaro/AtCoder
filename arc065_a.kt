fun main(args: Array<String>) {
    val s = readLine()!!

    val DREAMS =
            listOf<Pair<String, Int>>(
                    Pair("dream", "dream".length),
                    Pair("dreamer", "dreamer".length),
                    Pair("erase", "erase".length),
                    Pair("eraser", "eraser".length)
            )

    fun checkString(index: Int): Int? =
            when {
                s.startsWith(DREAMS[3].first, index) -> {
                    DREAMS[3].second
                }
                s.startsWith(DREAMS[2].first, index) -> {
                    DREAMS[2].second
                }
                s.startsWith(DREAMS[1].first, index) -> {
                    if (s.startsWith("${DREAMS[0].first}${DREAMS[2].first}", index)) {
                        DREAMS[0].second
                    } else {
                        DREAMS[1].second
                    }
                }
                s.startsWith(DREAMS[0].first, index) -> {
                    DREAMS[0].second
                }
                else -> {
                    null
                }
            }

    var tLength = 0

    while (tLength < s.length) {
        val stringStep = checkString(tLength)
        if (stringStep == null) {
            print("NO")
            return
        } else {
            tLength += stringStep
        }
    }
    print("YES")
}
