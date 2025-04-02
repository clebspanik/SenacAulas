Se precisar de ajuda para ajustar o código abaixo de acordo com as
suas necessidades, chama a gente no WhatsApp +55 (62) 98553-6711 (Osmar)
 
Ah, e se puder, faça uma DOAÇÃO de qualquer valor para nos ajudar
a manter o site livre de anúncios. Ficaremos eternamente gratos ;-)
Nosso PIX é: osmar@arquivodecodigos.com.br 
----------------------------------------------------------------------
 
// Um programa que lê três números inteiros e mostra o maior
programa {
  funcao inicio() {
    // variáveis usadas na resolução do problema
    inteiro num1, num2, num3 
     
    // vamos solicitar os três números inteiros
    escreva("Informe o primeiro número: ")
    leia(num1)
    escreva("Informe o segundo número: ")
    leia(num2)
    escreva("Informe o terceiro número: ")
    leia(num3)
     
    // o primeiro número é o maior?
    se (num1 > num2 e num1 > num3) {
      escreva("O primeiro número é o maior")
    }
    senao {
      // o segundo número é o maior?
      se (num2 > num1 e num2 > num3) {
        escreva("O segundo número é o maior")
      }
      senao{
        // o terceiro número é o maior?
        se (num3 > num1 e num3 > num2) { 
          escreva("O terceiro número é o maior")
        }
        // os número não são diferentes
       senao {
         escreva("Os três números não são diferentes")
       }
    }
  }
}