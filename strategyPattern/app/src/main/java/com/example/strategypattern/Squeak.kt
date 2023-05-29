package com.example.strategypattern

class Squeak : QuackBehavior {
    override fun quack() {
        println("삑!")
    }

}