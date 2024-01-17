// @author Stilver Scavone
public class Estudiante extends Persona {

   private int creditos;

   public Estudiante(String nombre, int edad) {
      super(nombre, edad);
      this.creditos = 60;
   }

   public int getcreditos() {
      return this.creditos;
   }

   public void mostrarDatos() {
      super.mostrarDatos();
      System.out.println("Estudiante Matriculado de " + creditos + " Creditos");
   }

}