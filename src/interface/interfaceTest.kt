package `interface`

interface FishAction {
    fun eat()
}

//class Plecostomus: FishAction, FishColor {
//    override val color = "gold"
//    override fun eat() {
//        println("eat algae")
//    }
//}

class Shark: FishAction, FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }

    object GoldColor : FishColor {
        override val color = "gold"
    }

    class Plecostomus:  FishAction, FishColor by GoldColor {
        override fun eat() {
            println("eat algae")
        }
    }
}