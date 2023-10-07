package com.tcs.simplemvvmdagger.ocp

class Circle(
    val radius: Int,
    val pi: Double = 2.14,
)

class Rectangle(
    val length: Int,
    val width: Int,
)

class AreaCalculation {

    fun getAreaCalculation(shapes: ArrayList<Any>) {
        var areaOfShape: Int = 0
        for (shape in shapes) {
            if (shape is Circle) {
                val circle = shape as Circle
                areaOfShape = (circle.radius * circle.pi).toInt()
            } else if (shape is Rectangle) {
                val rectangle = shape as Rectangle
                areaOfShape = (rectangle.length) * (rectangle.width)
            } else {
                throw RuntimeException("un supported shape exceptopns")
            }
        }
    }
}