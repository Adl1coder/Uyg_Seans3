// Bu kodda bir oyuncak pul koleksiyonu var.
// Bu pullar farklı renklerde ve farklı sayılarda olabilir.

// "tekrarEdenPullariBul" adlı sihirli bir kutu (fonksiyon) var. Bu kutu, koleksiyonda tekrar eden pulları bulacak!

fun tekrarEdenPullariBul(liste: List<Int>): HashSet<Int> {
    // "benzersizPullar" kutusu, eklenecek benzersiz pullar için kullanılacak.
    // Yani aynı pulu birden fazla kez eklemeyecek!
    val benzersizPullar = HashSet<Int>()

    // "tekrarEdenPullar" kutusu, tekrar eden pulları saklamak için kullanılacak.
    // Yani aynı pulu birden fazla kez gördüğümüzde buraya koyacağız!
    val tekrarEdenPullar = HashSet<Int>()

    // Şimdi sırayla her pulu alıp inceleyeceğiz.
    for (pul in liste) {
        // Eğer "benzersizPullar" kutusuna bu pulu eklemeye çalışırsak...
        if (!benzersizPullar.add(pul)) {
            // ...ve eklenmezse, bu demektir ki bu pul zaten daha önce eklendi!
            // Yani bu, bir tekrar eden puldur. Onu "tekrarEdenPullar" kutusuna ekleyelim!
            tekrarEdenPullar.add(pul)
        }
    }

    // Şimdi, tekrar eden pulları içeren "tekrarEdenPullar" kutusunu geri gönderelim.
    return tekrarEdenPullar
}

// Şimdi, koleksiyonumuz hazır! Hadi bakalım, tekrar eden pulları bulalım!
fun main() {
    // İşte pulların listesi:
    val pulListesi = listOf(1, 2, 3, 2, 4, 5, 3, 6, 7)

    // "tekrarEdenPullariBul" kutusuna bu listeyi vererek tekrar eden pulları bulalım.
    val tekrarEdenPullar = tekrarEdenPullariBul(pulListesi)

    // İşte sonuç! "tekrarEdenPullar" kutusunda tekrar eden pullar var.
    println("Tekrar Eden Pullar: $tekrarEdenPullar")
}
