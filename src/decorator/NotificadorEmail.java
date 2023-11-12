package decorator;

import model.Curso;
import model.Disciplina;

/**
 * NotificadorEmail
 */
public class NotificadorEmail  extends NotificadorPadrao{

    public NotificadorEmail(Notificador notificador) {
        super(notificador);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void notificar( ) {
        System.out.println("EMAIL");
        notificador.notificar();
    }
}