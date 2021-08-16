fun getFortuneCookie(birthday: Int) : String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    val index = when (birthday) {
        in 1..4 -> 0
        in 6..8 -> 1
        in 9..10 -> 2
        13 -> 3
        in 14..18 -> 4
        in 22..25 -> 5
        in 29..31 -> 6
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[index]
}

fun getBirthday() : Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun main(args: Array<String>){
//    var fortune: String
    var fortune: String = ""
//    var index = 0
//    println("\nYour fortune is: $fortune")
//    for (i in 1..10) {
//    repeat (10) {
    while (!fortune.contains("Take it easy")) {
//        index++
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
    }
}