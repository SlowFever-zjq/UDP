package UDP.print;

import UDP.Print;

public class HtoD {
    public HtoD(String s) {

        String s1 = s.replaceAll(" ","");
        if(s1 != null){
            Print.print1(s1);
        }
    }

}
