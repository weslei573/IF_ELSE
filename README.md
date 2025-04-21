## Operadores de comparação
Na tabela abaixo, comparamos se determinada variável é maior do que um valor, se é diferente, se é igual, se alguma condição está verdadeira, ou se é uma condição booleana=. Existem diversas formas de comparar para que a expressão do bloco condicional retorne como verdadeira ou falsa.

![image](https://github.com/user-attachments/assets/f367a3b1-bd0a-4990-b4e9-fded6dd56abb)

referência imagem: https://www.draddx.com/2021/01/algoritmos-estruturas-condicionais.html

## Operadores lógicos AND e OR
* Também temos a possibilidade de combinar condições e testar em conjunto se uma ou outra é verdadeira. Utilizando, por exemplo, o operador lógico AND, as duas condições testadas precisam ser verdadeiras para entrarmos no bloco desejado.

* Por outro lado, se utilizarmos o operador OR, que significa "ou um caso ou outro", basta que uma das condições seja verdadeira para entrarmos no bloco.

![a8d007e9-517d-4c1d-ace7-94fad890eaa6](https://github.com/user-attachments/assets/6e8410a8-9438-49e9-833a-6a218861a550)

referência imagem: https://www.passeidireto.com/arquivo/42957246/operadores-logicos-e-matematicos-java

Já se precisar comparar variáveis, podemos utilizar o método equals, que é responsável por comparar o conteúdo das strings. Isso é bem importante, pois o operador == compara referências, enquanto equals compara o valor real. 
* Exemplo:

```
String a = "Java";
String b = "Java";
if(a.equals(b)) {
    System.out.println("As Strings são iguais");
}
```
## Agora, você está preparado para:

* Utilizar condicionais ( if, else, else if ) para tomar decisões em seus programas, controlando o fluxo de execução com base em condições específicas.
* Aplicar operadores relacionais ( >, <, ==, >=, <= ) para comparar valores e tomar decisões.
* Explorar operadores lógicos ( &&, || ) para combinar múltiplas condições e criar verificações para o seu projeto.
