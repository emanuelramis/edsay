package org.example;

public @interface polimorfismo {
    Início

    Criar uma classe abstrata Tarefa
    Atributos:
    descricao (Texto)
    status (Texto)

    Métodos:
    Construtor: inicializa descricao e status
    Método abstrato exibirTarefa()

    Método adicionarStatus(novoStatus: Texto):
    Modifica o status da tarefa

    Criar uma subclasse TarefaSimples que herda de Tarefa
    Implementar o método exibirTarefa():
    Exibe "Tarefa simples: descricao - Status: status"

    Criar uma subclasse TarefaComTempo que herda de Tarefa
    Atributo adicional:
    prazo (Texto)

    Implementar o método exibirTarefa():
    Exibe "Tarefa com prazo: descricao - Prazo: prazo - Status: status"

    Início do programa principal:
    Criar uma lista de tarefas (tarefas)
    Criar um menu com opções:
            1 - Adicionar tarefa simples
            2 - Adicionar tarefa com prazo
            3 - Listar todas as tarefas
            4 - Alterar status de tarefa
            5 - Excluir tarefa
            6 - Sair

    Enquanto a opção escolhida não for 6:
    Exibir o menu e solicitar ao usuário uma opção

    Se a opção for 1 (Adicionar tarefa simples):
    Solicitar descrição da tarefa
    Solicitar status da tarefa
    Criar uma nova TarefaSimples com a descrição e status
    Adicionar a nova tarefa à lista de tarefas

    Se a opção for 2 (Adicionar tarefa com prazo):
    Solicitar descrição da tarefa
    Solicitar prazo da tarefa
    Solicitar status da tarefa
    Criar uma nova TarefaComTempo com a descrição, prazo e status
    Adicionar a nova tarefa à lista de tarefas

    Se a opção for 3 (Listar todas as tarefas):
    Para cada tarefa na lista de tarefas:
    Chamar tarefa.exibirTarefa() (polimorfismo - exibe de acordo com o tipo da tarefa)

    Se a opção for 4 (Alterar status de uma tarefa):
    Solicitar índice da tarefa a ser modificada
    Solicitar novo status para a tarefa
    Se o índice for válido:
    Chamar tarefa.adicionarStatus(novoStatus) para modificar o status da tarefa

    Se a opção for 5 (Excluir uma tarefa):
    Solicitar índice da tarefa a ser excluída
    Se o índice for válido:
    Remover a tarefa da lista de tarefas

    Se nenhuma opção válida for selecionada:
    Exibir mensagem de erro "Nada foi selecionado!"

    Fim do programa

            Fim

}
