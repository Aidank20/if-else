import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        if(num>10){
            System.out.println("Greater than 10");
        }else{
            System.out.println("Less than or equal to 10");
        }
    }
}