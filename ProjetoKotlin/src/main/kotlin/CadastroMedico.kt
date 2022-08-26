class CadastroMedico(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cpf: String,
    private val crm: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (nome.isNotBlank() && login.isNotBlank() && senha.isNotBlank() &&
            telefone.isNotBlank() && cpf.length == 11 && crm.length == 8
        ) {
            println("\nMédico $nome cadastrado com sucesso!\n")
        } else {
            throw IllegalArgumentException("\nCPF deve conter exatamente" +
                    "11 números e o CRM exatamente 8 caracteres!\n")
        }
    }

    companion object {
        val postagens = mutableListOf<String>()

        fun listarPostagens(): String {
            var posts = ""
            for ((id, postagem) in postagens.withIndex()) {
                posts += "ID: $id - $postagem\n"
            }
            return posts
        }
    }

    fun criarPostagem(post: String) {
        var postagem = "Médico $nome postou:\n"
        postagem += post
        if (post.isNotBlank()) {
            postagens.add(postagem)
            return
        }
        println("O post não pode estar em branco!")
    }

    fun deletarPostagem(postDeletado: Int) {
        if (postagens.contains(postagens[postDeletado])) {
            postagens.removeAt(postDeletado)
            return
        } else {
            println("O $postDeletado não existe!")
        }
    }

    /*
    fun editarPostagem(id: Int){
        for (postagem in postagens){
            if(postagens.indexOf(postagem) == id){
                print("Digite o novo post: ")
                var novaPostagem = readln()
                novaPostagem += "(editado)"
                //postagens.add(novaPostagem)
                postagens.remove(postagem)
                this.criarPostagem(novaPostagem)
                break
            }
        }
    }
    */

    override fun toString(): String {
        return "Médico: $nome, CRM: $crm "
    }
}