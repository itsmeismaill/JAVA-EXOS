
import java.io.* ;
public class ExempleFile {
    ExempleFile() {
        liste(new File("d:\\"));
    }

    //banalisation du caractère spécial \
    private void liste(File dir) {
        if (dir.isDirectory() == true) {
            String fichiers[] = dir.list();
            for (int i = 0; i != fichiers.length; i++)
                System.out.println(fichiers[i]);

        } else {
            System.err.println(dir + " n'est pas un repertoire");
        }
    }

    public static void main(String args[]) {
        new ExempleFile();
    }
}