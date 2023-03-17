import java.util.Scanner
import kotlin.system.exitProcess

fun Soma(n1: Double, n2: Double): Any {
    return n1 + n2
}

fun Subtrair(n1: Double, n2: Double): Any {
    return n1 - n2
}

fun Multiplicar(n1: Double, n2: Double): Any {
    return n1 * n2
}

fun Dividir(n1: Double, n2: Double): Any {
    return n1 / n2
}

fun main() {
    while (true) {
        val sc = Scanner(System.`in`)
        println("\n")
        println("Escolha o tipo de operação: ")
        println(
            "1 -> Somar \n" +
                    "2 -> Subtrair \n" +
                    "3 -> Multiplicar \n" +
                    "4 -> Dividir \n" +
                    "0 -> Sair"
        )
        val op = sc.nextInt()

        if (op == 0) {
            println("Saindo...")
            exitProcess(0)
        }

        println("-".repeat(50))
        println("Digite o primeiro número: ")
        val n1: Double = sc.nextDouble()

        println("Digite o segundo número: ")
        val n2: Double = sc.nextDouble()

        when (op) {
            1 -> println("A soma é: ${Soma(n1, n2)} \n" + "-".repeat(50))
            2 -> println("A subtração é: ${Subtrair(n1, n2)} \n" + "-".repeat(50))
            3 -> println("A multiplicação é: ${Multiplicar(n1, n2)} \n" + "-".repeat(50))
            4 -> println("A divisão é: ${Dividir(n1, n2)} \n" + "-".repeat(50))
            else -> println("Opção inválida")
        }
    }
}