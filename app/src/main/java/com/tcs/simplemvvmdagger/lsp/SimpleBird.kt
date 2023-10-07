package com.tcs.simplemvvmdagger.lsp

open class SimpleBird {
    open fun walkBird() {
        // some thing it will be walk
    }
}

open class FlyingBird : SimpleBird() {
    fun flyBird() {
        // some bird will be fly function
    }
}

class HenBird : SimpleBird() {

    override fun walkBird() {
        super.walkBird()
        // walk function will be executed
    }

}

class ParrotBird : FlyingBird() {

    fun flyingParrot() {
    }
}

class TestBirdFunctions{

    fun testBirdFunctions(){
        // test hen bird
        val hen = HenBird()
        hen.walkBird()

        // flying bird functions
        val parrotBird = ParrotBird()
        parrotBird.flyingParrot()
        parrotBird.walkBird()

    }
}