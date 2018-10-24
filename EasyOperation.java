
import java.text.DecimalFormat;


public class EasyOperation{

    public  String count(int x,int y,int z,int sign1,int sign2){
        String result="";
        String sign3="";
        String sign4="";
        String x1 = String.valueOf(x);
        String y1 = String.valueOf(y);
        String z1 = String.valueOf(z);
        if(x<0)x1="("+x1+")";
        if(y<0)y1="("+y1+")";
        if(z<0)z1="("+z1+")";
        switch(sign1){
            case 0:sign3="+";break;
            case 1:sign3="-";break;
            case 2:sign3="x";break;
            case 3:sign3="/";break;
            default:sign3="+";
        }
        switch(sign2){
            case 0:sign4="+";break;
            case 1:sign4="-";break;
            case 2:sign4="x";break;
            case 3:sign4="/";break;
            default:sign4="+";
        }
        result=x1+sign3+y1+sign4+z1;
        return result;
    }
    public  double count1(int x,int y,int z,int sign1,int sign2){
        double result=0;
        if((sign1==0)&&(sign2==0)){ result=x+y+z; }
        if((sign1==0)&&(sign2==1)){ result=x+y-z; }
        if((sign1==0)&&(sign2==2)){ result=x+y*z; }
        if((sign1==0)&&(sign2==3)){ result=x+y/z; }
        if((sign1==1)&&(sign2==0)){ result=x-y+z; }
        if((sign1==1)&&(sign2==1)){ result=x-y-z; }
        if((sign1==1)&&(sign2==2)){ result=x-y*z; }
        if((sign1==1)&&(sign2==3)){ result=x-y/z; }
        if((sign1==2)&&(sign2==0)){ result=x*y+z; }
        if((sign1==2)&&(sign2==1)){ result=x*y-z; }
        if((sign1==2)&&(sign2==2)){ result=x*y*z; }
        if((sign1==2)&&(sign2==3)){ result=x*y/z; }
        if((sign1==3)&&(sign2==0)){ result=x/y+z; }
        if((sign1==3)&&(sign2==1)){ result=x/y-z; }
        if((sign1==3)&&(sign2==2)){ result=x/y*z; }
        if((sign1==3)&&(sign2==3)){ result=x/y/z; }
        String test =new DecimalFormat("0.0").format(result);
        result = Double.valueOf(test);
        return result;
    }

    public  int jiecheng(int number){
        if (number <= 1)
            return 1;
        else
            return number * jiecheng(number - 1);
    }
}
