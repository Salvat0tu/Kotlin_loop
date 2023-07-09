fun main(args: Array<String>) {

    for (i in 1..100 step 2) {
        if (i <= 50) {
            println("The numbers below 50 are : $i")
        } else {
            println("the numbers above 50 are : $i")
        }
    }

}