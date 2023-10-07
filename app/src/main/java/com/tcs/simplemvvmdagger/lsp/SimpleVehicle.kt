package com.tcs.simplemvvmdagger.lsp

interface SimpleVehicle {
    fun moveForwardEngine()
    fun moveBackWardEngine()
}

abstract class VehicleWithEngine : SimpleVehicle {
    abstract fun startEngine()
    abstract fun stopEngine()
}

class Car1 : VehicleWithEngine() {
    override fun startEngine() {
        print("you can start the engine")
    }

    override fun stopEngine() {
        print("you can stop the engine")
    }

    override fun moveForwardEngine() {
        print("you can moveForward engine")
    }

    override fun moveBackWardEngine() {
        print("you can move backward engine")
    }
}

class BiCycle1 : SimpleVehicle {
    override fun moveForwardEngine() {
        print("you can move forward bicycle engine")
    }

    override fun moveBackWardEngine() {
        print("you can move backward bicycle engine")
    }
}