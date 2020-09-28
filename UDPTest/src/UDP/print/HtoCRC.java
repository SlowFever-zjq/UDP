package UDP.print;

public class HtoCRC {
    public HtoCRC(String s11) {
        if(s11.equals(" 00")){
            System.out.println("CRC-right");
        }else {
            System.out.println("CRC-mistaken");
        }
    }
}
