package constructors

// c1
class myConstructor(val id: Int, var name: String) {
    fun display() {
        println("id = ${id} && name = ${name}")
    }
}

// c2
class myClass(id: Int, name: String) {
    val e_Id: Int   // bắt buộc phải khởi tạo sau khi khai báo.
    var e_Name: String

    init {
        e_Id = id
        e_Name = name

        println("Id = $e_Id")
        println("Name = $e_Name")
    }
}

// c3
class secondaryConstructor1 {
    constructor(id: Int, name: String) {
        println("Id = $id && Name = $name")
    }

    constructor(id: Int, name: String, password: String) {
        println("Id = $id" + " Name = $name" + " Password " + password)
    }
}


// c4
class secondaryConstructor2(password: String) {

    constructor(id: Int, password: String) : this(password) {
        println("Id = $id")
    }

    constructor(id: Int, name: String, password: String) : this(password) {
        println("Id = $id && Name = $name")
    }

    constructor(address: String, password: String) : this(password) {
        println("Address = $address && Password = $password")
    }
}

class secondaryConstructor3 {

    constructor(id: Int, name: String) : this(id, name, "123@123") {
        println("Id = $id && Name = $name")
    }

    constructor(id: Int, name: String, pass: String) {
        println("this executes first\n")
        println("Id = $id")
        println("Name = $name")
        println("Password = $pass")
    }
}

class secondaryConstructor4(var id: Int, var name: String, var address: String, var phone: String) {
    /*    constructor(e_id: Int, e_name: String, e_address: String, e_phone: String) {

        }*/
    var e_Id: Int
    var e_Name: String?
    var e_Address: String?
    var e_Phone: String?

    init {
        e_Id = id
        e_Name = name
        e_Address = address
        e_Phone = phone
    }
}

fun main() {
    println()
    println("=============> MyConstructor =============> ")
    val obj = myConstructor(1, "Phan Van Hai")
    obj.display()
    println("Name = ${obj.name}")
    println("Id = " + obj.id)

    println()
    println("=============> MyClass =============> ")
    val myclass = myClass(2, "Phan Thi Mai")

    println()
    println("=============> secondaryConstructor1 =============> ")
    val scConstructor10 = secondaryConstructor1(100, "Phan Thi Anh")
    val scConstructor20 = secondaryConstructor1(200, "Phan Thi Phuong", "phuongpt@123")

    println()
    println("=============> secondaryConstructor2 =============> ")
    val scConstructor1 = secondaryConstructor2(1, "hai@123")
    secondaryConstructor2(2, "Phan Van Mai", "maipt123")
    secondaryConstructor2("Ha Noi", "hanoi123")

    println()
    println("=============> secondaryConstructor3 =============> ")
    secondaryConstructor3(111, "Nguyen Van Dung")
    secondaryConstructor3(222, "Nguyen Van Tuan", "tuan@123")

    println()
    println("=============> secondaryConstructor4 =============> ")

    println()
    println("=============> secondaryConstructor5 =============> ")


}