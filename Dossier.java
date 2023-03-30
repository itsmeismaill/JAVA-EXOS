import java.io.File;
import java.io.IOException;

public class Dossier {
    File directory;
    public Dossier(String nomRep){
         directory = new File(nomRep);
        if(!directory.exists()){
            if (directory.mkdir())
                System.out.println("dossier cree");
            else {
                System.out.println("probleme de creation");
                System.exit(1);
            }

        }
        else {
            System.out.println("le repertoiir exist");
        }

    }
    public boolean touch(String nomFich) throws IOException {
        File fich = new File(directory , nomFich);
        return (fich.createNewFile());
    }
    public boolean creeDossier(String nomRep){
       File Dossier=new File("D:\\directory",nomRep);
        if(!Dossier.exists()){
            if (Dossier.mkdir())
                System.out.println("dossier cree");
            else {
                System.out.println("probleme de creation");
                System.exit(1);
            }

        }
        else {
            System.out.println("le repertoire exist");
        }
        return false;
    }
    public boolean supprimer(String filename){
       File dossier = new File (filename);
        if(dossier.delete()){
            System.out.println(filename+"est supprimer");
        }
        else System.out.println(filename+"n'existe pas");
        return false;
    }
}

//ajouter lister fonction recursive (cours)
