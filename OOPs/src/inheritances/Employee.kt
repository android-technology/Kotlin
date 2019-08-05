package inheritances

/**
 * Note:
 * - Trong Kotlin có một class chung superclass cho tất cả các class là "Any".
 * - Mặc định khi khái báo một class không có superclass nào thì mặc định sẽ kế thừa thừ superclass "Any".
 * - Trong Kotlin một class kế thừa từ class khác sử dụng toán từ hai chấm (:) sau constructor hoặc tên class.
 * - Khi chúng ta muốn tạo một class để cho class khác kế thừ thì cần khai báo trước tên class toán từ "open" để class đó có thể
 *   kế thừa từ class khác (mặc định khi khai báo một class thì class đó là "final" vì vậy cần sử dụng toán tử "open" để non-final)
 * -
 */

// Mặc định có access modifier là "public", có superclass là "Any" và class là "final"
class Example : Any() {

}

open class Employee(name: String, age: Int, salary: Float) {
    //code of employee
    init {
        println("Name is $name")
        println("Age is $age")
        println("Salary is $salary")
    }
}

class Programmer(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    //code of programmer
    fun doProgram() {
        println("programming is my passion.")
    }
}

class Salsesman(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    //code of salesman
    fun fieldWork() {
        println("travelling is my hobby.")
    }
}

/* Kotlin Inheritance and Priamry Constructor */
open class Employee1(name: String, salary: Float) {
    init {
        println("Name is $name")
        println("Salary is $salary")
    }
}

class Programer1(name: String, dept: String, salary: Float) : Employee1(name, salary) {
    init {
        println("Name is $name of department $dept with salary $salary")
    }

    fun doProgramming() {
        println("Programming is my passion")
    }
}

class SalesMan1(name: String, dept: String, salary: Float) : Employee1(name, salary) {
    init {
        println("Name is $name of department $dept with salary $salary")
    }

    fun fieldWork() {
        println("Traveling is my hobby")
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
open class Employee2(open var name: String, open var salary: Float) {

}

class Programmer2(override var name: String, var dept: String, salary: Float) : Employee2(name, salary) {
    init {
        println("Name is $name, department is $dept, salary is $salary")
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* Kotlin Inheritance and secondary constructor */

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
open class Patent {
    constructor(name: String, id: Int) {
        println("execute super constructor $name : $id")
    }
}

class Child1(var name: String, var id: Int, var dept: String) : Patent(name, id) {
    fun display() {
        println("execute child class constructor with property $name, $id, $dept")
    }
}

class Child2 : Patent {
    constructor(name: String, id: Int, dept: String) : super(name, id) {
        println("execute child class constructor with property $name, $id, $dept")
    }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

fun main() {
    val obj1 = Programmer("Phan", 12, 20000f)
    val obj2 = Salsesman("Van", 32, 200033f)

    obj1.doProgram()
    obj2.fieldWork()

    println("\n=====> Kotlin Inheritance and Priamry Constructor =====>")
    val obj3 = Programer1("Nguyen", "Development", 10002f)
    obj3.doProgramming()

    val obj4 = SalesMan1("Tuan", "Maketing", 300022f)
    obj4.fieldWork()

    println("\n========================================================")
    val obj5 = Programmer2("Hai", "Networking", 370000f)

    println("\n=====> Kotlin Inheritance and secondary constructor =====>")
    val obj6 = Child1("Anh", 1, "Economic")
    obj6.display()

    val obj7 = Child2("Dung", 2, "Engineering")


}