package com.example.uyg_seansları.hafta3

fun mergeAndSortLists(list1: List<Int>, list2: List<Int>): List<Int> {
    val mergedList = list1 + list2 // İki listeyi birleştir
    return mergedList.sorted()    // Birleştirilmiş listeyi sırala ve döndür
}
fun main() {
    val list1 = listOf(1, 3, 5)
    val list2 = listOf(2, 4, 6)
    val mergedAndSorted = mergeAndSortLists(list1, list2)
    println("Birleştirilmiş ve Sıralanmış Liste: $mergedAndSorted") // Çıktı: Birleştirilmiş ve Sıralanmış Liste: [1, 2, 3, 4, 5, 6]
}
