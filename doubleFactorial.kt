fun main(){
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    fun doubleFact(x : Int) : Int {
        var fact = 1
        if ( x % 2 == 0) {
            for (i in 2..x step 2) {
                fact *= i
            }
        } else {
            for (i in 1..x step 2) {
                fact *= i
            }
        }
        return fact
    }

    print(doubleFact(a))
    print(" ")
    print(doubleFact(b))
    print(" ")
    print(doubleFact(c))
}
