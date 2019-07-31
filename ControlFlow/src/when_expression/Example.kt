package when_expression

fun main(args: Array<String>) {

    /* Using when as an Expression */
    var number1 = 4
    var numberProvided = when (number1) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        else -> "invalid number"
    }
    println("You provide $numberProvided")

    /* Using when without expression */
    var number2 = 5;
    when (number2) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("invalid number")
    }

    /* Multiple statement of when using braces */
    var number3 = 1
    when (number3) {
        1 -> {
            println("Monday")
            println("First day of the week")
        }
        8 -> println("Sunday")
        else -> println("Other days")
    }

    /* Multiple branches of when */
    var number4 = 8
    when (number4) {
        3, 4, 5, 6 ->
            println("It is summer season")
        7, 8, 9 ->
            println("It is rainy season")
        10, 11 ->
            println("It is autumn season")
        12, 1, 2 -> {
            println("It is winter season")
        }
        else -> println("invalid input")
    }

    /* Using when in the range */
    var number5 = 7
    when (number5) {
        in 1..5 -> println("Input is provided in the range 1 to 5")
        in 6..10 -> println("Input is provided in the range 6 to 10")
        else -> println("none of the above")
    }
}