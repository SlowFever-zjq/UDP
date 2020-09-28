package fanyi;

public class ConvertAscii {

    public static String convert(String number){
        String result="";
        String[] str=number.split(" ");
        for(String temp:str){
            int code;
            code = Integer.parseInt(temp, 10);
            // 如果30代表是 16进制的30话，就取16
            // 如果30代表是 10进制的30话，就取10
            // code = Integer.parseInt(source, 10);
            char strCode = (char) code;
            result+=strCode;
        }
        return result;
    }
}