# TRABALHO POO
Painel de Controle da Oficina
Nosso projeto apresenta um painel de controle de um oficina que tem como funcionalidade o cadastro de clientes e mecânicos, assim como a opção de visualização dos cadastros deles. Os dados presentes nas classes do cliente e do mecânico apresentam informações como: Nome, número de telefone, código de serviço e da peça, CPF, orçamento do cliente e salário do mecênico e a marca do veículo registrado.

Em muitas das classses usamos o metodo toString(), um polimorfismo de sobrescrição e coerção. Sobrescrição por conta da assinatura ser a mesma em diferentes classes, e Coerção, por estar fazendo Downcasting de outros elementos, como inteiros, Strings, fluatuantes.

Também praticamente todas as classes temos gets e sets, as quais servem de encapsulamento do programa.



Classe Operator:
-aux: int
+CadastroCliente(): void
+CadastroMecanico(): void
+VisualizarCliente(): String
+VisualizarMecanico(): String
+CadastrarServiços(): String
+VisualizarServiços(): String
+Sair

Essa classe, será a main do programa, onde as chamadas de todos metodos será realizada.
Ao executar o programa, o usuario é oferido todas essas opções, com numeros atrelados a ele, com as funções "cadastrar" servindo para armazenar o usuario no banco de dados, e as visualizar para listar todos os usuarios cadastrados.


Abaixo segue a explicação em tópicos dos métodos, e classes do nosso código:

Classe OrdemdeServiço:

ela terá os seguintes elementos:
-tempo_realizacao: String
-manutecao: String
-pecas_substituidas: String
-servicos: String
-data: String
-mecanico: Mecanico
-codigo: long
-preco: double
-cliente: Cliente

Classe com os especificos de cada serviço que sera feito no carro, com destaque nos elementos cliente, e mecanico, pois todo serviço, tera apenas um carro, cliente, e serviço atrelado à ele.


Classe Carro:
-marca: String
-ano_fabricação: int
-ano_modelo: int
-quilometragem: float
-combustivel: float

Sendo uma classe filha de operator, esses elementos serão atribuidos para identificar o carro que sera feito.

Classe Pessoa :

#nome: String
#numero_telefone: String
#CPF: String
+gets e sets: void
+ToString(): String

Sendo agregada pela classe carro, e agregando a classe Dados, além de ser a classe mãe de Cliente, e Mecanco sendo chamada pela classe Operator para ser executada e atrelada os valores, e atribuindo nome, CPF, telefone.

Classe Mecanico:
-salario: double

Classe filha, alem dos elementos da mãe, sera atrelado um salário ao mecanico.

Classe cliente:
-orçameto: float

Classe filha, alem dos elementos da mãe, sera atrelado um orçamento possivel do cliente.

Classe Dados:
com ela tera o ArrayList, que ira armazenar os dados postos do usuario para cada cliente.
















