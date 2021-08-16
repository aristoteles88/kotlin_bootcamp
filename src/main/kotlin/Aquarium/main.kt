package Aquarium

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("length: ${myAquarium.length} " +
            "width: ${myAquarium.width} " +
            "height: ${myAquarium.height} ")

    myAquarium.height = 80

    println("height: ${myAquarium.height} cm")

    println("Volume: ${myAquarium.volume} liters")

    val smallAquarium = Aquarium(width = 15, height = 30, length = 20)
    println("Small Aquarium Volume = ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
    println("Aquarium 2 Volume = ${myAquarium2.volume} liters and dimensions height = ${myAquarium2.height} cm, width = ${myAquarium2.width} cm and length = ${myAquarium2.length} cm")
}
fun feedFish(fish: FishAction) {
    fish.eat()
}


fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\nPlecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

