import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Console;
import java.util.Scanner;
class file2{
    public static void main(String[]args){
           String filepath="output.txt";
        try( BufferedWriter writer= new BufferedWriter(new FileWriter(filepath));
            Scanner sc = new Scanner(System.in)){
         
           
                System.out.println("Type your sentences. Enter 'q' to end:");
                 while(true){
                String input=sc.nextLine();
                if("q".equals(input)){
                    break;
                }
                writer.write(input);
                writer.newLine();
            }
            
           
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}