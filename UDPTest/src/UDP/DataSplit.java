package UDP;

import UDP.print.*;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class DataSplit {

    public DataSplit(String sever) throws UnsupportedEncodingException {
            //        System.out.println(sever)
            String s1 = sever.substring(0,15);
//        截取报文长度
            String s2 = sever.substring(15,21);
//        截取用户地址
            String s3 = sever.substring(21,30);
//        截取信息类别
            String s4 = sever.substring(30,33);
//        截取发信方地址
            String s5 = sever.substring(33,42);
//        截取时间h。。。
            String s6h = sever.substring(42,45);
//        String s6h = sever.substring(0,3);
//        截取时间m
            String s6m = sever.substring(45,48);
//        String s6m = sever.substring(0,3);
//        截取发送长度
            String s7 = sever.substring(48,54);
//        截取发送方式
            String s8 = sever.substring(54,57);
//        电文内容
            String s9 = sever.substring(57,132);
//        截取发送内容
            String s10 = sever.substring(132,sever.length()-6);
//        截取标志
            String s11 = sever.substring(sever.length()-6,sever.length()-3);
//        截取校验和
            String s12 = sever.substring(sever.length()-3,sever.length());

//      报文解析
            new HextoASCII(s1);
            new HextoASCII(s9);
            new HtoD(s2);
            new HtoD(s3);
//        s4
            new HtoD(s5);
            new HtoTime(s6h,s6m);
            new HtoD(s7);

//      s8 A4 混发
            new HtoGBK(s10);
            new HtoCRC(s11);
            new HtoSUM(s12);

    }
}
