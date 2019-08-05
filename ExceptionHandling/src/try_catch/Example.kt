package try_catch

import java.lang.Exception

fun main() {
    try {
        val data = 10 / 0;    //may throw exception
    } catch (e: Exception) {
//        e.printStackTrace()
        println(e.message)
    } finally {
        println("finally block always executes")
    }
    println("code below exception")

    val str = getNumber("100.00")
    print(str)
}

fun getNumber(str: String): Int {
    return try {
        Integer.parseInt(str)
    } catch (e: Exception) {
        0
    }
}