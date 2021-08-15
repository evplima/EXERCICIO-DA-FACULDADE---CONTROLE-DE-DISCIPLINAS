# EXERCICIO-DA-FACULDADE---CONTROLE-DE-DISCIPLINAS
EXERCÍCIO DA FACULDADE - MÁTERIA DE POO
EXERCÍCIO PROPOSTO: 
1) Crie uma classe chamada Disciplina, com as seguintes funcionalidades:
a. Uma disciplina é composta de 1 nome, 1 professor, e 4 notas: np1, np2, sub e exame.
b. Os campos nome e professor são obrigatórios. Os campos de notas devem ser números reais entre
0 e 10.
c. Para criar uma disciplina é necessário informa ao menos o nome da disciplina e o nome do
professor. As notas devem ser inicializadas com -1, para você poder diferenciar entre uma nota
não digitada e uma nota zero.
d. Crie métodos para:
i. Alterar o nome da disciplina e do professor;
ii. Cadastrar as notas separadamente;
iii. Consultar o valor de qualquer um dos campos;
iv. Retornar o valor da média;
v. Retornar o valor de quanto o aluno tem que tirar de exame para passar de ano (considere
o cálculo de aprovação da Unip);
vi. Listar todos os campos (toString).
2) Faça o diagrama da classe disciplina e grave-o em uma pasta docs do seu projeto.
3) Crie um programa Principal que teste sua classe Disciplina, criando algumas e testando os métodos de
retorno.
4) Crie uma tela para cadastrar Disciplinas.
5) Desafio: crie um vetor de 20 Disciplinas, e ao invés de criar variáveis de instância, guarde as disciplinas no
vetor. Na sua tela, inclua as seguintes funções;  Disciplina[] vet = new Disciplina[20];
a. Botão para listar todas as disciplinas;
b. Botão para listar quanto o aluno precisa tirar para ser aprovado em cada disciplina;
c. Campo para escolher qual disciplina quer alterar:
i. A aplicação lista os dados da disciplina na tela;
ii. O usuário altera os dados, se quiser;
iii. Quando clicar em Gravar, instancie um novo objeto e substitua na posição do anterior.
