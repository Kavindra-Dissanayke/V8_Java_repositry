import java.util.*;
/*class Example{
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            System.out.println(i+" ! : "+fact(i));
        }
    }
    public static int fact(int a){
        int fact=1;
        for (int i = 1; i <=a ; i++) {
            fact*=i;
        }return fact;
    }
}*/
/*
class Example{
    public static int fact(int num){
        int f=1;
        for(int i=num; i>0; i--){
            f*=i;
        }
        return f;
    }
    public static void main(String args[]){
        for(int i=0; i<10; i++){
            System.out.println(i+" ! : "+fact(i));
            System.out.println("s");
        }
    }
}
*/
import java.util.*;
class Example{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Input average marks : ");
        double avg=input.nextDouble();
        String grade=findGrade(avg);
        System.out.println(avg+" : "+grade);
    }
    public static String findGrade(double avg){
        return avg>75?"A":avg>65?"B":avg>55?"C":avg>45?"D":"E";
    }
}
