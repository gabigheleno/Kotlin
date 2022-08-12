fun main (){

    /*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
    atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

    var num = DoubleArray(5)
    var maior: Double

    for ( i in num.indices){
        println("Digite a pontuação: ")
       val pont = readln().toDouble()
        num[i] = pont
        }
        num.forEach {digitado ->
            println(digitado)
        }
        maior = num.maxOf { vet: Double -> vet }
        println("A maior pontuação digitada foi: $maior")
        }