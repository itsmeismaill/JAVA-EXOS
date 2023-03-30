import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Dossier {
    File directory;

    public Dossier(String nomRep) {
        directory = new File(nomRep);
        if (!directory.exists()) {
            if (directory.mkdir())
                System.out.println("dossier cree");
            else {
                System.out.println("probleme de creation");
                System.exit(1);
            }

        } else {
            System.out.println("le repertoiir exist");
        }

    }

    public boolean touch(String nomFich) throws IOException {
        File fich = new File(directory, nomFich);
        return (fich.createNewFile());
    }

    public boolean creeDossier(String nomRep) {
        File Dossier = new File(directory, nomRep);
        if (!Dossier.exists()) {
            if (Dossier.mkdir())
                System.out.println("dossier cree");
            else {
                System.out.println("probleme de creation");
                System.exit(1);
            }

        } else {
            System.out.println("le repertoire exist");
        }
        return false;
    }

    public boolean supprimer(String filename) {
        File dossier = new File(filename);
        if (dossier.delete()) {
            System.out.println(filename + "est supprimer");
        } else System.out.println(filename + "n'existe pas");
        return false;
    }

    public static void listerRepertoire(File repertoire) {
        if (repertoire.isDirectory()) {
            File[] fichiers = repertoire.listFiles();
            for (File fichier : fichiers) {
                listerRepertoire(fichier);
            }
        } else {
            System.out.println(repertoire.getPath());
        }
    }

    public void menu() throws IOException {
        System.out.println("----------Votre menu----------");
        System.out.println("pour cree un repertoire taper 1");
        System.out.println("pour cree un fichier taper 2");
        System.out.println("pour supprimer un repertoire taper 3");
        System.out.println("pour lister un repertoire taper 4");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
            System.out.println("entrer 1 , 2 , 3 ou 4");
        } else {
            switch (choice) {
                case 1:
                    System.out.println("entrer le nom de repertoire que vous voulez creer");
                    String nomrep=sc.nextLine();
                    creeDossier(nomrep);
                    break;
                case 2:
                    System.out.println("entrer le nom de fichier que vous voulez creer");
                    String nomfich=sc.nextLine();
                    touch(nomfich);
                    break;
                case 3 :
                    System.out.println("entrer le nom de repertoire que vous voulez supprimer");
                    String nomrepsupp=sc.nextLine();
                    supprimer(nomrepsupp);
                    break;
                default:
            }
        }
    }
}

//ajouter lister fonction recursive (cours)
