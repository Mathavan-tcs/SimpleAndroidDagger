package com.tcs.simplemvvmdagger.ocp

interface ArithmeticOperation {
    fun operation(first: Int, second: Int): Int
}

class AdditionOperation() : ArithmeticOperation {
    override fun operation(first: Int, second: Int): Int {
        return first * second
    }
}

class MultiplyOperation : ArithmeticOperation {
    override fun operation(first: Int, second: Int): Int {
        return first * second
    }
}