package com.example.uyg_seansları.ders2

interface Calisan {
    fun maasHesapla(): Double
}

class Mudur(private val yoneticiMaasi: Double) : Calisan {
    override fun maasHesapla(): Double {
        return yoneticiMaasi
    }
}

class Memur(private val maas: Double) : Calisan {
    override fun maasHesapla(): Double {
        return maas
    }
}

fun main() {

    val mudur = Mudur(yoneticiMaasi = 15000.0)
    val memur = Memur(maas = 4000.0)


    val mudurMaas = mudur.maasHesapla()
    println("Müdürün Maaşı: $mudurMaas")

    val memurMaas = memur.maasHesapla()
    println("Memurun Maaşı: $memurMaas")
}
