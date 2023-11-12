package decorator;

import java.util.List;

import model.Disciplina;
import model.Livro;

public abstract class NotificadorPadrao implements Notificador{
    protected Notificador notificador;
    
    public NotificadorPadrao(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void notificar() {
        System.out.println("Notificação padrão");
    }

    @Override
    public void setListDisciplinas(Disciplina disciplina) {
        notificador.setListDisciplinas(disciplina);
    }

    @Override
    public List<Livro> getListLivros() {
       return notificador.getListLivros();
    }

    @Override
    public void setListLivros(Livro livro) {
        notificador.setListLivros(livro);
    }

    @Override
    public List<Disciplina> getListDisciplinas() {
        return notificador.getListDisciplinas();
    }
    
}
