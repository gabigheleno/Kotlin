class CadastroUsuario(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    private val cpf: String
) : Cadastro(nome, login, senha, telefone) {

    init {
        if (cpf.length == 11) {
            println("\nUsuário $nome cadastrado com sucesso!\n")
        } else {
            throw IllegalArgumentException("\nO CPF deve conter exatamente 11 números!\n")
        }
    }

    override fun toString(): String {
        return "Usuário: $nome, CPF: $cpf"
    }

    fun adicionarComentario(id: Int, comentario: String) {
        try {
            for (post in 0..CadastroMedico.postagens.size) {
                if (post == id) {

                    var postmodificado = CadastroMedico.postagens[post]
                    CadastroMedico.postagens.removeAt(post)

                    postmodificado += "\nComentários: $comentario - Autor(a): $nome"
                    CadastroMedico.postagens.add(postmodificado)
                    return
                }
            }
        } catch (e: IllegalArgumentException) {
            throw IllegalArgumentException("ID do post não encontrado nas postagens!")
        }
    }
}