package com.example.strategypattern

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("...")
    }
}