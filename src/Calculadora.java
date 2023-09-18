import java.util.Scanner;
public class Calculadora {
    private float num1;
    private float num2;

    void setNum(){
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce el numero 1");
        num1=scan.nextFloat();
        System.out.println("introduce el numero 2");
        num2=scan.nextFloat();
    }
    public float getNum1() {
        return num1;
    }
    public float getNum2() {
        return num2;
    }
    public void suma(){System.out.println(num1+num2);}
}
