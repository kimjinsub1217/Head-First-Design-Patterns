package com.example.strategypattern

class Quack : QuackBehavior {
    override fun quack() {
        println("꽥~")
    }
}