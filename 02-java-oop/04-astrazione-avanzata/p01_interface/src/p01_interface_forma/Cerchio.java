package p01_interface_forma;

//Classe Cerchio che implementa Forma
class Cerchio implements Forma {
 private double raggio;

 public Cerchio(double raggio) {
     this.raggio = raggio;
 }

 @Override
 public double calcolaArea() {
     return Math.PI * raggio * raggio;
 }
}