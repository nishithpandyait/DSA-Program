import java.util.HashSet
import java.util.LinkedList


class HashingExample {
    fun main(args: Array<String>) {
        val array1 = arrayOf(5, -1, 2, -1, 3, 2)

        //val array1 = arrayOf(-1,-17, -12, 8 ,16, -17, -13, -14, -3, -6, -5, -11, -10, -12, -5, 19 ,-17, -5 ,-1 ,12)
        val map = mutableMapOf<Int, Int>()


        for (i in array1.indices) {
            val currentElement = array1[i]
            if (map.contains(currentElement)) {
                map.get(currentElement)?.let { map.put(array1[i], it + 1) }
            } else {
                map.put(currentElement, 1)
            }
        }

        var count = 0



        for (mutableEntry in map) {
            if (mutableEntry.value == 1 && count == 0) {
                println(mutableEntry.key)
                count++
                break
            }
        }

        println(map)
    }

    fun countCommon(array1: IntArray, array2: IntArray) {

        val map: MutableMap<Int, Int> = mutableMapOf<Int, Int>()

        for (i in array1.indices) {
            val currentElement = array1[i]
            if (map.contains(currentElement)) {
                val get = map.get(currentElement)
                map.put(currentElement, get!! + 1)
            } else {
                map.put(currentElement, 1)
            }
        }

        for (i in array2.indices) {
            val currentElement = array2[i]
            if (map.contains(currentElement)) {
                val get = map.get(currentElement)
                map.put(currentElement, get!! + 1)
            } else {
                map.put(currentElement, 1)
            }
        }

        for (mutableEntry in map) {
            if (mutableEntry.value > 1) {
                println("$mutableEntry.key key times = $mutableEntry.value")
            }
        }
    }

    fun sumOfElement(array1: IntArray, x: Int): Pair<Int, Int?> {

        val toSet = array1.toSet()

        for (i in array1) {
            val find = toSet.find() {
                it + i == x
            }
            if (find != null)
                return Pair(i, find)
        }

        return Pair(0, 0)
    }

    fun subArrayWithZeroSum(intArray: IntArray): Boolean {
        //4, 2, -3, 1, 6
        val toSet = mutableSetOf<Int>()
        var presum = 0
        for (i in intArray) {
            presum += i

            if (toSet.contains(presum) || presum == 0 || i == 0) {
                return true
            }
            toSet.add(i)
        }

        return false
    }

    fun dictionary(args: Array<String>) {
        //  L      -> [Lion, Leapord]
        val map = mutableMapOf<Char, LinkedList<String>>()
        //args.sort()
        for (arg in args) {

            val key = arg.get(0)//L

            if (map.containsKey(key)) {
                val spellingList = map.get(key)
                spellingList?.add(arg)
            } else {
                val list = LinkedList<String>()
                list.add(arg)
                map.put(key, list)
            }
        }

        for (mutableEntry in map) {
            println("Key -> ${mutableEntry.key} value ${mutableEntry.value}")
        }
    }

    fun pintMap(map: MutableMap<Int, LinkedList<Int>>) {
        for (mutableEntry in map) {
            println("Key -> ${mutableEntry.key} value ${mutableEntry.value}")
        }
    }

    fun saperateOddAndEven(array: IntArray) {


        val map = mutableMapOf<Int, LinkedList<Int>>()

        for (i in array) {
            val temp = i.isEven()
            val listOfNumbers = map.getOrDefault(temp, LinkedList());
            if (listOfNumbers!!.isNotEmpty()) {
                listOfNumbers.add(i)
            } else {
                val newList = LinkedList<Int>();
                newList.add(i)
                map.put(temp, newList)
            }
        }

        pintMap(map)

    }

}

private fun Int.isEven(): Int {
    return this % 2
}