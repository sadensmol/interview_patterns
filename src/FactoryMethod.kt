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

interface Shape {
    fun draw()
}

class Rectangle : Shape {
    override fun draw() {
        println("Drawing rectangle...")
    }
}
class Triangle : Shape {
    override fun draw() {
        println("Drawing triangle...")
    }
}
class Circle : Shape {
    override fun draw() {
        println("Drawing circle...")
    }
}