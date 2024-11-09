fun main() {

    println("Данная программа показывает пересечение массивов.")
    val array1 = intArrayOf(1, 2, 3, 2, 0)
    val array2 = intArrayOf(5, 1, 2, 7, 3, 2, 2)

// отслеживание повторений чисел из первого массива
    val counts = mutableMapOf<Int, Int>()// число из арей, кол-во его повтореней в арей
    for (number in array1) {
        counts[number] = (counts[number] ?: 0) + 1// если нет повторений присваиваем ему 1
    }

    //список для хранения пересечения
     val intersection = mutableListOf<Int>()

     for (number in array2) {
     if (counts.containsKey(number) && counts[number]!! > 0)// есть ли повторения в 1 массиве
     {
         intersection.add(number)
         counts[number] = counts[number]!! - 1
     }
 }

 println("Пересечение массивов: $intersection")
}
