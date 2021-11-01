import java.util.*

class biggestAndSmallest {
}

fun main() {
    val sc = Scanner(System.`in`)
    var smallest = Int.MAX_VALUE
    var biggest = 0
    while (sc.hasNext()) {
        var rightNow = sc.nextInt();
        if (rightNow < smallest) smallest = rightNow
        if (rightNow > biggest) biggest = rightNow
    }
    print(smallest)
    print(" ")
    println(biggest)
}