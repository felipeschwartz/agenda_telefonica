import java.util.ArrayList;

public class Apoio {

    public static ArrayList<Contatos> contato = new ArrayList<>();
    public static boolean insereContato(Contatos c) {
        contato.add(c);
        return true;
    }
}
