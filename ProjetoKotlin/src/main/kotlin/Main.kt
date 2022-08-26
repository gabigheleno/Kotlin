import Cadastro
import CadastroEstabelecimento
import CadastroMedico
import CadastroUsuario

val listaCadastros = mutableListOf<Cadastro>()

fun main(args: Array<String>) {

    while(true){
        try{
            while (true){
                println("(1) - Cadastrar...")
                println("(2) - Listar Usuários")
                println("(3) - Listar Postagens")
                println("(4) - Criar Postagem")
                println("(5) - Deletar Postagem")
                println("(6) - Adicionar Comentário")
                println("(0) - Sair")
                print("Digite: ")

                when(readln().toInt()){
                    1 -> {
                        cadastroUsuario()
                    }
                    2 -> {
                        println("Listando Cadastros...")
                        listaCadastros.forEach{ cadastro ->
                            println(cadastro)
                        }
                    }
                    3 -> {
                        println("Listando Postagens...")
                        println(CadastroMedico.listarPostagens())
                    }
                    4 -> {
                        println("Criando postagens...")
                        criandoPosts()
                    }
                    5 -> {
                        println("Deletando posts...")
                        deletaPostagens()
                    }
                    6 -> {
                        println("Adicionando comentários...")
                        addComentario()
                    }
                    0 -> {
                        println("Obrigado por utilizar!")
                        break
                    }
                    else -> {
                        println("Opção inválida!")
                    }
                }

            }
            break
        }catch (e: Exception){
            println(e.message)
        }
    }
}

fun addComentario() {
    print("Insira o nome de quem irá comentar: ")
    val nome = readln()

    for(cadastro in listaCadastros){
        if(cadastro.pegaNome() == nome && cadastro is CadastroUsuario){
            print("Insira o comentário: ")
            val comentario = readln()

            print("Informe o ID do post que quer comentar: ")
            val id = readln().toInt()
            cadastro.adicionarComentario(id,comentario)
        }
    }
}

fun deletaPostagens() {
    print("Digite o nome do responsável por este post: ")
    val resp = readln()

    try {
        for (cadastro in listaCadastros) {
            if (cadastro.pegaNome() == resp && cadastro is CadastroMedico) {

                print("Digite o ID do post que será deletado: ")
                val id = readln().toInt()

                if (CadastroMedico.postagens[id].contains(resp)) {
                    cadastro.deletarPostagem(id)
                } else {
                    println("Post não pertence a este médico!")
                }

            } else if (cadastro.pegaNome() == resp && cadastro is CadastroEstabelecimento) {
                print("Digite o ID do post que será deletado: ")
                val id = readln().toInt()

                if (CadastroMedico.postagens[id].contains(resp)) {
                    cadastro.deletarPostagem(id)
                }
            } else {
                println("\nNão existe nenhum post realizado por $resp!\n")
            }
        }
    } catch (e: Exception) {
        throw IllegalArgumentException("\nNão existe nenhum post com esse ID!\n")
    }
}

fun cadastroUsuario(){
    print("Informe o nome: ")
    val nome = readln()
    print("Informe o login: ")
    val login = readln()
    print("Informe o senha: ")
    val senha = readln()
    print("Informe o telefone: ")
    val telefone = readln()

    println("Informe o tipo de cadastro: (1) Paciente (2) Medico (3) Estabelecimento")
    val opcao = readln().toInt()

    if(opcao == 1){
        print("Informe o CPF: ")
        val cpf = readln()
        val cadastro = CadastroUsuario(nome, login, senha, telefone, cpf)
        listaCadastros.add(cadastro)
    }
    else if(opcao == 2){
        print("Informe o CPF: ")
        val cpf = readln()
        print("Informe o CRM: ")
        val crm = readln()
        val cadastro = CadastroMedico(nome, login, senha, telefone, cpf, crm)
        listaCadastros.add(cadastro)
    }
    else if(opcao == 3){
        print("Informe o CNPJ: ")
        val cnpj = readln()
        val cadastro = CadastroEstabelecimento(nome, login, senha, telefone, cnpj)
        listaCadastros.add(cadastro)
    }
    else {
        println("Opção inválida!")
    }
}

fun criandoPosts(){
    print("Informe seu nome: ")
    val nome = readln()

    for(cadastro in listaCadastros){
        if( cadastro.pegaNome() == nome && cadastro is CadastroMedico){
            println("Olá, doutor(a) ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            cadastro.criarPostagem(post)
            break
        }
        else if( cadastro.pegaNome() == nome && cadastro is CadastroEstabelecimento){
            println("Olá, estabelecimento ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            cadastro.criarPostagem(post)
            break
        }
    }
}