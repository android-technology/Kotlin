package for_loop

fun main(args: Array<String>) {
    /* Iterate through array */
    println("Iterate through array")
    val mark1 = arrayOf(10, 20, 30, 40, 50, 60, 70);
    for (item in mark1) {
        print("$item ")
    }
    println()
    for (item in mark1.indices) {
        println("mark1[$item] = " + mark1[item])
    }

    /* Iterate through range  */
    print("\nfor (i in 1..5) print(i) = ")
    for (i in 1..5) {
        print("$i ")
    }

    print("\nfor (i in 5..1) print(i) = ")
    for (i in 5..1) {
        print("$i ")    //prints nothing
    }

    print("\nfor (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) {   // 5 4 3 2 1 (from 5 to 1)
        print("$i ")
    }

    print("\nfor (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) {   // 5 4 3 2 (from 5 to 2)
        print("$i ")
    }

    print("\nfor (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) {  // 1 3 5
        print("$i ")
    }

    print("\nfor (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) {
        print("$i ")
    }
}