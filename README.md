# Trabalho de Criação de um Sistema com Ênfase em Padrões Comportamentais
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projetos
- **Projeto:** Aplicação de Pradrôes de Projeto com Ênfase em Padrôes Comportamentais
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

## SmartAgenda: Aplicação de Padrões de Projeto
Este projeto é uma implementação do sistema "SmartAgenda" que visa demonstrar o uso prático de padrões de projeto comportamentais, como o Observer, Command e Strategy.

[A4 - SAJ-ADS08 - Aplicação de Padrões de Projeto com Ênfase em Padrões Comportamentais.pdf](https://github.com/user-attachments/files/21642468/A4.-.SAJ-ADS08.-.Aplicacao.de.Padroes.de.Projeto.com.Enfase.em.Padroes.Comportamentais.pdf)

## Integrantes do Projeto

<table>
  <tr>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/80362674?v=4" width="100px;" alt="Foto do Integrante Janderson"/><br />
      <sub><b><a href="https://github.com/JandersonMota">Janderson Mota</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/110790276?v=4" width="100px;" alt="Foto da Integrante Sarah"/><br />
      <sub><b><a href="https://github.com/">Sarah Pithon</a></b></sub>
    </td>
  </tr>
</table>

## Padrões de Projeto Utilizados

### Padrão Observer:

**Objetivo:** Permitir que vários objetos sejam notificados automaticamente sobre mudanças de estado em um objeto central.

**Implementação:** A classe _`TaskScheduler`_ atua como o Subject. Ela mantém uma lista de _`Observers`_ (como _`LoggerObserver`_ e _`NotificadorObserver`_). Quando uma nova tarefa é agendada, o 
_`TaskScheduler`_ notifica todos os observadores, que reagem de forma independente.

### Padrão Command:

**Objetivo:** Encapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes requisições, enfileirar ou registrar requisições, e suportar operações desfazíveis.

**Implementação:** Cada ação programável, como "enviar e-mail", é encapsulada em uma classe que implementa a interface _`Command`_. A classe _`EnviarEmailCommand`_ é um exemplo que representa a ação de enviar um e-mail. Isso torna o sistema flexível, pois novas ações podem ser adicionadas sem modificar a lógica principal.

### Padrão Strategy:

**Objetivo:** Definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis, permitindo que o algoritmo varie independentemente do cliente que o utiliza.

**Implementação:** A interface _`ExecutionStrategy`_ define o método _`execute()`_. As classes _`ExecucaoImediataStrategy`_ e outras (que podem ser adicionadas, como _`ExecucaoAtrasadaStrategy`_) implementam essa interface para definir como uma tarefa será executada. A classe _`TaskScheduler`_ utiliza a estratégia escolhida para executar o _`Command`_ da tarefa, desacoplando a lógica de agendamento da lógica de execução.

## Estrutura do Projeto

```
IFBA-AGENDA/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── smartagenda/
│   │   │           ├── command/
│   │   │           │   ├── Command.java
│   │   │           │   └── EnviarEmailCommand.java
│   │   │           │   
│   │   │           ├── observer/
│   │   │           │   ├── Observer.java
│   │   │           │   ├── Subject.java
│   │   │           │   ├── NotificadorObserver.java
│   │   │           │   └── LoggerObserver.java
│   │   │           │   
│   │   │           ├── strategy/
│   │   │           │   ├── ExecutionStrategy.java
│   │   │           │   └── ExecucaoImediataStrategy.java
│   │   │           │   
│   │   │           ├── chainofresponsibility/
│   │   │           │   ├── ConditionalHandler.java
│   │   │           │   └── HorarioComercialHandler.java
│   │   │           │   
│   │   │           ├── model/
│   │   │           │   ├── Task.java
│   │   │           │   └── TaskScheduler.java
│   │   │           │   
│   │   │           └── AgendaApplication.java
│   └── resources/
├── .gitignore
├── README.md
└── pom.xml
```
