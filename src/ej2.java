public class ej2 {
    static void comproprimo(int num){
        int cont=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                cont++;
            }
        }
        if(cont==2){
            System.out.println("es primo");
        }
        else{
            System.out.println("no es primo");
        }
    }
    public static void main(String[] args) {
        comproprimo(13);

    }
}
