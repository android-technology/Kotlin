package variable

var a = 1000;

/**
 * Sự khác giữa var & val
 *
 * - var: dùng để khai báo với loại dữ liệu không bất biến (có thể thay đổi dữ liệu của biến sau khi khai báo)
 *
 * - val: dùng để khai báo với loại dữ liệu bất biến (dữ liệu sau khi được khai báo thì không đc thay đổi)
 *
 */

fun main(args: Array<String>) {
    println("a = " + a)

    //Khai báo không tường minh: compiler của Kotlin sẽ tự động suy luận ra kiểu dữ liệu ứng với giá trị khởi tạo
    //Với kiểu khai báo này thì bắt buộc phải khởi tạo ngay sau khi khai báo biến (ngc lại với khái báo tường minh ở dưới)
    var name = "PHan Hai";
    name = "PHan Mai";

    var number = 10000;
    number = 20000;

    var fullname: String = "PHan Van Hai";
    var salary: Int = 700000;

    //Khai báo kiểu một cách tường minh trong Kotlin
    var firstName: String;
    var avg: Double;

    //chỉ loại khai báo tường minh mới có thể không cần khởi tạo biến ngay sau khi khai báo biến.
    firstName = "Hai";
    avg = 100.3;

    val fName = "Xin chao";

    var value1 = 'A';   // Character
    var value2: Char;
    value2 = 'B';

    /* Creating Array using library function arrayOf() */
    val id = arrayOf(1, 2, 3, 4, 5);
    val firstId = id[0];
    val lasted = id[id.size - 1];
    println("firstId = " + firstId);
    println("lasted = " + lasted);

    /* Creating Array using Array() contructor */
    //Array(sizeArray,funtion)
    var asc = Array(5, { i -> i * 2 });   //asc[0,2,4,6,8]

    /* String trong Kotlin đại diện cho bởi String Class - String là bất biến  */
    val text = "Hello, Phan Hai";

    /* Type of String*/
    //1. Escaped String: khai báo string bên trong " ", trong một string có thể chứa các ký tự "\n, \t, \b, ..."
    val text1 = "Hello, Phan Hai";
    //or
    val text2 = "Hello, Phan Hai\n";
    //or
    val text3 = "Hello, \nPHan Hai";

    print("text1 = " + text1);
    print("text2 = " + text2);
    print("text3 = " + text3);

    //2. Raw String: khai báo string bên trong (""" """), nó không thể thể chứa các ký tự "\n, \t, \b, ...."
    //   nhưng nó cho phép chứa nhiều dòng trong khi khai báo một string
    val texts = """
        Welcome
        to 
        VietName
    """.trimIndent();
    print("\ntexts = " + texts);


}