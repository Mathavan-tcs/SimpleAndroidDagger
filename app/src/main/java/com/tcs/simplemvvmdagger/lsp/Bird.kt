package com.tcs.simplemvvmdagger.lsp

open class Bird {
    fun fly() {
        // some thing
    }
}

class Parrot : Bird() {
    fun walk() {
        // some thing
    }
}

class Hen : Bird() {
    fun moveHen() {
        // some thing it will be impact
    }
}

class SimpleBirdTest {

    fun birdTest() {
        // test the Hen behavior
        val hen = Hen()
        hen.moveHen()
        hen.fly()

        val parrot = Parrot()
        parrot.walk()
        parrot.fly()

    }
}