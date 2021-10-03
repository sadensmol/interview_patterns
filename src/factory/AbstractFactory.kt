package factory

import Shape

/**
 * Creates factories
 */

fun main() {
    val normalFactory = NormalShapeFactory()
    normalFactory.createRectangle().draw()
    normalFactory.createTriangle().draw()
    normalFactory.createCircle().draw()

    val blueFactory = BlueShapeFactory()
    blueFactory.createRectangle().draw()
    blueFactory.createTriangle().draw()
    blueFactory.createCircle().draw()
}


/**
 * Interface for all factories
 */
interface AbstractFactory {
    fun createRectangle(): Shape
    fun createTriangle(): Shape
    fun createCircle(): Shape
}

/**
 * Concrete factory implementation for  normal shapes
 */
class NormalShapeFactory : AbstractFactory {
    override fun createRectangle(): Shape = NormalRectangle()
    override fun createTriangle(): Shape = NormalTriangle()
    override fun createCircle(): Shape = NormalCircle()
}

/**
 * Concrete factory implementation for blue shapes
 */
class BlueShapeFactory : AbstractFactory {
    override fun createRectangle(): Shape = BlueRectangle()
    override fun createTriangle(): Shape = BlueTriangle()
    override fun createCircle(): Shape = BlueCircle()
}

class NormalRectangle : Shape {
    override fun draw() {
        println("Drawing normal rectangle")
    }
}

class NormalTriangle : Shape {
    override fun draw() {
        println("Drawing normal triangle")
    }
}

class NormalCircle : Shape {
    override fun draw() {
        println("Drawing normal circle")
    }
}
class BlueRectangle : Shape {
    override fun draw() {
        println("Drawing blue rectangle")
    }
}

class BlueTriangle : Shape {
    override fun draw() {
        println("Drawing blue triangle")
    }
}

class BlueCircle : Shape {
    override fun draw() {
        println("Drawing blue circle")
    }
}
