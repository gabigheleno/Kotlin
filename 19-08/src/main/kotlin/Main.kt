fun main() {
    /* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
        trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
        programa deverá atender as seguintes funcionalidades:
        Armazenar dados da List
        Remover dados da list;
        Atualizar dados da list.
        Apresentar todos os dados da list. */

    while (true) {
        println("Digite a opção desejada:")
        println("1 - Adicionar produto no estoque")
        println("2 - Remover produto do estoque")
        println("3 - Atualizar produto no estoque")
        println("4 - Exibir produtos do estoque")
        println("5 - Sair")
        println()
        println("Opção: ")
        when (readln().toInt()) {
            1 -> {
                println("Digite um produto: ")
                val produto = readln()
                addProduto(produto)
            }
            2 -> removeProduto()
            3 -> updateProduto()
            4 -> getEstoque()
            5 -> break
            else -> println("Opção Inválida")
        }
    }
}