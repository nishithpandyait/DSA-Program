fun main(args: Array<String>) {


    val hashingExample = HashingExample()

    //hashingExample.main(args)

    //hashingExample.countCommon(intArrayOf(89,24,75,11,23), intArrayOf(89,2,4,/*75,11,23*/))


    /*val sumOfElement = hashingExample.sumOfElement(intArrayOf(1, 4, 45, 6, 10, 8), 16)
    println(sumOfElement)*/


    //hashingExample.subArrayWithZeroSum(intArrayOf(4, 2, -3, 1, 6))


    //hashingExample.dictionary(arrayOf("Lion", "Leapord", "Apple", "Aeroplane", "Cat", "Cool", "#", "#2", "#1", "#3"))

    val array = mutableListOf<Int>()

    for (i in 1 until 100) {
        array.add(i)
    }

    hashingExample.saperateOddAndEven(array.toIntArray())

}



