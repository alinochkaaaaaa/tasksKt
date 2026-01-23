fun main(){
    val data = readln().split(" ").map { it.toInt() }
    val a = data[0]
    val b = data[1]

    fun sign (x:Int):Int{
        if (x < 0) return -1
        else if (x == 0) return 0
        else return 1
    }

    println(sign(a) + sign(b))
}
