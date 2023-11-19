// Write a program to fire any checked exception manually using ‘throw’ keyword
import java.io.IOException;
class Prog5{
    public static void main(String[]args)throws IOException{
        System.out.println("Some statement before exception throwing");
        System.out.println("Firing the checked exception through 'throw' keyword");
        try{
        throw new IOException("hay hay meri ujaan this is a cheked exeption");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}