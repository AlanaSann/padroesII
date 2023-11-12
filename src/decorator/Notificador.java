package decorator;

import java.util.List;

import model.Curso;
import model.Disciplina;
import model.Livro;

public interface Notificador {
    public void notificar(); 
    public void setListDisciplinas(Disciplina disciplina);
    public List<Livro> getListLivros();
    public void setListLivros(Livro livro); 
    public List<Disciplina> getListDisciplinas(); 
}
