package com.example.strategypattern

fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()
    mallard.display()
}

