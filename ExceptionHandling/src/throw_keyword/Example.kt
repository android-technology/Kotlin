package throw_keyword

import org.omg.CORBA.UserException

fun main() {
    validate(10)
    println("code after validate check")
}

fun validate(age: Int) {
    if (age < 18) {
        
    } else {
        println("eigible for drive")
    }
}