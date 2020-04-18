package com.hank

fun main() {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
}

//class Person{
//    於java package中 paPerson.class檔內已存在Person class
//    因kotlin與JAVA可以共用所以即使是在kotlin中也不可以出現相同名稱之class
//}

class Human {
    fun hello(){
        println("Hello kotlin")
    }
}