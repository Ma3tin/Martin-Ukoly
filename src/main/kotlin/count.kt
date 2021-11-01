import java.util.*

class count {
}

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    var total = 0
    for (i in 0..input.length step 2) if (input[i].digitToInt() % 3 == 0) total += input[i].digitToInt()
    println(total)
}