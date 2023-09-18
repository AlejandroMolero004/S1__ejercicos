import java.util.ArrayList;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> array= new ArrayList<>();
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
        for(int j = 0; j < array.size(); j++){
            System.out.print(array.get(j)+" ");
        }
    }
}
