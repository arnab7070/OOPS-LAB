import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
class file3{
    public static void main(String[]args){
        try{
            String f1="input1.txt";
            String f2="input2.txt";
            String f3="output3.txt";
            BufferedReader reader1= new BufferedReader(new FileReader(f1));
            BufferedReader reader2= new BufferedReader(new FileReader(f2));
            BufferedWriter writer= new BufferedWriter(new FileWriter(f3));
            String line;
            while((line=reader1.readLine())!=null){
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
             while((line=reader2.readLine())!=null){
                 System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
      reader1.close();
            reader2.close();
            writer.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}


