fun main() {
    val a = readln()
    val b = readln()

    fun sum(x : String) : Int {
        var sum = 0
        for (char in x) {
            if (char.isDigit()) {
                sum += char.toString().toInt()
            }
        }
        return sum
    }

    fun compare(x1: String, x2: String): Int {
        if (sum(x1) > sum(x2)) {
            return 1
        } else if (sum(x2) > sum(x1)) {
            return 2
        }
        return 0
    }

    println(compare(a, b))
}
