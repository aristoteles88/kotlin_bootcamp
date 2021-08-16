import java.util.*


fun randomDay(): String {
    val week = listOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Sunday" -> "plankton"
        "Monday" -> "flakes"
//        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
//        "Saturday" -> "lettuce"
        else -> "fasting"
    }
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shoulChangeWater(day)){
        println("Change the water today")
    }

    dirtyProcessor()
}

var dirty = 20

val waterFilter: (Int) -> Int = {dirty -> dirty/2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty) { dirty -> dirty + 50}
}

fun getDirtySensorReading() = 20
fun shoulChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()
) : Boolean {

    fun isTooHot (temperature: Int) = temperature > 30
    fun isDirty (dirty: Int) = dirty > 30
    fun isSunday (day: String) = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}


fun main(args: Array<String>) {
    println("Hello, ${args[0]}!")
    feedTheFish()
}

