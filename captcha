fun main() {
    var table : Array<Array<Int>> = Array(3) { Array(3) { 0 } }
    for (i in 0 until 3) {
        val line = readln().split(" ")
        for(l in 0 until 3) {
            table[i][l] = line[l].toInt()
        }
    }
  
    val goal = readln().toInt()
    val attempts = readln().toInt()
    var fl = 1
  
    for (i in 0 until attempts) {
        val coords = readln().split(" ").map { it.toInt() }
        if (table[coords[0]][coords[1]] == goal) {
            continue
        } else {
            fl = 0
        }
    }
  
    if (fl == 0){
        print("Вы не человек")
        return
    }
    print("Captcha успешно пройдена")
}
