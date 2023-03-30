public class Error extends Exception{
     String message;
     public Error(String s){
         message=s;
     }
    public String toString() {
        return message;
    }
}
class Operations {
    public static double diviser(double a, double b) throws Error{
        if(b==0)
            throw (new Error("diviser par 0   "));
        return (a/b);
    }
}
//gestion des flux
//serialisation
