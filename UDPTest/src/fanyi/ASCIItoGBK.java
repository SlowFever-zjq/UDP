package fanyi;

import java.nio.charset.Charset;

public class ASCIItoGBK {
    public static final String STRING = "B8 D5 B8 D5 B7 B4 B7 B4 B8 B4 B8 B4 B7 B4 B7 B4 B8 B4 B8 B4";
    private static void conversion(String charSet) {
        byte[] bytes = STRING.getBytes(Charset.forName(charSet));
        System.out.println("\n\n" + charSet);
        for (byte aByte : bytes) {
            System.out.print(aByte + "\t" );
        }
    }
    public static void main(String[] args) {
        conversion("GBK");
    }
}
