import decorator.NotificadorEmail;
import decorator.NotificadorPadrao;
import decorator.NotificadorSMS;
import model.Curso;
import model.Disciplina;

public class App {
    public static void main(String[] args) throws Exception {

        Disciplina d1= new Disciplina(90, 0);
        Disciplina d2= new Disciplina(120, 50);
        
        Curso curso = new Curso();
        NotificadorSMS sms = new NotificadorSMS(curso);

        NotificadorEmail email = new NotificadorEmail(sms);
        email.notificar();
    }
}
