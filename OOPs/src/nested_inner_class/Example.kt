package nested_inner_class

class outerClass {
    private var name: String = "Hai"

    class nestedClass {
        var description: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
            //println("name is $name")    //cannot access the outer class member
            println("Id is $id")
        }
    }

    inner class innerClass {
        var description: String = "code inside inner class"
        private var id: Int = 201
        fun foo() {
            println("name is ${name}")  // access the outer class member even private
            println("Id is ${id}")
        }
    }

}

fun main() {

    println("======> Inner Class ======>")
    //nested class must be initialize
    println(outerClass.nestedClass().description)   //accessing property
    var obj = outerClass.nestedClass().foo()    //object creation
//    obj.foo()   //access member function

    println("======> Inner Class ======>")
    println(outerClass().innerClass().description)  //accessing property

    var o = outerClass().innerClass()
    o.foo() // access member function

}