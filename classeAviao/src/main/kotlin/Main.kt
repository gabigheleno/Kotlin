fun main() {


    println("Olá! Nosso site disponibiliza informações para o aluguel de aviões de diversos portes." +
            " Digite seu nome e veja nossas indicações: ")
    var nome = readln().toString()

    val cliente1 = Aviao(
        nome,
        0
    )

    cliente1.passageiros()

}