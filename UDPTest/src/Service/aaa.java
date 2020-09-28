package Service;

import io.netty.buffer.ByteBufUtil;
public class aaa {

    public static void main(String[] args)
    {
        String code = "B8D5B8D5B7B4B7B4B8B4B8B4B7B4B7B4B8B4B8B4";
        byte[] bytes = ByteBufUtil.decodeHexDump(code);
        System.out.println(new String(bytes));
    }
}
