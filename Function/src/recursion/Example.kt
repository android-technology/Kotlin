package recursion

fun main(args: Array<String>) {
    println("Hello")
    rec()
    println("===> Run()")
    run(10, 'z')
    run(latter = 'A')

    println("===> Lambda")
    val myLambda: (Int) -> Unit = { s: Int -> println(s) }
    addNumber(5, 10, myLambda)

    val divLambda: (Float) -> Unit = { s: Float -> println(s) }
    divNumber(5, 10, divLambda)
}

var count = 0
fun rec() {
    count++
    if (count <= 5) {
        println("hello " + count)
        rec()
    }
}

fun run(num: Int = 5, latter: Char = 'x') {
    println("parameter in function definition $num and $latter")
}

fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit) {
    val add = a + b
    mylambda(add)
}

fun divNumber(a: Int, b: Int, divlambda: (Float) -> Unit) {
    var div: Float = a.toFloat() / b.toFloat()
    divlambda(div)
}