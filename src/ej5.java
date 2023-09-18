public class ej5 {
    public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO"; //String constant pool
        String s3 = new String("HELLO");// crea un nuevo objeto de cadena en la memoria heap con el valor "HELLO".
        // Este objeto es independiente de los objetos en el pool de constantes de cadenas.
        String s4 = s1;
        System.out.println("s1 == s2, is \t" + (s1 == s2));
        System.out.println("s1 == s3, is \t" + (s1 == s3));
        System.out.println("s1 == s4, is \t" + (s1 == s4));
        System.out.println("s1 equals s2, is " + (s1.equals(s2)));//EL METODO EQUALS COMPARA LOS VALORES
        System.out.println("s1 equals s3, is " + (s1.equals(s3)));//DE LAS CADENAS POR ESO ESTE TAMBIEN
        System.out.println("s1 equals s4, is " + (s1.equals(s4)));// DA TRUE.
        System.out.println("Adress s1: " + System.identityHashCode(s1));
        System.out.println("Adress s2: " + System.identityHashCode(s2));
        System.out.println("Adress s3: " + System.identityHashCode(s3));//TIENE DIFERENTE HASCODE
        System.out.println("Adress s4: " + System.identityHashCode(s4));
        //MIENTRAS QUE LOS OTROS TRES TIENE EL MISMO HASCODE
        //El código hash de identidad es un identificador único para un objeto y no está relacionado con su contenido.
        // Notarás que s1, s2 y s4 tienen el mismo código hash de identidad porque se refieren al mismo objeto de cadena en el pool de constantes de cadenas,
        // mientras que s3 tiene un código hash de identidad diferente porque es un objeto separado.
    }
}
