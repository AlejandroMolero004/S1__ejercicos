import java.util.Scanner;

public class ej3 {
    static void fibonacci(int num){
        int a=0;
        int b=1;
        int suma=1;
        System.out.print(0+" ");
        System.out.print(1+" ");

        while(suma<num){
            System.out.print(suma+" ");
            a=b;
            b=suma;
            suma=a+b;
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.println("introduce un numero");
        Scanner scan=new Scanner(System.in);
        num= scan.nextInt();
        fibonacci(num);
    }
}
