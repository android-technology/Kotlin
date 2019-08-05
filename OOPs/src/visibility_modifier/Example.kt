package visibility_modifier

/**
 * Note:
 * - Trong kotlin chỉ có thể khai báo biến bên ngoài class hoặc function là public or private (ko thể khai báo là protected)
 * - Mặc đinh access modifier trong Kotlin là public (trường hợp không sử dụng access modifier rõ ràng - default là public)
 * -
 */

public var v1 = 10
var v1Pblic = 10

//protected var v3 = 100; // error compile

private var v4 = 10

//open - class : giúp cho phép class khác được kết thừa class hiện tại
open class Base {
    open internal val d = 10
    //open - file : cho phép class kế thừa class hiện tại được override lại.
    open protected val i = 5
}

//class Another chỉ kết thừa được class Base khi clas Base khai báo với từ khóa open && public modifier
class Another : Base() {
    fun getValue(): Int {
        return i
    }
    //chỉ override được khi filed của class cha được khai báo với từ khóa open
    override val i = 10
    override val d = 10
}

internal val y = 100
open class Future {
    internal val x = 5
    internal fun getValue(){

    }
}

var x = 10

class Past : Future() {
    var f = Future()
    fun get(){
        f.getValue()
    }
}

fun main() {
    val obj = Another()
    println(obj.getValue())
}