import java.util.*
import kotlin.system.exitProcess

fun soma(n1: Double, n2: Double): Any {
    return n1 + n2
}

fun subtrair(n1: Double, n2: Double): Any {
    return n1 - n2
}

fun multiplicar(n1: Double, n2: Double): Any {
    return n1 * n2
}

fun dividir(n1: Double, n2: Double): Any {
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
            1 -> println("A soma é: ${soma(n1, n2)} \n" + "-".repeat(50))
            2 -> println("A subtração é: ${subtrair(n1, n2)} \n" + "-".repeat(50))
            3 -> println("A multiplicação é: ${multiplicar(n1, n2)} \n" + "-".repeat(50))
            4 -> println("A divisão é: ${dividir(n1, n2)} \n" + "-".repeat(50))
            else -> println("Opção inválida")
        }
    }
}