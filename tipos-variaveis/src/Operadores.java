public class Operadores {
    
    public static void main(String[] args) {
        int numero1 = 5;
        boolean algumaCoisa = true;
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "Verdadeiro" : "falso";
        System.out.println(resultado);

        numero1 = - numero1;

        System.out.println(numero1);

        numero1 = numero1 * -1;

        System.out.println(--numero1);
        System.out.println(!algumaCoisa);


    }
}
