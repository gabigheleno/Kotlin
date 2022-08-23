fun main() {

    /* Criar uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
       nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

     A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
     Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
     Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */

    try {

        print("Cadastre o seu nome: ")
        val nome = readln()

        print("Cadastre seu endereço: ")
        val end = readln()

        print("Cadastre seu telefone: ")
        val tel = readln()

        val cliente = Cliente(nome, end, tel)


        while (true) {
            println("Digite a opção desejada:")
            println("1 - Adicionar produto na Lista de Compras")
            println("2 - Remover produto da Lista de Compras")
            println("3 - Exibir produtos da Lista de Compras")
            println("4 - Sair")
            println()
            println("Opção: ")
            val opc = readln().toInt()

            when (opc) {
                1 -> {
                    println("Digite o produto para add: ")
                    val produto = readln()
                    cliente.addProduto(produto)
                }
                2 -> cliente.removeProduto()
                3 -> cliente.getListaCompras()
                4 -> break
                else -> println("Opção Inválida")
            }
        }

    } catch (e: Exception) {
        println(e.message)
    }
}