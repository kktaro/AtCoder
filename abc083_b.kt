fun main(args: Array<String>) {
    val firstLine = readLine()!!
    val cards = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var alice = 0
    var bob = 0
    var isAliceTurn = true

    while (cards.size > 0) {
        val cardNumber = cards.max()!!
        if (isAliceTurn) {
            alice += cardNumber
        } else {
            bob += cardNumber
        }
        isAliceTurn = !isAliceTurn
        cards.remove(cardNumber)
    }

    print(alice - bob)
}
