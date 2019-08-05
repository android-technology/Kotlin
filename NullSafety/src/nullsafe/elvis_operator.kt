package nullsafe

fun main() {
    var str1: String? = null
    var str2: String? = "May be declare nullable string"

    /* Check safe null normal*/
    var length1 = if (str1 != null) {
        str1.length
    } else {
        -1
    }
    println("Length1 = " + length1)

    var length2 = if (str2 != null) {
        str2.length
    } else {
        -1
    }
    println("Length2 = " + length2)

    /* Use Elvis Operator */
    var str3: String? = null
    var str4: String? = "Welcome To Vietname"
    var length3: Int = str3?.length ?: -1
    var length4: Int = str4?.length ?: -1
    println("Length3 = $length3 && Length4 = $length4")

}