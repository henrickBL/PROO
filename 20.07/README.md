Crie uma classe denominada Elevador para armazenar as informaçoõ es de um elevador dentro
de um preédio. A classe deve armazenar um nome (ou identificador) para o elevador, o andar
atual (térreo = 0), total de andares no preédio (desconsiderando o teérreo), capacidade do
elevador e quantas pessoas estaõo presentes nele. A classe possui dois construtores:


- Um que não recebe nada como parâmetro e inicializa a capacidade do elevador como 6,
o andar atual como 0 e o total de andares como 5;
- Um que deve receber como paraâmetros: a capacidade do elevador e o total de andares
no preédio (os elevadores sempre começam no teérreo e vazio);


A classe deve também disponibilizar os seguintes métodos:

- entrar: acrescenta uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
- sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
- subir: para subir um andar (não deve subir se já estiver no último andar);
- descer: para descer um andar (não deve descer se já estiver no térreo);


Encapsular todos os atributos da classe (criar os métodos sets e gets). Por que é importante aplicar o
encapsulamento nesta classe?
Criar uma classe principal que faça a criação de 3 elevadores do prédio e apresente um menu para
que o usuário escolha qual operação será executada.