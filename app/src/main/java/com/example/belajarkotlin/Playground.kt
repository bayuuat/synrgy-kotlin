package com.example.belajarkotlin

import java.lang.Math.pow
import kotlin.math.pow

//fun main(){
//    val namaDepan = "Bayu"
//    val namaBelakang = "Aditya"
//    val umur = 21
//
//    println("$namaDepan " + namaDepan::class.simpleName)
//    println("$umur " +umur::class.simpleName)
//    println("$namaDepan $namaBelakang")
//
//    println("\n=======DAY 3=======\n")
//
//    var tinggiBadan = 1.75
//    var beratBadan = 90.0
//    var BMI = beratBadan/(tinggiBadan*tinggiBadan)
//
//    var keteranganBMI = if (BMI<18.5) "Kurang BB"
//    else if(18.5<BMI && BMI<=22.9) "Normal"
//    else if(23<BMI && BMI<=24.9) "Kelebihan BB"
//    else if(25<BMI && BMI<=29.9) "Obes Tkt 1"
//    else "Obes tkt 2"
//
//    println(keteranganBMI)

//    println("\n=======DAY 4=======")


//    for (i in 1..5){
//        if (i % 2 == 0){
//            return
//        }
//        println(i)
//    }

//    var arrList = mutableListOf("Andre", "Kelas", "Android")
//
//    for (i in arrList.indices){
//        if (arrList[i] == "Android"){
//            arrList.set(i, "Pemrograman Kotlin")
//        }
//        println(arrList[i])
//    }

//    var j = 0
//    while (j <= 5){
//        println(j++)
//    }

//    var x = 4
//    for (i in 0..x){
//        for (space in 1..i){
//            print(" ")
//        }
//        for (j in 0..5 ){
//            print("*")
//        }
//        println()
//    }

//    for (i in 1..5){
//        for (space in i..4){
//            print(' ')
//        }
//        for (j in 1..i){
//            print('*')
//        }
//        println()
//    }
//
//

//}

//class Hewan{
//    var jenis: String
//    var jumlahKaki: Int
//    var familia: String? = null
//
//    constructor(_jenis: String, _jumlahKaki: Int, _familia: String?) {
//        this.jenis = _jenis
//        this.jumlahKaki = _jumlahKaki
//        this.familia = _familia
//    }
//
//    constructor(_jenis: String, _jumlahKaki: Int) {
//        this.jenis = _jenis
//        this.jumlahKaki = _jumlahKaki
//    }
//}
//
//enum class Familia(var familia: Int, var deskripsi: String){
// Mamalia(1, "Menyusui"), Vertebrata(2, "Tulang Belakang"), Reptile(3, "Melata"), Bird(4, "Melayang")
//}

//fun power(x:Int, y:Int): Double {
//    return x.toDouble().pow(y.toDouble())
//}
//
//fun Int.pangkat(y: Int): Double {
//    return this.toDouble().pow(y.toDouble())
//}

fun main() {
//    println(power(2,5))
//    println(2.pangkat(5))
//
//    val poww: (Int, Int) -> Unit = {
//        x, y -> println(x.toDouble().pow(y.toDouble()))
//    }
//
//    poww(2,5)

    val gawai = Pegawai("Andrea", 100, 8000000)
    val gamer = Programmer("Dian", 102, 8000000, 4000000)
    val nager = Manager("Steven", 101, 10000000, 5000000)

    println(gawai.salary().toLong())
    println(gamer.salary().toLong())
    println(nager.salary().toLong())

}

