open class AquariumPlant(val color: String, private val size: Int) {
    fun AquariumPlant.isRed() = color == "red"    // OK
    fun AquariumPlant.isBig() = size > 50

    class GreenLeafyPlant(size: Int) : AquariumPlant("green", size) {
        fun AquariumPlant.print() = println("AquariumPlant")
        fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

        fun main() {
            val plant = GreenLeafyPlant(size = 10)
            plant.print()
            println("\n")
            val aquariumPlant: AquariumPlant = plant
            aquariumPlant.print()
        }
    }

}