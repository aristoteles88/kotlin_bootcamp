import java.util.*

fun dayOfWeek() {
    println("What day is today?")
    val today = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when(today) {
        1 -> "Today is Sunday"
        2 -> "Today is Monday"
        3 -> "Today is Tuesday"
        4 -> "Today is Wednesday"
        5 -> "Today is Thurday"
        6 -> "Today is Friday"
        7 -> "Today is Saturday"
        else -> "Time has stopped"
    })
}

fun main(args: Array<String>){
    dayOfWeek()
}

