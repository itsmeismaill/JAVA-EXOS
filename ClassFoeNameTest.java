    import java.lang.reflect.Method;
    public class ClassFoeNameTest {
        public void getData(){
            System.out.println("execution getData.....");
        }
    }
     class ForNameTest{
        public static void main(String args[])throws ClassNotFoundException,InstantiationException,IllegalAccessException{
            Class loadclass=Class.forName("ClassFoeNameTest");
            System.out.println("number of methods: "+loadclass.getMethods().length);
            Method[] method=loadclass.getMethods();
            for(Method m : method ){
                System.out.println("method names : "+ m.getName());
            }
            ClassFoeNameTest obj=(ClassFoeNameTest)loadclass.newInstance();
            obj.getData();
        }
    }
    //typage dynamique en java
    //final
    //clone
    //abstract class
    //abstract
    //les interfaces
    //extend pour les class et les classes abstraits , implement c'est pour les interfaces
    // la gestion des exeptions