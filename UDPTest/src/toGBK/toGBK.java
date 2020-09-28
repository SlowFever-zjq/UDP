package toGBK;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class toGBK {
    public static void main(String[] args) throws IOException {
//      String str="B8 D5 B8 D5 B7 B4 B7 B4 B8 B4 B8 B4 B7 B4 B7 B4 B8 B4 B8 B4";
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = "B8 D5 B8 D5 B7 B4 B7 B4 B8 B4 B8 B4 B7 B4 B7 B4 B8 B4 B8 B4";
//        str = in.readLine();
        hexGBK(str);
    }
    // 转化十六进制编码为字符串
    public static String hexGBK(String data) throws UnsupportedEncodingException {
        System.out.println(data);
        byte[] bytes = data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        return "";
    }
}