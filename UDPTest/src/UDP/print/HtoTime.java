package UDP.print;

import UDP.ConvertSystem;

public class HtoTime {
    public HtoTime(String sh,String sm) {
        String timeh= ConvertSystem.sexaDecToBinary(sh);
        String h=ConvertSystem.binaryToDecimal(timeh);
        System.out.println(h+"h");
//        int inth = Integer.valueOf(h);
        String times= ConvertSystem.sexaDecToBinary(sm);
        String s=ConvertSystem.binaryToDecimal(times);
        System.out.println(s+"m");

    }
}
