import java.util.Scanner;

public class atividade1{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float soma, sub, mult, div, n1, n2;
        System.out.print("digite o primeiro numero: ");
        n1 = leia.nextFloat();
        
        System.out.print("digite o primeiro numero: ");
        n2 = leia.nextFloat();

        soma = n1+n2;
        sub = n1-n2;
        mult = n1*n2;
        div = n1/n2;
       
        System.out.println("soma: " + soma);
        System.out.println("sub: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
    }
}