fun main(){
    val num = readln().toInt()

    fun isPrimeNumber(num: Int): Boolean{
        for(i in 2 until num){
            if (num % i == 0){
                return false
            }
        }
        return true
    }

    if(isPrimeNumber(num)){
        println("prime")
    } else {
        println("composite")
    }
}
