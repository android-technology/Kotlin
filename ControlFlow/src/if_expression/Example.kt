package if_expression

fun main(args: Array<String>) {
    val num1 = 10;
    val num2 = 20;

    //
    val result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        "$num1 is smaler than $num2"
    }
    println("result = " + result)

    //
    var rs = if (num1 > num2) "$num1 > $num2" else "$num1 < $num2"
    println(rs)

    //
    if (num1 > num2) {
        println("num1 > num2")
    } else {
        println("num1 < num2")
    }

    //
    var res: String
    if (num1 > num2) {
        res = "num1 is lon hon num2"
    } else {
        res = "num1 is nho hon num2"
    }
    println(res)

    //
    val num3 = 25;
    val num4 = 40;
    val num5 = 30;

    val results = if (num3 > num4) {
        val max = if (num3 > num5) {
            num3
        } else {
            num5
        }
        "body of if " + max;
    } else if (num4 > num5) {
        "body of else if " + num4;
    } else {
        "body of else " + num5;
    }
    println("results = " + results)
}