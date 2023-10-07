package com.tcs.simplemvvmdagger

abstract class Vehicle {
    var isEngineStarted = false
    abstract fun startEngine()
    abstract fun stopEngine()
    abstract fun moveForwardEngine()
    abstract fun moveBackwardEngine()
}

class Car : Vehicle() {
    override fun startEngine() {
        isEngineStarted = true
        print("you can start engine")
    }

    override fun stopEngine() {
        print("you can stop engine")
    }

    override fun moveForwardEngine() {
        print("you can move forward engine")
    }

    override fun moveBackwardEngine() {
        print("you can move forward engine")
    }
}

class BiCycle : Vehicle() {
    override fun startEngine() {
        TODO("Not yet implemented")
    }

    override fun stopEngine() {
        TODO("Not yet implemented")
    }

    override fun moveForwardEngine() {
        print("you can move forward engine")
    }

    override fun moveBackwardEngine() {
        print("you can move backward engine")
    }

}

