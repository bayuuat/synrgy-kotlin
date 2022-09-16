package com.example.belajarkotlin

fun ArrayChallenge(arr: Array<Int>): Int {

    var result:Int = 0
    for (i in arr.indices){
        for (j in arr.indices){
            if (j > i){
                if ((arr[j] - arr[i]) > result){
                    result = arr[j] - arr[i]
                } else if (result<=0) {
                    result = -1
                }
            }
        }
    }

    return result
}

fun readLine1(): Array<Int> = arrayOf(44, 30, 24, 32, 35, 30, 40, 38, 15)
fun readLine2(): Array<Int> = arrayOf(10, 9, 8, 2)



fun formatNumber(phone: String): String{

    var result = phone.replace("[^A-Za-z0-9 ]".toRegex(), "").replace("\\s".toRegex(), "")

    if(result[0] == '0'){
        result = result.replaceRange(0,1, "62")
    }

    return result
}

fun readLine3() = "0851-6231-7243"
fun readLine4() = "0877 6431 7123"
fun readLine5() = "+62877 6294 2312"



fun isAnagram(a: String, b: String): Boolean{
    if (a.length != b.length) {
        return false
    }

    val strArray1 = a.toCharArray()
    val strArray2 = b.toCharArray()

    strArray1.sort()
    strArray2.sort()

    return String(strArray1) == String(strArray2)
}



fun main() {
    println("=====Soal 1=====")
    println(ArrayChallenge(readLine1()))
    println(ArrayChallenge(readLine2()))

    println("\n=====Soal 2=====")
    println(formatNumber(readLine3()))
    println(formatNumber(readLine4()))
    println(formatNumber(readLine5()))

    println("\n=====Soal 3=====")
    println(isAnagram("mycar", "camry"))
    println(isAnagram("Hello", "hello"))
    println(isAnagram("anagram", "margana"))
    println(isAnagram("Raden", "Denah"))
}

