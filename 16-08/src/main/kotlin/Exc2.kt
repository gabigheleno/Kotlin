fun main() {

    // 2- Faça um programa que entre com três números e coloque em ordem crescente.

    println("Digite o primeiro número inteiro: ")
    var num1 = readln().toInt()

    println("Digite o segundo número: ")
    var num2 = readln().toInt()

    println("Digite o terceiro número: ")
    var num3 = readln().toInt()

    if (num1 <= num2 && num2 <= num3)
    {
        println("A ordem crescente: é $num1, $num2 e $num3")
    }
    else if (num1 <= num3 && num3 <= num2)
    {
        println("A ordem crescente: é $num1, $num3 e $num2")
    }
    else if (num2 <= num1 && num1 <= num3)
    {
        println("A ordem crescente: é $num2, $num1 e $num3")
    }
    else if (num2 <= num3 && num3 <= num1)
    {
        println("A ordem crescente: é $num2, $num3 e $num1")
    }
    else if (num3 <= num1 && num1 <= num2)
    {
        println("A ordem crescente: é $num3, $num1 e $num2")
    }
    else /* num3 <= num2 && num2 < num1 */
    {
        println("A ordem crescente: é $num3, $num2 e $num1")
    }
}