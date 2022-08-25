class Cliente (
    var nome: String,
    var endereco: String,
    var telefone: String
) {

    private val listaCompras = mutableListOf<String>()

    init {
        checarNome()
    }

    fun checarNome() {
        if (nome == "") {
            throw Exception("Por favor, preencher o nome.")
        }
    }


    fun addProduto(produto: String) {
        if (produto != "") {
            listaCompras.add(produto)
            println("Produto $produto adicionado na Lista de Compras.")
        } else {
            println("Produto inválido.")
        }
    }

    fun removeProduto() {

        while (true) {
            println("Digite um produto para ser excluído da Lista de Compras: ")
            val produto = readln()

            if (listaCompras.contains(produto)) {
                listaCompras.remove(produto)
                println("Produto $produto excluído da Lista de Compras.")
                break
            } else {
                println("O produto $produto não existe na Lista de Compras.")
            }
        }
    }


    fun getListaCompras() {
        println()
        println(listaCompras)
    }


}