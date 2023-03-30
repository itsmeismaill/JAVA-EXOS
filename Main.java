import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
         Dico d = new Dico();
         d.inserer(d,"ismail");
        d.inserer(d,"aya");
        d.inserer(d,"oukha");
        d.inserer(d,"test");
        System.out.println(d.existe(d,"oukha"));
        System.out.println(d.existe(d,"help"));

    }
    }