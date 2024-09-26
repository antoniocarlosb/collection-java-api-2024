package Ordernacao;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdernacaoPessoa {

    private List<Pessoa> listPessoa;

    public OrdernacaoPessoa() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);
        Collections.sort(pessoasPorAltura, new ComparatorPorAultura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdernacaoPessoa ordernacaoPessoa = new OrdernacaoPessoa();
        
        ordernacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordernacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordernacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordernacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordernacaoPessoa.ordenarPorIdade());
        System.out.println(ordernacaoPessoa.ordenarPorAltura());
                
        
    }
}
