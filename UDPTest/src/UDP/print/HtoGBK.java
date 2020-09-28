package UDP.print;

import fanyi.ConvertSystem;
import io.netty.buffer.ByteBufUtil;

import java.io.UnsupportedEncodingException;

public   class HtoGBK {

    public  HtoGBK(String s10) throws UnsupportedEncodingException {
        String data = s10.replaceAll(" ", "");
//        System.out.println(s10);
        byte[] bytes = ByteBufUtil.decodeHexDump(data);
        System.out.println(new String(bytes));
    }
}

