import java.text.DecimalFormat;
import java.util.Scanner;

public class EasyOperation {
    public static void main(String[] args){
        int times=0;
        int flag=0;
        double answer=0;
        double percent=0;
        Scanner inputNumber = new Scanner(System.in);
        Scanner answer1 = new Scanner(System.in);
        System.out.println("请输入题数：");
        times = inputNumber.nextInt();
        for(int i=0;i<times;i++)
        {
            double corret;
            do {
                 corret = timu();
            }while (corret<0);
            answer = answer1.nextDouble();
           if(answer==corret){
               System.out.println("回答正确");
               flag=flag+1;
           }
           else{
               System.out.println("回答错误，正确答案是："+corret);
           }
        }
        percent=(double)flag/times*100;
        System.out.println("正确率为："+percent+'%');

    }
    public  static double timu(){
        int sign1 =(int)(Math.random()*3); //产生1-4的随机数
        int sign2 =(int)(Math.random()*3); //产生1-4的随机数
        int  x=1+(int)(Math.random()*99);
        int  y=1+(int)(Math.random()*99);
        int  z=1+(int)(Math.random()*99);
        String result="";
        double result1=0;
        result=count(x,y,z,sign1,sign2);
        result1=count1(x,y,z,sign1,sign2);
        if(result1>=0) {
            System.out.println(result + "=? （答案保留一位小数）");
        }
        return result1;
    }
    public  static String count(int x,int y,int z,int sign1,int sign2){
        String result="";
        String sign3="";
        String sign4="";
        sign3=sign4;
        sign4=sign3;
        String x1 = String.valueOf(x);
        String y1 = String.valueOf(y);
        String z1 = String.valueOf(z);
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
    public  static double count1(int x,int y,int z,int sign1,int sign2){
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
}
