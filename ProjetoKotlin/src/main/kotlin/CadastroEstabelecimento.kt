class CadastroEstabelecimento(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cnpj: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (cnpj.length == 14) {
            println("\nEstabelecimento $nome cadastrado com sucesso!\n")
        } else {
            throw IllegalArgumentException("\nO CNPJ deve conter exatamente 14 números!\n")
        }
    }

    fun criarPostagem(post: String) {
        var postagem = "Estabelecimento $nome postou:\n"
        postagem += post
        if (post.isNotBlank()) {
            CadastroMedico.postagens.add(postagem)
            return
        }
        println("O post não pode estar em branco!")
    }

    fun deletarPostagem(postDeletado: Int) {
        if (CadastroMedico.postagens.contains(CadastroMedico.postagens[postDeletado])) {
            CadastroMedico.postagens.removeAt(postDeletado)
            return
        }
        println("O $postDeletado não existe")
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in CadastroMedico.postagens){
            if(CadastroMedico.postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                val novaPostagem = readln()
                CadastroMedico.postagens.add(novaPostagem)
                CadastroMedico.postagens.remove(postagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        return "Estabelecimento: $nome, CNPJ: $cnpj "
    }
}