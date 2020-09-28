package UDP;

public class ConvertAscii {

    public static String convert(String number){
        String result="";
        String[] str=number.split(" ");
        for(String temp:str){
            int code;
            code = Integer.parseInt(temp, 10);
            // code = Integer.parseInt(source, 10);
            char strCode = (char) code;
            result+=strCode;
        }
        return result;
    }

}