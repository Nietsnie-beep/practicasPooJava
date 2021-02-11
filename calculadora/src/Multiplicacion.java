public class Multiplicacion extends Accion {
  double multiplicar;

  Multiplicacion(double numero1, double numero2) {
		super(numero1, numero2, '*');
        this.multiplicar = numero1 * numero2;
	}

    public void Resultado(){
        System.out.println(this.numero1+" "+this.oper+" "+this.numero2+" = "+this.multiplicar);
      }
}

