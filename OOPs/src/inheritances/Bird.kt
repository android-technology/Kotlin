package inheritances

interface Animal {
     fun move()
}

open class Bird : Animal {
    open fun fly(){
        println("Bird is flying ...")
    }

    override fun move(){
        println("Bird is flying ...")
    }
}

class Duck : Bird(){
    fun swim(){
        println("swiming ...")
    }

    override fun move() {
        println("Duck is swiming ...")
    }
}

fun main(){
    val bird = Bird()
    val duck = Duck()
/*
    duck.swim()     // Duck
    duck.fly()      // Bird
*/
    bird.move()
    duck.move()

}