package typeconversion

fun main(args: Array<String>) {
    var value1 = 10;
//    var value2: Long = value1;  // Compile error.
    var value2: Long = value1.toLong();

    println("value2 = " + value2)

    var value3: Int = value2.toInt();
    println("value3 = " + value3)

    var value4: Double = value1.toDouble();
    println("value4 = " + value4)

    var value5: Byte = value4.toByte();
    println("value5 = " + value5)
}