package Spice

class Spice (val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("Spice: $name, spiciness: $spiciness, heat: $heat")
    }

    fun makeSalt() = Spice(name = "salt")
}