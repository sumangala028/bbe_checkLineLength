import java.io.*;
import java.util.*;

public class checkLength{
    private int limit = 80;
  
    public checkLength(){
    }

    public  void findLineLength(String filePath) throws LengthException{
        

        try{
            File path = new File(filePath);
          
            Scanner scanner = new Scanner(path);

            while(scanner.hasNextLine()){
                //System.out.println(scanner.nextLine());

                //checks the number of characters in a line
                String line = scanner.nextLine();
                int count = line.length();

                if(count > limit){
                    throw new LengthException("Line is exceeding the limit");
                }
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }


    public static void main(String[] args){

       try{
           if(args.length > 0)
                new checkLength().findLineLength(args[0]);
       }catch(Exception e){
           e.printStackTrace();
       }

        
        
    }
}
