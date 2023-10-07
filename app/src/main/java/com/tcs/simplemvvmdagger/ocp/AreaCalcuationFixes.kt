package com.tcs.simplemvvmdagger.ocp

interface Shape {
    fun getArea(): Double
}

class Circle1 : Shape {

    private val PI = 2.14
    private var radius = 3

    override fun getArea(): Double {
        return PI * radius
    }
}

class Rectangle1 : Shape {
    private val width = 23
    private val height = 12

    override fun getArea(): Double {
        return (width * height).toDouble()
    }
}

class AreaFactory {

    fun getAreaOfShape(shapes: ArrayList<Shape>): Double {
        var areaFactory = 0.0.toDouble()
        for (shape in shapes) {
            areaFactory += shape.getArea();
        }
        return areaFactory
    }
}

class MainClass {
    fun showAreaCalculation() {
        val circle = Circle1()
        val rectangle = Rectangle1()
        val list = arrayListOf<Shape>(
            circle, rectangle
        )
        val areaFactory = AreaFactory().getAreaOfShape(list)
        println("Total Area of the factory-- $areaFactory")
    }
}

