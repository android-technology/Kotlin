package inheritances

open class Base {
    val x = 10
}

class Derived : Base(){
    fun foo(){
        println("x is equal to " + x)
    }
}

fun main(){
    val derived = Derived()
    derived.foo()
}


