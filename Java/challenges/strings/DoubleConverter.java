package challenges.strings;

public class DoubleConverter {
    public static double converter(String num){
        double res=0;
        int idx=0;

        while(idx < num.length()){
            if(num.charAt(idx) == '.'){
                idx++;
                break;
            }
            else{
                res*=10;
                res+=Integer.parseInt(""+num.charAt(idx));
                System.out.println(res);
            }
            idx++;
        }
        double dcm=1;
        while(idx < num.length()){
            
            dcm/=10;
                double d=Integer.parseInt(""+num.charAt(idx)) *dcm;
                res+=d;
            idx++;
        }
        return res;
    }
}
