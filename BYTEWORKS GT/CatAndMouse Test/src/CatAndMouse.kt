import java.util.*

/*import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.**/

fun catAndMouse(x: Int, y: Int, z: Int): String {
    //Cat A's Distance from the Mouse
    var catAdistance = if (z > x) { z - x } else { x - z }

    //Cat B's Distance from the Mouse
    var catBdistance = if (z > y) { z - y } else { y - z }

    //Result if Cat A/B catches the Mouse, or the Mouse escapes
    lateinit var chaseResult: String

    if (catAdistance > catBdistance) {
        chaseResult = "Cat B"
    } else if (catBdistance > catAdistance) {
        chaseResult = "Cat A"
    } else {
        chaseResult = "Mouse C"
    }
    return chaseResult
}

fun main() {
    println("Enter the positions of Cat A, Cat B and Mouse C in that order " +
            "and each separated with a comma:")
    val scan = Scanner(System.`in`)
    //val q = scan.nextLine().trim().toInt()

    for (qItr in 1..100) {
        val xyz = scan.nextLine().split(",")

        val x = xyz[0].trim().toInt()
        val y = xyz[1].trim().toInt()
        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}