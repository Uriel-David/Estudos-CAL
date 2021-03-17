package david.uriel.collections

fun main() {
    val nomes = Array(5) {""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Joca"
    nomes[3] = "Janaina"

    for(nome in nomes) {
        println(nome)
    }

    println("============")
    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("============")
    val nomes2 = arrayOf("Juniper, Pietro, Paulo, Marine")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}