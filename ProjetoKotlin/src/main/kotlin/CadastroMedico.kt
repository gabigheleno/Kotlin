class CadastroMedico(
    nome: String,
    login: String,
    senha: String,
    telefone: String,
    val cpf: String,
    val crm: String
) : Cadastro(nome, login, senha, telefone) {

    init{
        if(cpf.length == 11 && crm.length == 8){
            if(cpf !in CadastroUsuario.cpfsCadastrados && crm !in crmMedicosCadastrados){
                println("Médico(a) $nome cadastrado com sucesso")
                CadastroUsuario.cpfsCadastrados.add(cpf)
                crmMedicosCadastrados.add(crm)
            } else if(cpf !in CadastroUsuario.cpfsCadastrados && crm in crmMedicosCadastrados){
                throw IllegalArgumentException ("Cadastro inválido! - CRM já no sistema")
            }else if(cpf in CadastroUsuario.cpfsCadastrados && crm !in crmMedicosCadastrados){
                throw IllegalArgumentException ("Cadastro inválido! - CPF já no sistema")
            } else{
                throw IllegalArgumentException ("Cadastro inválido! - CPF e CRM já no sistema")
            }

        } else {
            throw IllegalArgumentException ("Cadastro inválido!")
        }

    }

    companion object{

        val postagens = mutableListOf<String>()
        private val crmMedicosCadastrados = mutableSetOf<String>()

        fun listarPostagens():String{
            var posts = ""
            var id = 1
            for(postagem in postagens){
                posts += "id: ${id} - "+ postagem + "\n"
                id++
            }
            return posts
        }
    }

    fun criarPostagem(post: String):String{
        var postagem = "Médico(a) $nome postou:\n"
        postagem += post
        if(post.isNotBlank()){
            postagens.add(postagem)
            return "Post de $nome Criado com sucesso"
        }
        return "O post não pode estar em branco."
    }

    fun deletarPostagem(postDeletado: Int): String?{

        if(postagens.contains(postagens.get(postDeletado))){

            postagens.removeAt(postDeletado)
            return "Post deletado com sucesso!"
        }
        return ""
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
        var retorno = "Médico(a): $nome, CRM: $crm "

        return retorno
    }

}