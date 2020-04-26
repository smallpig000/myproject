package com.hank.kotlin

import java.io.File
import java.io.IOException

fun main() {
    val mcDonalds = McDonalds()
    mcDonalds.printMenu()
}

class McDonalds() {
    var menu: MutableMap<String, Item> = mutableMapOf()

    init {
        try {
            File("mcdonalds.txt").bufferedReader().lines().forEach {
                val tokens = it.split(",")
                var item = Item(
                    tokens[0],
                    tokens[1],
                    tokens[2].toInt(),
                    tokens[3].toInt()
                )
                menu.put(item.id, item)
            }
        } catch (e: IOException) {
            e.printStackTrace();
            System.out.println("讀取menu失敗");
        }
    }

    fun printMenu() {
        menu.entries.forEach {
            println(it.value.toString())
        }
    }
}

class Item(var id: String, var name: String, var calorie: Int, var price: Int) {
    override fun toString(): String {
        return "$id\t$name\t$calorie\t$price"
    }
}