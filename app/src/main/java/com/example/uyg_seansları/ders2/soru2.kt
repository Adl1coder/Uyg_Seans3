package com.example.uyg_seansları.ders2

/*
Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın*/
fun main() {
    // set1 kutusunu oluşturalım ve içine toplar koyalım.
    val set1 = HashSet<String>()
    set1.add("kırmızı top")
    set1.add("mavi top")
    set1.add("yeşil top")

    // set2 kutusunu oluşturalım ve set1 kutusundaki topları kopyalayalım.
    val set2 = HashSet<String>()
    set2.elemanlariKopyala(set1)

    // Şimdi set1 ve set2 kutularının içindekileri ekrana yazdıralım.
    println("set1 kutusundaki toplar: $set1")
    println("set2 kutusundaki toplar: $set2")
}

// "elemanlariKopyala" adlı fonksiyonumuzu tanımlayalım.
// Bu fonksiyon, bir kutudaki topları diğer kutuya kopyalayacak.
fun <T> HashSet<T>.elemanlariKopyala(hedef: HashSet<T>) {
    // İlk kutudaki tüm topları ikinci kutuya ekleyelim.
    hedef.addAll(this)
}
