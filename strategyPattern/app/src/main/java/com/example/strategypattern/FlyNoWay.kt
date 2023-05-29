package com.example.strategypattern

// 날 수 없는 오리들의 나는 행동을 구현한 클래스
class FlyNoWay : FlyBehavior {
    override fun fly() {
        println("못 날아요~")
    }

}