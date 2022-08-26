class CadastroUsuario(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    val cpf: String
) : Cadastro(nome, login, senha, telefone) {

    companion object{
        val cpfsCadastrados = mutableSetOf<String>()
    }

    init{
        if(cpf.length == 11){
            if(cpf !in cpfsCadastrados){
                println("Usuário $nome cadastrado com sucesso")
                cpfsCadastrados.add(cpf)
            }
            else{
                throw IllegalArgumentException ("CPF já cadastrado")
            }
        } else {
            throw IllegalArgumentException ("CPF inválido!")
        }

    }

    override fun toString(): String {
        return "Usuário: $nome, CPF $cpf"
    }


    fun adicionarComentario (id:Int, comentario:String):String{
        try{
            for(post in 0..CadastroMedico.postagens.size){
                if(post == id-1){

                    var postmodificado = CadastroMedico.postagens.get(post)
                    CadastroMedico.postagens.removeAt(post)

                    postmodificado += "\ncomentário: $comentario - autor: $nome"
                    CadastroMedico.postagens.add(postmodificado)
                    return "Comentário de $nome adicionado com sucesso!"
                }
            }
            return ""
        }catch (e: Exception){
            throw Exception ("ID do post não encontrado nas postagens")
        }
    }

}