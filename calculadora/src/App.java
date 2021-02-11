import java.util.Scanner;


public class App {

    public static void main(String[] args){

                    
    double numero1;
    double numero2;
    

        System.out.println("Digita el primer numero");
        Scanner num1 = new Scanner(System.in);
        numero1 = Integer.valueOf(num1.nextLine());
        
        System.out.println("Digita el segundo numero");
        Scanner num2 = new Scanner(System.in);
        numero2 = Integer.valueOf(num1.nextLine());


        int response = 0;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta"); 
            System.out.println("3. Division");
            System.out.println("4. Multiplicacion"); 


            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    Suma sum = new Suma (numero1, numero2);
                        sum.Resultado();

                    break;
                    
                case 2:
                    
                    Resta res = new Resta (numero1, numero2);
                        res.Resultado();

                    break;
                
                case 3:
                    Division divi = new Division (numero1, numero2);
                    divi.Resultado();
                    break;

                case 4:
                    Multiplicacion multi = new Multiplicacion (numero1, numero2);
                    multi.Resultado();
                    break;

                case 0:
                    System.out.println("Gracias por usar la calculadora");
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
            }
        }while (response != 0);
 

    }

}
