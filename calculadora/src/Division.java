public class Division extends Accion {
    double dividir;

    Division(double numero1, double numero2){
        super(numero1, numero2, '/');
        this.dividir = numero1 / numero2;
    }

    public void Resultado(){
        System.out.println(this.numero1+" "+this.oper+" "+this.numero2+" = "+this.dividir);
      }
}

