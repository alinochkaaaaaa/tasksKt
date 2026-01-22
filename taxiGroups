fun main() {
    val n = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }

    var count1 = arr.count { it == 1 }
    var count2 = arr.count { it == 2 }
    var count3 = arr.count { it == 3 }
    var count4 = arr.count { it == 4 }

    var taxis = 0

    // Группы из 4 человек 
    taxis += count4

    // Группы из 3 человек с группами из 1 человека
    taxis += count3
    count1 = maxOf(0, count1 - count3)

    // Группы из 2 человек 
    taxis += count2 / 2
    count2 %= 2

    // Если осталась одна группа из 2 человек
    if (count2 == 1) {
        taxis += 1
        // Она может взять с собой до 2 человек из групп по 1
        count1 = maxOf(0, count1 - 2)
    }

    // Оставшиеся группы из 1 человека
    taxis += (count1 + 3) / 4  

    println(taxis)
}
