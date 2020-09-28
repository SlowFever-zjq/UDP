package UDP;


/**
 * 进制装换类
 * @author Acer
 *
 */
public class ConvertSystem {

    /**
     * 二进制
     */
    private static final int DECIMAL=2;

    /**
     * 十六进制所占的二进制位数为4位
     */
    private static final int SIZE=4;

    /*
     * 设置十六进制字符对应的十进制数枚举
     */
    private enum SexaEnum{ A(10), B(11), C(12), D(13), E(14), F(15);
        private final int number;
        private SexaEnum(int number) {
            this.number = number;
        }
        public int get(){
            return number;
        }
    };

    /*
     * 二进制数转换到十进制数
     */
    public static String binaryToDecimal(String binary){
        StringBuffer buf=new StringBuffer();
        String[] strBinary=binary.split(" ");//根据空格拆分二进制数
        for(String str:strBinary){//提取二进制数
            StringBuffer strBuf=new StringBuffer(str);
            char[] element=strBuf.reverse().toString().toCharArray();//反转二进制数方便运算
            int digit=0;//次幕
            int result=0;//结果
            for(char temp:element){//提取单个数
                int intNumber=Integer.parseInt(Character.toString(temp));
                intNumber=intNumber*(int)(Math.pow(DECIMAL, digit));//根据位数算结果 算法：位数*2的次幕
                result=result+intNumber;
                digit=digit+1;//次幕加一
            }
            buf.append(result);
            buf.append(" ");
        }
        return buf.toString();
    }

    /*
     * 十六进制转换为二进制数
     */
    public static String sexaDecToBinary(String sexaDec){
        StringBuffer buf=new StringBuffer();
        String[] strSexa=sexaDec.split(" ");//根据空格拆分十六进制数
        for(String str:strSexa){
            char[] element=str.toCharArray();//拆分为单个的位数
            for(char temp:element){
                if(Character.isDigit(temp)){//数字
                    int intNumber=Integer.parseInt(Character.toString(temp));
                    buf.append(splitBinaryStr(intNumber));
                }else{//十六进制字符
                    int intNumber=convertSexa(temp);
                    buf.append(splitBinaryStr(intNumber));
                }
            }
            buf.append(" ");
        }
        return buf.toString();
    }

    /*
     * 根据十进制数字转换为二进制数  四位数
     */
    private static String splitBinaryStr(int number){
        StringBuffer result=new StringBuffer();
        boolean key=true;
        if(number!=0){//判断数不为零
            while(key){
                if(number%DECIMAL==0){//求余等于零则该位为零         余数为零的情况
                    result.append("0");
                    number=number/DECIMAL;//除二运算
                }else if(number>=DECIMAL){//数大于二且求余不等于零        余数为一的情况
                    result.append("1");
                    number=number/DECIMAL;//除二运算
                }else{
                    result.append("1");//最高位情况    进一位
                    key=false;
                }
            }
        }
        while(result.length()<4){//少于四位数则补零
            result.append("0");
        }
        return result.reverse().toString();//反转字符串  再返回二进制数
    }

    /*
     * 根据十六进制字符转换为十进制数字
     */
    private static int convertSexa(char temp){
        switch(temp){
            case 'A':
                return SexaEnum.A.get();
            case 'B':
                return SexaEnum.B.get();
            case 'C':
                return SexaEnum.C.get();
            case 'D':
                return SexaEnum.D.get();
            case 'E':
                return SexaEnum.E.get();
            case 'F':
                return SexaEnum.F.get();
            default:
                return 0;
        }
    }

}