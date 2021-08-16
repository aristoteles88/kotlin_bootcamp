fun whatShouldIDo(mood: String, weather: String = "sunny", temperature: Int = 24) : String {

    fun isHappy (mood: String) = mood == "happy"
    fun isSunny (weather: String) = weather == "sunny"
    fun isTemperatureOk (temperature: Int) = temperature in 1..34

    return when {
        isHappy(mood) && isSunny(weather) -> "Go for a walk"
        !isHappy(mood) && !isSunny(weather) && !isTemperatureOk(temperature) -> "Stay in bed"
        !isTemperatureOk(temperature) -> "Go swimming"
        else -> "Stay home and read"
    }
}

fun main(args: Array<String>) {
    print("What is your mood: ")
    val mood = readLine()
    println(whatShouldIDo(mood = mood!!, weather = "rainy"))
}