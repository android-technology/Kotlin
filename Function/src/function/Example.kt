package function

fun funName(): Int {
    var a = 100
    var b = 200
    return a * b
}

fun main(args: Array<String>) {
    var number = 25
    var result = Math.sqrt(number.toDouble())
    println("Square root of $number is $result")

    println("================> Sum()")
    sum()

    println("================> funName()")
    var rs = funName()
    println("result = " + rs)

    println("================> Sum(n1, n2)")
    var sum = sum(10, 30)
    println("sum = " + sum)
}

fun sum() {
    var num1 = 5
    var num2 = 6
    println("sum = " + (num1 + num2))
}

fun sum(num1: Int, num2: Int): Int {
    var add = num1 + num2
    return add
}