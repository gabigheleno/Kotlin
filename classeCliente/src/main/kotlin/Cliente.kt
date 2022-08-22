class Cliente (
    var nome: String,
    var idade: Int,
    var modalidadeCompra: String
    ) {
    var clienteFiel = false

    constructor(
        nome: String,
        idade: Int,
        modalidadeCompra: String,
        clienteFiel: Boolean
    ): this(nome, idade, modalidadeCompra){
        this.clienteFiel = clienteFiel
    }

    fun modCompra(){
    println("A sua compra foi pela loja virtual ou presencial?")
        var resp = readln().toString()
        if(resp == "virtual" || resp == "Virtual"){
            println("Sua resposta foi $resp, verifique as opções do site.")
        } else {
            println("Sua resposta foi $resp, verifique as opções diretamente com a loja física.")
        }
    }

    fun fidelidade(){
        println("Possui Cartão Fidelidade?")
        var cartao = readln().toString()
        if(cartao == "s" || cartao == "sim"){
            println("Você possui frete grátis, resgate seu benefício.")
        } else {
            print("Cadastre-se no Cartão Fidelidade para obter os benefícios!")
        }
    }
}
