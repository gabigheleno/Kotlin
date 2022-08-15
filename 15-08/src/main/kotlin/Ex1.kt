fun main() {

    /* 1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu. */


    print("Digite a sua idade: ")
    val idade = readln().toInt()

    var ano = 2022 - idade

    println("Seu ano de nascimento é: $ano")

}