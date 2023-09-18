import java.util.Scanner;

public class ej7 {
    public static void delreves(String p){
        char[]mivec=new char[p.length()];
        char[]vocales=new char[5];
        vocales[0]='a';
        vocales[1]='e';
        vocales[2]='i';
        vocales[3]='o';
        vocales[4]='u';
        for(int i=0;i<p.length();i++){
            mivec[i]=p.charAt(i);
        }
        for(char e:mivec){
            System.out.print(e);
        }
        System.out.println();
        for(int j=mivec.length-1;j>=0;j--){
            System.out.print(mivec[j]);
        }
        System.out.println();
        p=p.replaceAll("a"," ");
        p=p.replaceAll("e"," ");
        p=p.replaceAll("i"," ");
        p=p.replaceAll("o"," ");
        p=p.replaceAll("u"," ");
        System.out.println(p);
        System.out.println(p.length());
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String palabra;
        System.out.print("Introduce una palabra:  ");
        palabra= scan.nextLine();
        delreves(palabra);
    }
}
