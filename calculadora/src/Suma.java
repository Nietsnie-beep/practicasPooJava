import java.util.Set;

public class Suma extends Accion {
    double sumar;

    Suma(double numero1, double numero2){
        super(numero1, numero2, '+');
        this.sumar = numero1 + numero2;
    }

    public void Resultado(){
        System.out.println(this.numero1+" "+this.oper+" "+this.numero2+" = "+this.sumar);
      }

}
