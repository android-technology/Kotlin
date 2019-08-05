package nullsafe

fun main() {
    /*  */
    var str1: String? = "Hello"
    str1 = null
    println(str1)

    /*  */
/*
    var str2: String = null; // false
    str2 = "hello"
    var str3: String = "hello"
    str3 = null
*/

    /* Checking for null in conditions */
    var str4: String? = "Hello"
    var len = if (str4 != null) {
        str4.length
    } else {
        -1
    }
    println("len = " + len)

    str4 = null
    println("str is : $str4")
    len = if (str4 != null) {
        str4.length
    } else {
        -1
    }
    println("len = " + len)
}