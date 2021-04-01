
class GreenLeafyPlant(size: Int) : AquariumPlant("green", size) {
    fun AquariumPlant.print() = println("AquariumPlant")
    fun GreenLeafyPlant.print() = println("GreenLeafyPlant")
    fun print() = println("AquaPlant")

    suspend fun testCorutiner(): String{
        Thread.sleep(2000)
        return "Test"

    }


}