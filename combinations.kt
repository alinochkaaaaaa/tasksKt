fun main(){
    val n = readln().toInt()
    val k = readln().toInt()

    fun fact(number : Int) : Int {
        var f = 1
        for (i in 1 .. number){
            f = f * i
        }
        return f
    }

    println(fact(n) / (fact(k) * fact(n - k)))
}
