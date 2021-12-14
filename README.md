# AtividadesJavaPOO
Programas desenvolvidos em Java na matéria de Programação Orientada a Objetos


<h3> Atividade 10</h3> 
<p> Crie uma classe chamada Contagem que contenha quatro métodos com o nome “contar” utilizando
o conceito da sobrecarga. A assinatura e função de cada método aparecem descritas na tabela
em anexo. Faça também outra classe para testar o método. </p>
<img src="https://github.com/GuilhermeDeitos/AtividadesJavaPOO/blob/main/img/tabela.png">

<h3> Atividade 11</h3> 
<p>Crie uma classe chamada Senha que contenha um método chamado gerar que retorna uma senha
contendo oito caracteres numéricos. Faça também outra classe para testar o método. </p>

<h3> Atividade 12</h3> 
<p>Elabore uma classe chamada “MeusArrays” contendo dois métodos que realizam operações com arrays, conforme a descrição a seguir. Faça também outra classe para testar os métodos:

a. um método que recebe dois arrays de inteiros e um número inteiro. Pesquise se esse número inteiro existe nos dois arrays e de um retorno conforme a descrição seguinte: se o número não for encontrado em nenhum dos arrays, retorne 0; caso encontre em um dos arras, retorne 1; e caso seja localizado nos dois arrays, retorne 2.
b. um método que recebe um valor inteiro (n) e retorna um array contendo n elementos inteiros gerados randomicamente. Os valores gerados devem estar entre 0 e 1000.</p>

<h3> Atividade 13</h3> 
<p> 1 - Faça uma classe que simule o funcionamento de uma bomba d´água. A bomba possui um atributo booleano chamado “status” e os métodos “ligar” e “desligar” (ambos sem retorno). O método “ligar” coloca true em “status” e o método “desligar” coloca false em status. A bomba deve ficar ligada durante um certo intervalo de tempo (em segundos). O tempo em segundos deve ser recebido pelo método ligar. A cada segundo, apresente em tela quantos segundos faltam para a bomba ser desligada. Decorrido o tempo, o método desligar é acionado e a bomba é desligada.


2 - Crie uma classe chamada UsaBomba que utilize a classe do exercício anterior. Ela deve conter o método main e:


- instanciar uma bomba (bomba1);
- ligar o objeto bomba1 durante 5 segundos;</p>


<h3> Atividade 14</h3> 
<p>Considere a representação da classe Brinquedo na imagem em anexo. Elabore essa classe em Java contendo os métodos get e set necessários. O atributo faixaEtaria é um atributo do tipo String que deve receber apenas um dos valores seguintes: “0 a 2”, “3 a 5”, “6 a 10” e “acima de 10”. Outros valores são inválidos e não devem ser armazenados. Essa validação deve ser realizada no método setFaixaEtaria. A seguir, elabore a classe UsaBrinquedo para testar as funcionalidades da classe Brinquedo. </p>
<img src="https://github.com/GuilhermeDeitos/AtividadesJavaPOO/blob/main/img/ClasseBrinquedo.png">

<h3> Atividade 15</h3> 
<p>Crie uma hierarquia de classes com os seguintes atributos e comportamentos (ver figura em anexo), distribua as características de forma que tudo o que for comum a todos os animais fique na classe Animal.</p>
<img src="https://github.com/GuilhermeDeitos/AtividadesJavaPOO/blob/main/img/diagrama.png">

<h3> Atividade 16</h3> 
<p>Implemente uma classe que crie os 3 tipos de animais definidos na atividade remota 15 e invoque o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.</p>

<h3> Atividade 17</h3> 
<p>Implemente uma classe Veterinário que contenha um método examinar() cujo parâmetro de entrada é um Animal, quando o animal for examinado ele deve emitir um som, passe os 3 animais com parâmetro.</p>


<h3> Atividade 18</h3> 
<p>Crie uma classe abstrata Conta Bancaria que contém como atributos o numero da conta  e  o  saldo,  e  como  métodos  abstratos  sacar  e  depositar  que  recebem  um parâmetro do tipo double.  Em seguida crie as classes Conta Corrente e Conta Poupança que herdam da Conta Bancaria. A classe Conta Corrente possui um atributo limite que dá credito a  mais para o correntista caso  ele precise sacar  mais  que o saldo. Neste caso, o saldo pode ficar negativo desde que não ultrapasse o valor do limite. Contudo isso não pode acontecer na classe Conta Poupança. A classe Conta Poupança possui um atributo taxaDeOperação que é descontado sempre que um saque e um depósito são realizados. Por fim crie uma classe de teste.</p>

