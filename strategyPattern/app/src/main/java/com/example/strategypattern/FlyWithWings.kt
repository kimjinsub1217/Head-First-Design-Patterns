package com.example.strategypattern

// 실제로 날 수 있는 오리들의 나는 행동을 구현하는 클래스
class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("날고 있어요~")
    }
}