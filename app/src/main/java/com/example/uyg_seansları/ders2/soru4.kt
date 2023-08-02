package com.example.uyg_seansları.ders2


interface Shape {
    fun alanHesapla(): Double
}

class Dikdortgen(private val en: Double, private val boy: Double) : Shape {
    override fun alanHesapla(): Double {
        return en * boy
    }
}

class Daire(private val yaricap: Double) : Shape {
    override fun alanHesapla(): Double {
        return Math.PI * yaricap * yaricap
    }
}

fun main() {
    val dikdortgen = Dikdortgen(en = 5.0, boy = 3.0)
    val daire = Daire(yaricap = 2.5)

    val dikdortgenAlan = dikdortgen.alanHesapla()
    println("Dikdörtgenin Alanı: $dikdortgenAlan")

    val daireAlan = daire.alanHesapla()
    println("Dairenin Alanı: $daireAlan")
}
