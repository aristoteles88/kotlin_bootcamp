package Spice

//val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

fun main (args: Array<String>) {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )

    val mildSpices = spices.filter { it.heat < 5 }

    println("Mild Spices: ${mildSpices}")

//    var salt = Spice().makeSalt() //TODO: Como utilizar o makeSalt??
//    println("Spice name: ${spice.name}\n" +
//            "Spice heat: ${spice.heat}"
//    )
}