fun main (){

    /* 6- Escrever um programa que receba vários números inteiros no teclado.
    E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
     */


    var soma = 0
    var cont = 0

    do {
        println("Digite um número, para sair digite 0: ")
        var num = readln().toInt()

        if(num % 3 == 0 && num != 0)
            soma+=num
            cont++

    } while (num != 0)
        var media = soma / cont
        println("A média dos números múltiplos de 3 é: $media")
}