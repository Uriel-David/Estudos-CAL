package david.uriel.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Joca", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Janaina" to 2500.0,
        "Maria" to 2000.0)

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}