fun reverseList(list: List<Int>): List<Int> {
    return list.reversed() // Listeyi tersine çevir ve döndür
}
fun main() {
    val myList = listOf(1, 2, 3, 4, 5)
    val reversedList = reverseList(myList)
    println("Tersine Çevrilmiş Liste: $reversedList") // Çıktı: Tersine Çevrilmiş Liste: [5, 4, 3, 2, 1]
}
