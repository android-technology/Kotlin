package nullsafe

fun main() {
/*
    var str: String? = "Hello"
    println(str.length) // compile error
*/

    /* safe case */
    var str: String? = "Hello"
    if (str != null) {  // smart case
        println(str.length)
    }

    /* Use of is for smart cast */
    val obj: Any = "The variable obj is automatically cast to a String in this scope"
    if (obj is String) {
        //No Explicit Casting needed
        println("String lengh is ${obj.length}")
    }

//    var s: Any = 123;

    var objects: Any? = "Welcome to Vietname"
    if (objects !is String) {
        println("object is not string")
    } else {
        println("String length is ${objects.length}")
    }

    objects = null
    var a:String? = objects// as String?
    print(a)

    var b: Any = 123
    var c: String? = b as? String
    var d: String = b.toString()
    println("\nc = $c")
    println("d = $d")


}