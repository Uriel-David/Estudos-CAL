package david.uriel.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val janaina = Funcionario("Janaina", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, maria)
    val funcionarios2 = setOf(janaina)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("===============")
    val funcionarios3 = setOf(joao, maria, janaina)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach { println(it) }

    println("===============")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
}