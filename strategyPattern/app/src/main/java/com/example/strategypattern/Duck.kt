package com.example.strategypattern

abstract class Duck {
    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null

    abstract fun display()
    fun performFly() {
        flyBehavior?.fly()
    }

    fun performQuack() {
        quackBehavior?.quack()
    }

    fun swim() {
        println("모든 오리는 물에 떠요~ 물론 가짜 오리도 뜨긴 떠요")
    }
}