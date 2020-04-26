package com.hank

import java.io.File

fun main() {
//    write()
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
}

private fun write() {
//    File("output.txt").writeText("abc123")
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2st line\n")
        it.write("3st line\n")
//    File("output.txt").printWriter().use {
//        it.println("1st line")
//        it.println("2st line")
//        it.println("3st line")
    }
}