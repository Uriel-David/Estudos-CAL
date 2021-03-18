package david.uriel.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val maria = Funcionario("Maria", 1000.0, "PJ")
    val janaina = Funcionario("Janaina", 4000.0, "CLT")

    val funcionarios = listOf(joao, maria, janaina)

    funcionarios.forEach { println(it) }

    println("================")
    println(funcionarios.find { it.nome == "Maria" })

    println("================")
    funcionarios.sortedBy { it.salario }
                .forEach { println(it) }

    println("================")
    funcionarios.groupBy { it.tipoContratacao }
                .forEach { println(it) }

}
