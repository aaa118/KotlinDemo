fun main() {
//    arraysDemo()
    listDemo()

}

private fun arraysDemo() {
    val things = arrayOf("Java", "kotlom", "tesing")

    things.forEach {
        println(it)
    }

    things.forEach { thing ->
        println(thing)
    }


    things.forEachIndexed { index, s ->

        println(s.length)
    }
    things.forEachIndexed { _, thing ->
        println(thing)

    }
}

private fun listDemo() {
    val things = listOf("Java", "kotlom", "tesing")

    things.forEach {
        println(it)
    }

    things.forEach { thing ->
        println(thing)
    }


    things.forEachIndexed { index, s ->

        println(s.length)
    }
    things.forEachIndexed { _, thing ->
        println(thing)

    }

}