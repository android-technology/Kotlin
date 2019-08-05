package class_object

class Account {

    var acc_no: Int = 0
    var name: String? = ""
    var amount: Float = 0.toFloat()

    fun insert(acc: Int, n: String, am: Float) {
        this.acc_no = acc
        this.name = n
        this.amount = am
        println("Account no: ${acc_no} holder: ${name} amount: ${amount}")
    }

    fun deposit() {
        //deposit code
    }

    fun withdraw() {
        //withdraw code
    }

    fun checkBalance() {
        //balance check code
    }

}

fun main(args: Array<String>) {
//    Account()
    var acc = Account()
    acc.insert(123, "Hai", 70000f)
    println("${acc.name}")  //accessing class property

}