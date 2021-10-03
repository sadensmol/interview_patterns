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