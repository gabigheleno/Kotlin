fun main() {

    println("Informe seu nome: ")
    var nome = readln()

    println("Informe a sua idade: ")
    var idade = readln(). toInt()

    println("Você será questionado sobre a modalidade da sua compra, digite sim para continuar")
    var modalidadeCompra = readln()

    val cliente1 = Cliente (nome, idade, modalidadeCompra)

    cliente1.modCompra()

    cliente1.fidelidade()





}