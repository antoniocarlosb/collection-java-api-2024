package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionaTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }

        tarefaList.removeAll(tarefasParaRemover);
    }

    public int  obterNumeroTotalTarefas() 
    {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() 
    {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listatarefa = new ListaTarefa();
        listatarefa.adicionaTarefa("Tarefa 1");
        listatarefa.adicionaTarefa("Tarefa 2");
        listatarefa.adicionaTarefa("Tarefa 2");                
        listatarefa.adicionaTarefa("Tarefa 4");       
        System.out.println(listatarefa.obterNumeroTotalTarefas());
        listatarefa.obterDescricoesTarefas();
    }
}
