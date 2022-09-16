package com.example.belajarkotlin

import android.media.Image

open class Pegawai(_nama: String, _noPegawai: Int, _gaji: Int) {
    var nama: String = _nama
    var noPegawai: Int = _noPegawai
    var gaji: Int = _gaji

    open fun salary(): Double {
        return gaji.toDouble()
    }
}

class Programmer(_nama: String, _noPegawai: Int, _gaji: Int, _bonus: Int) :
    Pegawai(_nama, _noPegawai, _gaji) {
    var bonus = _bonus

    override fun salary(): Double {
        return gaji + (0.25 * bonus)
    }
}

class Manager(_nama: String, _noPegawai: Int, _gaji: Int, _tunjangan: Int) :
    Pegawai(_nama, _noPegawai, _gaji) {
    var tunjangan: Int = _tunjangan

    override fun salary(): Double  {
        return (gaji + tunjangan).toDouble()
    }
}

interface Identitas{
    fun TampilkanNama()
    fun TampilkanUmur(){}
}

abstract class MakhlukHidup(){
    abstract fun makan()
    open fun bersuara(){}
    open fun berjalan(){}
}

class Manusia: MakhlukHidup(), Identitas{
    override fun TampilkanNama() {
        println("Ini Manusia")
    }

    override fun TampilkanUmur() {
        println("Manusia berumur 79 tahun")
    }

    override fun makan() {
        println("Omnivora tapi harus diolah")
    }

    override fun bersuara() {
        println("Aphabetical")
    }

    override fun berjalan() {
        println("Menggunakan Kaki")
    }

}

class Hewan: MakhlukHidup(), Identitas{
    override fun TampilkanNama() {
        println("Ini Hewan")
    }

    override fun TampilkanUmur() {
        println("Hewan berumur 7 tahun")
    }

    override fun makan() {
        println("Omnivora, Herbivora, Karnivora")
    }

    override fun bersuara() {
        println("Sesuai dengan jenisnya")
    }

    override fun berjalan() {
        println("Menggunakan kaki, tangan, sirip, sayap")
    }

}

class Tumbuhan: MakhlukHidup(), Identitas{
    override fun TampilkanNama() {
        println("Ini Tumbuhan")
    }

    override fun makan() {
        println("Fotosintesis")
    }


}

fun main() {

    val gawai = Pegawai("Andrea", 100, 8000000)
    val gamer = Programmer("Dian", 102, 8000000, 4000000)
    val nager = Manager("Steven", 101, 10000000, 5000000)

    println(gawai.salary().toLong())
    println(gamer.salary().toLong())
    println(nager.salary().toLong())

    val Human = Manusia()
    val Animal = Hewan()
    val Plant = Tumbuhan()

}