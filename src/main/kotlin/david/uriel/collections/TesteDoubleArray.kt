package david.uriel.collections

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 1500.0
    salarios[2] = 750.0

    salarios.forEach {
        println(it)
    }

    println("==================")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("==================")
    val salarios2 = doubleArrayOf(1000.0, 2000.0, 1200.0)
    salarios2.sort()
    salarios2.forEach { println(it) }
}