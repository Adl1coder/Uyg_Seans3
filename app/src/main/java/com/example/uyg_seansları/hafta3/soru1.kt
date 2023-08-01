package com.example.uyg_seansları.hafta3


fun sumListElements(list: List<Int>): Int {
    var sum = 0
    for (element in list) {
        sum += element
    }
    return sum
}

fun main() {
    val myList = listOf(1, 2, 3, 4, 5)
    val result = sumListElements(myList)
    println("Toplam: $result") // Çıktı: Toplam: 15
}
