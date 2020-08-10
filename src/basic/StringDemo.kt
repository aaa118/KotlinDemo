package basic


fun main() {
    val arrayOfString = arrayOf("First", "Second", "Third")
    testString("test", *arrayOfString)

    val constructorDemo = ConstructorDemo("TEST")
    val fName = constructorDemo.firstname
    println(fName)
    constructorDemo.nickname = "AAA"
    println(constructorDemo.nickname)
}

fun testString(anyString: String, vararg manyStrings: String) {

    manyStrings.forEach {
        println("Hi $anyString $it")
    }


}