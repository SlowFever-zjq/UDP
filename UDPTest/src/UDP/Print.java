package UDP;

public class Print {

    public static void print(String sever) {
        String binary= ConvertSystem.sexaDecToBinary(sever);
        String number=ConvertSystem.binaryToDecimal(binary);
//      转十进制
//        System.out.println("Denary System:");
//        System.out.println(number);
//      转AScii
        String code= ConvertAscii.convert(number);
        System.out.print("Ascii:");
        System.out.println(code);
    }
//    十六转十
    public static void print1(String sever) {
        String binary= ConvertSystem.sexaDecToBinary(sever);
        String number=ConvertSystem.binaryToDecimal(binary);
//      转十进制
        System.out.println("Denary System:");
        System.out.println(number);

    }
}
