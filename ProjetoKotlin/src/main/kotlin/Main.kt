import Cadastro
import CadastroEstabelecimento
import CadastroMedico
import CadastroUsuario

val listaCadastros = mutableListOf<Cadastro>()

fun main() {

    while (true) {
        try {
            while (true) {
                println("(1) - Cadastrar usuário")
                println("(2) - Listar usuários")
                println("(3) - Listar postagens")
                println("(4) - Criar postagem")
                println("(5) - Deletar postagem")
                println("(6) - Adicionar comentário")
                println("(0) - Sair")
                print("Selecione uma opção: ")

                when (readln()) {
                    "1" -> cadastroUsuario()
                    "2" -> {
                        println("\nListando Cadastros...")
                        listaCadastros.forEach { cadastro ->
                            println()
                            println(cadastro)
                        }
                    }
                    "3" -> {
                        println("\nListando Postagens...")
                        println(CadastroMedico.listarPostagens())
                    }
                    "4" -> {
                        println("Criando postagens!")
                        criandoPosts()
                    }
                    "5" -> {
                        println("Deletando postagens...")
                        deletaPostagens()
                    }
                    "6" -> {
                        println("Adicionando comentários!")
                        addComentario()
                    }
                    "0" -> {
                        println("Obrigado por utilizar!")
                        break
                    }
                    else -> println("Opção Inválida!")
                }
            }
            break
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

fun addComentario() {
    print("Insira o nome de quem irá comentar: ")
    val nome = readln()

    for (cadastro in listaCadastros) {
        if (cadastro.pegaNome() == nome && cadastro is CadastroUsuario) {
            print("Informe o comentário: ")
            val comentario = readln()

            print("Informe o id do post que quer comentar: ")
            val id = readln().toInt()
            cadastro.adicionarComentario(id, comentario)
        } else {
            println("Usuário não encontrado!")
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

fun cadastroUsuario() {

    println()
    print("Informe o nome: ")
    val nome = lerDados()

    print("Informe o login: ")
    val login = lerDados()

    print("Informe o senha: ")
    val senha = lerDados()

    print("Informe o telefone: ")
    val telefone = lerDados()

    println("Informe o tipo de cadastro: (1) Paciente (2) Medico (3) Estabelecimento")

    when (readln()) {
        "1" -> {
            print("Informe o CPF: ")
            val cpf = readln()
            val cadastro = CadastroUsuario(nome, login, senha, telefone, cpf)
            listaCadastros.add(cadastro)
        }
        "2" -> {
            print("Informe o CPF: ")
            val cpf = readln()
            print("Informe o CRM: ")
            val crm = readln()
            val cadastro = CadastroMedico(nome, login, senha, telefone, cpf, crm)
            listaCadastros.add(cadastro)
        }
        "3" -> {
            print("Informe o CNPJ: ")
            val cnpj = readln()
            val cadastro = CadastroEstabelecimento(nome, login, senha, telefone, cnpj)
            listaCadastros.add(cadastro)
        }
        else -> println("Opção inválida!")
    }
}

fun criandoPosts() {
    print("Informe o seu nome: ")
    val nome = readln()

    for (cadastro in listaCadastros) {
        if (cadastro.pegaNome() == nome && cadastro is CadastroMedico) {
            println("Olá doutor(a) ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            cadastro.criarPostagem(post)
        } else if (cadastro.pegaNome() == nome && cadastro is CadastroEstabelecimento) {
            println("Olá estabelecimento ${cadastro.pegaNome()}")
            print("Insira sua postagem: ")
            val post = readln()
            cadastro.criarPostagem(post)
        } else {
            println("Dados não encontrados!")
        }
    }
}

fun lerDados(): String {
    val dadoLido = readln()

    if (dadoLido.isBlank())
        throw IllegalArgumentException("\nNenhum dos dados pode estar em branco!\n")

    return dadoLido
}