package decorator;

import model.Curso;
import model.Disciplina;

public class NotificadorSMS  extends NotificadorPadrao{

    public NotificadorSMS(Notificador notificador) {
        super(notificador);
    }
    
    @Override
    public void notificar( ) {
        System.out.println("SMS");
        notificador.notificar();
    }
    
}
