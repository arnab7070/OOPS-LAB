import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
class file1{
    public static void main(String[]args){
        try{
            String filepath="input.txt";
            BufferedReader reader= new BufferedReader(new FileReader(filepath));
            String line;
            while((line=reader.readLine())!=null){
                String[]words=line.split("\\+s");
                for(String word:words){
                    System.out.println(word);
                }
            }

        }
        catch(IOException e){

        }
    }
}
