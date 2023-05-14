package miguel.schrempp.calculadorakotlinspringboot

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calculadora")
class CalculadoraController {

    @GetMapping("/somar")
    fun somar(@RequestBody calculadora: Calculadora): String? {
        val numeros = Calculadora(calculadora.n1, calculadora.n2)
        val soma = numeros.n1 + numeros.n2
        return ResponseEntity.status(200).body("O resultado da soma é: "+ soma).body
    }

    @GetMapping("/subtrair")
    fun subtrair(@RequestBody calculadora: Calculadora): String? {
        val numeros = Calculadora(calculadora.n1, calculadora.n2)
        val subtracao = numeros.n1 - numeros.n2
        return ResponseEntity.status(200).body("O Resultado da subtração é: " + subtracao).body
    }

    @GetMapping("/multiplicar")
    fun multiplicar(@RequestBody calculadora: Calculadora): String? {
        val numeros = Calculadora(calculadora.n1, calculadora.n2)
        val multiplicacao = numeros.n1 * numeros.n2
        return ResponseEntity.status(200).body("O Resultado da multiplicação é: " + multiplicacao).body
    }

    @GetMapping("/dividir")
    fun dividir(@RequestBody calculadora: Calculadora): String? {
        val numeros = Calculadora(calculadora.n1, calculadora.n2)
        val divisao = numeros.n1 / numeros.n2
        return ResponseEntity.status(200).body("O Resultado da divisão é: " + divisao).body
    }
}