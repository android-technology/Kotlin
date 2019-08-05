package array

fun main() {
    /* Kotlin array declaration - using arrayOf() function */
    var myArray1 = arrayOf(1, 10, 4, 6, 15)
    var myArray2 = arrayOf<Int>(1, 10, 230, 405)
    var myArray3 = arrayOf<String>("Hello", "World")
    var myArray4 = arrayOf(1, 2, 3, 4, 'a', "Phan")

    /* Kotlin array declaration - using intArrayOf() */
    var myArray5: IntArray = intArrayOf(5, 10, 20, 300)

    /* Modify and access element of array */
    var array1 = arrayOf(1, 2, 3, 4, 5, 6, 7)
    var array2 = arrayOf<Long>(11, 22, 33, 44, 55, 66, 77)
    array1.set(0, 5)
    array1[2] = 6

    array2.set(2, 10)
    array2[3] = 8

    for (element in array1) {
        print("$element ")
    }
    println()
    for (element in array1.indices) {
        println("array1[$element] = " + array1[element])
    }
    println()
    for (element in array2) {
        print("$element ")
    }

    println()
    /* Kotlin array get() function example */
    val arrays = arrayOf(1, 2, 3, 4, 5, 6, 7)
    println(arrays.get(0))
    println(arrays[1])
    println(arrays[2])

    /* Kotlin array example1 */
    var myArray = Array<Int>(5) { 0 }
    for (e in myArray) {
        print("$e ")
    }
    println()
    myArray[0] = 5
    myArray.set(2, 10)
    for (e in myArray) {
        print("$e ")
    }

    /* Kotlin array example2 */
    println()
    var myArray7: IntArray = intArrayOf(5, 10, 20, 30, 40, 50, 70)
    for (index in 0..4) {
        println(myArray7[index])
    }
    println()
    for (index in 0..myArray7.size - 1) {
        println(myArray7[index])
    }
}