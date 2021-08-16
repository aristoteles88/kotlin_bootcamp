package Spices

abstract class Spices (val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {

//    init {
//        println("Spice: $name, spiciness: $spiciness, color: $color")
//    }

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor): Spices(name, spiciness, color), Grinder {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}

interface Grinder {
    fun grind()
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}

interface SpiceColor{
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer(var spice: Spices) {
    val label = spice.name
}

fun main(args: Array<String>) {
    val curry = Curry("yellow curry", "mild")
    println("color: ${curry.color}")

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)
}