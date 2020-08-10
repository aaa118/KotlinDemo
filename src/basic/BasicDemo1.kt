package basic

import AquariumPlant
import GreenLeafyPlant

fun main() {

    val temperature = 10
    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
    println(message)

    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println( decorations.filter {it[1] == 'l'})

    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val aquarium = Aquarium()
    aquarium.length = 200
    println(aquarium.length)

}

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
}
