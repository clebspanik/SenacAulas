programa {
  funcao inicio() {
    real primeiroNumero, segundoNumero, terceiroNumero

    escreva("Digite o primeiro número: ")
    leia(primeiroNumero)

    escreva("Digite o segundo número: ")
    leia(segundoNumero)

    escreva("Digite o terceiro número: ")
    leia(terceiroNumero)

    se (primeiroNumero == segundoNumero e segundoNumero == terceiroNumero)
      escreva("Os três números são iguais.\n")
    senao se (primeiroNumero >= segundoNumero e primeiroNumero >= terceiroNumero)
      escreva("O Primeiro Número é o maior.\n")
    senao se (segundoNumero >= primeiroNumero e segundoNumero >= terceiroNumero)
      escreva("O Segundo Número é o maior.\n")
    senao
      escreva("O Terceiro Número é o maior.\n")
  }
}