package me.dio.calculadora

fun main(args: Array<String>) {
    println("Digite o primeiro número: ")
    val x:Float = readLine()!!.toFloat()
    //chamando readLine para receber entrada de dados pelo teclado

    println("Digite o segundo número: ")
    val y:Float = readLine()!!.toFloat()

    val resultadoSoma = soma(x, y)
    println("O resultado da soma é: $resultadoSoma")

    val resultadoSubtr = subt(x, y)
    println("O resultado da subtração é: $resultadoSubtr")

    val resultadoMult = mult(x, y)
    println("O resultado da multiplicação é: $resultadoMult")

    val resultadoDiv = div(x, y)
    println("O resultado da subtração é: $resultadoDiv")
}

//método para somar 2 números.
fun soma(x: Float, y: Float) = x+y

//método subtração de 2 números
fun subt(x: Float, y: Float) = x-y

//método multiplicação de 2 números.
fun mult(x: Float, y: Float) = x*y

//método divisão de 2 números
fun div(x: Float, y: Float) = x/y