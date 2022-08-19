val estoque = mutableListOf<String>()

fun addProduto(produto: String){
    if(produto != ""){
        estoque.add(produto)
        println("Produto $produto adicionado no estoque.")
    }else{
        println("Produto inválido.")
    }
}

fun removeProduto(){

    while (true){
        println("Digite um produto para ser excluído do estoque: ")
        val produto = readln()

        if(estoque.contains(produto)){
            estoque.remove(produto)
            println("Produto $produto excluído do estoque.")
            break
        }else{
            println("O produto $produto não existe no estoque.")
        }
    }
}

fun updateProduto(){
    println("Digite o produto para ser atualizado: ")
    val produto = readln()

    if(estoque.contains(produto)){
        val posicao = estoque.indexOf(produto)
        println("Digite o novo produto para ser atualizado: ")
        estoque[posicao] = readln()
        println("Produto atualizado.")
    }else{
        println("O produto $produto não existe no estoque.")
    }
}

fun getEstoque(){
    println()
    println(estoque)
}