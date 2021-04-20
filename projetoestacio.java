import java.util.Scanner;
public classExemplo {
    public static void main(String[]){
        //TODO Auto-generated method stub
        Scanner sc =  = new Scanner(System.in);
        double media, nota1, nota2;
        System.out.printIn("Digite a nota 1:");
        nota1= Double.parseDouble(sc.nextLine());
        System.out.printIn("Digite a nota 2:");
        nota2= Double.parseDouble(sc.nextLine());
        media= (nota1+ nota2) /2.0;
        System.out.printIn("A sua média é:" + media);
        sc.close();
    }
}