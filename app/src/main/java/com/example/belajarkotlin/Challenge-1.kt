package com.example.belajarkotlin

open class Segitiga(x:Int, y:Int){
    var x:Int = x
    var y:Int = y

    open fun atas(){
        var k = 0
        for (i in 1..x) {
            for (space in 1..x - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }

            println()
            k = 0
        }
    }

    fun bawah(){
        for (i in y downTo 1) {

            for (space in 1..y - i) {
                print("  ")
            }

            for (j in i..2 * i - 1) {
                print("* ")
            }

            for (j in 0..i - 1 - 1) {
                print("* ")
            }

            println()
        }
    }
}

class SegitigaAtasBawah(x: Int, y: Int) : Segitiga(x, y) {
    override fun atas(){
        var k = 0
        for (i in 1..x-1) {
            for (space in 1..x - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }

            println()
            k = 0
        }
    }
    fun atasbawah(){
        atas()
        bawah()
    }
}

fun CreateX() {
    val rows = 5
    var k = 0

    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i..2 * i - 1) {
            if (j==i) print("* ") else print("  ")
        }

        for (j in 0..i - 1 - 1) {
            if (j==i - 1 - 1) print("* ")
            print("  ")
        }

        println()
    }

    for (i in 2..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            if(k==0 || k == 2 * i - 2) print("* ") else print("  ")
            ++k
        }

        println()
        k = 0
    }

}

fun outline(){
    val rows = 5
    var k = 0

    for (i in 1..rows) {

        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            if (i<rows){
                if(k==0 || k == 2 * i - 2) print("* ") else print("  ")
            } else {
                if(k % 2 == 0) print("* ") else print("  ")
            }
            k++
        }

        println()
        k = 0
    }
}

fun main() {
    var segitiga = Segitiga(5, 5)
    segitiga.atas()
//    println()
//    segitiga.bawah()
//
//    println()
//    var segitigaAtasBawah = SegitigaAtasBawah(5, 5)
//    segitigaAtasBawah.atasbawah()
//
//    println()
//    CreateX()

    println()
    outline()
}