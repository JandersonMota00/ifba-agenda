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

**Implementação:** A classe `AgendaTarefas` atua como o Subject. Ela mantém uma lista de `Observers` (`Logger`, `Notificador` e `InterfaceGrafica`). Quando uma nova tarefa é agendada, o `AgendaTarefasd` notifica todos os observadores, que reagem de forma independente.

- `Logger` - Informa via logs no terminal
- `Notificador` - Informa com notificação na tela, tipo um alert de navegador
- `InterfaceGrafica`- Informa criando uma página em HTML

### Padrão Command:

**Objetivo:** Encapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes requisições, enfileirar ou registrar requisições, e suportar operações desfazíveis.

**Implementação:** Cada ação programável, como "enviar e-mail", é encapsulada em uma classe que implementa a interface `Command`. A classe `CommandEnviarEmail` é um exemplo que representa a ação de enviar um e-mail. Isso torna o sistema flexível, pois novas ações podem ser adicionadas sem modificar a lógica principal.

### Padrão Strategy:

**Objetivo:** Definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis, permitindo que o algoritmo varie independentemente do cliente que o utiliza.

**Implementação:** A interface `Strategy` define o método `execute()`. As classes `StrategyImediato` e outras (que podem ser adicionadas, como `StragegyPosterior`) implementam essa interface para definir como uma tarefa será executada. A classe `Tarefa` utiliza a estratégia escolhida para executar o `Command` da tarefa, desacoplando a lógica de agendamento da lógica de execução.

## Estrutura do Projeto

```
IFBA-AGENDA

- SRC
    - COMMAND
        - Command.interface
        - CommandEnviarEmail.class
        - CommandTocarAlarme.class
    - MODELS
        - Tarefa.class
    - OBSERVER
        - AgendaTarefas.class
        - InterfaceGrafica.class
        - Logger.class
        - Notificador.class
        - Observer.interface
    - STRATEGY
        - Strategy.interface
        - StrategyImediato.class
        - StrategyPosterior.class
    App.class
- TEST
```
