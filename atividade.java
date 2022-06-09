//1
import java.util.Scanner;
//
//public class atividade {
//    public static void main (String[] args){
//        Scanner entrada = new Scanner (System.in);
//        System.out.println("Faca a soma de dois numeros inteiros:");
//        double valor = entrada.nextDouble();
//        double numero = entrada.nextDouble();
//        double resultado = valor + numero;
//        System.out.println("Resultado: " + resultado);
//    }
//}

//2 
//public class atividade {
//public static void main (String[] args){
//    Scanner entrada = new Scanner (System.in);
//System.out.println("Escreva um valor em metros");
//double numero1 = entrada.nextDouble();
//double total = numero1*100;
//System.out.println("Seu valor e igual a:" +total + "cm");
//}
//}


//3
//public class atividade {
//    public static void main (String[] args){
//        Scanner entrada = new Scanner (System.in);
//        System.out.println("Escreva um numero");
//        double numero1 = entrada.nextDouble();
//        if (numero1 %2==0){
//        System.out.println("Seu numero e par");
//        
//        }else{
//            System.out.println("Seu numero e impar");
//        }
//    }
//}

//4
public class atividade {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        System.out.println("Escreva a velocidade do carro");

        double numero1 = entrada.nextDouble();
        if (numero1 > 80){
            double acima = numero1 - 80;
            double multa = acima * 5;
            System.out.println("Voce ultrapassou a velocidade permitida, sua multa e de: " + multa);
        }else{
            System.out.println("Voce esta dentro do limite permitido");
        }
    }
}
