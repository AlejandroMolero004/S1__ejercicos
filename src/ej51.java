//ejerrcicio 5.1
import java.util.ArrayList;
import java.util.Scanner;
public class ej51 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer>array= new ArrayList<>();
        String res="si";
        int num;
        while(res.equals("si")){
            System.out.print("introduce el numero: ");
            num= scan.nextInt();
            array.add(num);
            scan.nextLine();
            System.out.print("¿quieres seguir? ");
            res=scan.nextLine();
        }
        for(int e:array){
            System.out.print(e+" ");
        }
    }
}
