package model;

import java.util.List;

import decorator.Notificador;

public class Curso extends Produto implements Notificador{
    private List<Disciplina> listDisciplinas;
    private List<Livro> listLivros;
    
    @Override
    public List<Disciplina> getListDisciplinas() {
        return listDisciplinas;
    }
    @Override
    public void setListDisciplinas(Disciplina disciplina) {
        this.listDisciplinas.add(disciplina);
    }
    @Override
    public List<Livro> getListLivros() {
        return listLivros;
    }
    @Override
    public void setListLivros(Livro livro) {
        this.listLivros.add(livro);
    }
    @Override
    public void notificar() {
        System.out.println("padrão");
    }
 
}
