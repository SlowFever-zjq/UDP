package fanyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void print(String str){
        String binary=ConvertSystem.sexaDecToBinary(str);
        System.out.println(binary);


        String number=ConvertSystem.binaryToDecimal(binary);
        System.out.println("Denary System:");
        System.out.println(number);
        String code=ConvertAscii.convert(number);
        System.out.println("Ascii:");
        System.out.println(code);
    }

    public static void main(String[] args){
        boolean key=true;
        while(key){
            BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
            String str=null;
            try{

                str=buf.readLine();
//                System.out.println(str);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(str!=null){
                print(str);
            }
        }
    }
}