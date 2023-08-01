// Fonksiyonu tanımlayalım
/*Bir HashMap'teki tüm değerleri toplayan bir fonksiyon yazın.*/
fun sumHashMapValues(map: HashMap<String, Int>): Int {
    // Toplamı tutacak bir değişken oluşturalım ve başlangıç değerini sıfır olarak belirleyelim
    var sum = 0
    // Harita içindeki değerlerin toplamını bulmak için döngü oluşturalım
    for (value in map.values) {
        // Döngüdeki her değeri toplam değişkenine ekleyelim
        sum += value
    }
    // Sonuç olarak toplam değeri döndürelim
    return sum
}
// Programın ana bölümü
fun main() {
    // Bir oyuncak dükkanı düşünün, müşterilere oyuncakları ve fiyatlarını gösteren bir etiket verildi.
    // Etiketler bir sözlük (HashMap) içinde depolanır. Anahtarlar (keys) oyuncak isimleridir ve değerler (values) oyuncak fiyatlarıdır.
    val oyuncakFiyatlari = HashMap<String, Int>()

    // Etiketleri ekleyelim
    oyuncakFiyatlari["top"] = 10 // Topun fiyatı 10 TL
    oyuncakFiyatlari["araba"] = 20 // Arabanın fiyatı 20 TL
    oyuncakFiyatlari["bebek"] = 15 // Bebeğin fiyatı 15 TL

    // Sözlükteki oyuncak fiyatlarını toplamak için sumHashMapValues fonksiyonunu kullanalım
    val toplamFiyat = sumHashMapValues(oyuncakFiyatlari)

    // Sonuçları ekrana yazdıralım
    println("Oyuncakların Toplam Fiyatı: $toplamFiyat")
}
