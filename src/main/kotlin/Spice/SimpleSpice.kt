package Spice

class SimpleSpice() {
    var name: String = "curry"
    var spiciness: String = "mild"
    val heat: Int
        get() {
            return if(spiciness == "mild") 5 else 0
        }
}