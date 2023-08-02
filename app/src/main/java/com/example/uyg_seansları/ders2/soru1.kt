package com.example.uyg_seansları.ders2

fun <T> HashSet<T> .iceriyorMu(eleman: T):Boolean{
    return this.contains(eleman)
}


fun main() {
    // HashSet oluşturma ve meyveler eklenmesi


    val benimHashSet= HashSet<String>()
    benimHashSet.add("elma")
    benimHashSet.add("muz")

    // Kontrol edilecek elemanın belirlenmesi
    val kontrol_eleman = "muz"

    // iceriyorMu fonksiyonu ile elemanın varlığının kontrol edilmesi
    val iceriyorMu = benimHashSet.iceriyorMu(kontrol_eleman)

    // Sonucun ekrana yazdırılması
    if (iceriyorMu) {
        println("HashSet $kontrol_eleman elemanını içeriyor")
    } else {
        println("HashSet $kontrol_eleman elemanını içermiyor")
    }
}
