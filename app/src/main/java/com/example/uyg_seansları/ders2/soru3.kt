package com.example.uyg_seansları.ders2

interface Cizilebilir{
  fun ciz()

}
interface  Silinebilir{
    fun sil()
}

 class Kalem: Cizilebilir,Silinebilir {
     override fun ciz() {
         println("kalemle cizim yapıldı")
     }

     override fun sil() {
         println("kalemle silindi")
     }


 }

    class Silgi: Silinebilir{
        override fun sil() {
            println("silgiyle silindi ")
        }

    }

fun main() {
    val kalem=Kalem()
    val silgi=Silgi()
    kalem.ciz()
    kalem.sil()
    silgi.sil()
}
