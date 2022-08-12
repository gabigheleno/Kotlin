fun main (){

    /* Informa se o número é par ou ímpar */

       var numero: Int

        println("Digite um número inteiro: ")
        numero = readln().toInt()

        if (numero % 2 == 0) {
            println("Número par")
        }
        else {
            println("Número ímpar")
        }

        // Informa se o numero é positivo ou negativo

        if (numero >= 0) {
            println("Número positivo")
        }
        else {
            println("Número negativo")
        }

    }




