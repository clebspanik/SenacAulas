programa {
  funcao inicio() 
  
  {
    inteiro idade, meses, dias, anos

    escreva("Digite quantos anos você tem: ")
    leia (anos)
    escreva("Digite quantos meses se passaram após seu aniversário: ")
    leia (meses)
    escreva ("Digite quantos dias se passaram após a data de seu aniversário: ")
    leia (dias)

    idade = (anos * 365) + (meses * 30) + dias

    escreva ("A idade em dias é:" , idade)

  }
}
