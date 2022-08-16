fun main() {

    /* 1- Faça um programa que receba três inteiros e diga qual deles é o maior. */

    println("Digite o primeiro número inteiro: ")
    var num1 = readln().toInt()

    println("Digite o segundo número: ")
    var num2 = readln().toInt()

    println("Digite o terceiro número: ")
    var num3 = readln().toInt()

    if (num1 >= num2 && num1 >= num3){
        println("O maior número digitado é: $num1")

    } else if (num2 >= num3 && num2 >= num1){
        println("O maior número digitado é: $num2")

    } else if (num3 >= num1 && num3 >= num2){
        println("O maior número digitado é: $num3")
    }

}