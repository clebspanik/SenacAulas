programa {
  funcao inicio() {
    real distancia, consumo, precoPorLitro, litrosNecessarios, custoTotal

    escreva("Digite a distância da viagem (em km): ")
    leia(distancia)

    escreva("Digite o consumo do veículo (km por litro): ")
    leia(consumo)

    escreva("Digite o preço do combustível (R$ por litro): ")
    leia(precoPorLitro)

    litrosNecessarios = distancia / consumo
    custoTotal = litrosNecessarios * precoPorLitro

    escreva("O custo total da viagem será de R$ ", custoTotal, "\n")
  }
}