package com.example.uyg_seansları.hafta3

fun filtre_tek_sayi(list: List<Int>): List<Int> {
    val teksayilar = list.filter { it % 2 != 0 }
    return teksayilar
}
fun main() {
    val myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val teksayilar = filtre_tek_sayi(myList)
    println("Tek Sayılar: $teksayilar") // Çıktı: Tek Sayılar: [1, 3, 5, 7, 9]
}
