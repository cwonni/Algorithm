import java.util.Scanner;

public class Main {
    public static int fun(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Main m=new Main();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(m.fun(a,b));
        
    }
}