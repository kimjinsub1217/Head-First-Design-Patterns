package com.example.strategypattern

// 이 인터페이스는 모든 울음소리를 클래스에서 구현
interface QuackBehavior {
    fun quack()
}