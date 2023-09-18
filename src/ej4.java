import java.util.ArrayList;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Double>array= new ArrayList<>();
        double num;
        int res=1;


        while (res==1){
            System.out.println("introduce un numero");
            num=scan.nextDouble();
            array.add(num);
            System.out.println("quieres seguir? 1 si 0 no");
            res=scan.nextInt();
        }
        for (double e:array){
            System.out.print(e+" ");
        }
    }
}
