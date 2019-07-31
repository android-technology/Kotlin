package kotlin_io

import java.util.*

fun main(args: Array<String>) {
    //Kotlin Output
    print("Hello World!");
    println("Welcome to Kotlin");

    /* Kotlin Input */
    println("Enter your name")
    val name = readLine();
    println("Enter your age")
    val age: Int =
        Integer.valueOf(readLine());  // default readLine() là String vì vậy khi chúng ta khai báo dữ liệu tường mình thì cần ep kiểu
    println("Your name is $name and your age is $age")

    var read = Scanner(System.`in`);
    println("Enter address")
    val address = read.nextLine();
    println("Enter phone number")
    var phone = read.nextInt();
    println("Your address is $address and your phone number is $phone");
}