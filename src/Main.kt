class Car(val brand: String, val model: String, var speed: Int) {

    fun showDetails() {
        println("Car: $brand $model running at $speed km/h")
    }

    fun accelerate() {
        speed += 10
        println("Accelerated! Speed: $speed km/h")
    }
}

fun main() {
    val myCar = Car("Tesla", "Model S", 100)
    myCar.showDetails()
    myCar.accelerate()
}
