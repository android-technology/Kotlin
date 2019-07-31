package return_jump

/**
 * Có ba kiểu jumb expression trong kotlin
 * 1. break
 * 2. continue
 * 3. return
 */

fun main(args: Array<String>){
    /* Break Expression */
    for(i in 1..5){
        if(i == 3){
            break
        }
        print("$i ")
    }

    /* Kotlin Labeled break Expression */
    for(i in 1..3){
        loop@for(j in i..3){
            println("i = $i and j = $j")
            if(i == 2){
                break@loop;
            }
            println("This is below if")
        }
    }

    /* Kotlin Labeled continue Expression */
    labelname@ for(i in 1..3){
        for (j in 1..3){
            println("i = $i and j = $j")
            if(i  == 2){
                continue@labelname
            }
            println("this is below if")
        }
    }
}