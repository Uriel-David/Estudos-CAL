package david.uriel.collections

data class Funcionario(val nome: String, val salario: Double, val tipoContratacao: String) {

    override fun toString(): String =
        """
            Nome:       $nome
            Salario:    $salario
            Tipo:       $tipoContratacao
        """.trimIndent()

}
