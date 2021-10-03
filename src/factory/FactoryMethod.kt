package factory

import Circle
import Rectangle
import Shape
import Triangle

/**
 * Creates objects of the same interface within a single method
 */

fun main() {
    val factory = ShapeFactory()
    factory.createShare("rectangle")!!.draw()
    factory.createShare("triangle")!!.draw()
    factory.createShare("circle")!!.draw()
}

class ShapeFactory {
    fun createShare(type:String):Shape?{
        return when(type) {
            "rectangle"->Rectangle()
            "triangle"->Triangle()
            "circle"->Circle()
            else->null
        }
    }
}
