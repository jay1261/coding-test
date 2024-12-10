import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String str = br.readLine();
            
            if(str == null || str.isBlank()){
                break;
            }
            
            String[] splited = str.split(" ");
            
            System.out.println(Integer.parseInt(splited[0]) + Integer.parseInt(splited[1]));
        }
    }
}