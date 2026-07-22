package AulaPratica2;

public class Avaliacao {
   
     double nota1;
     double nota2;
     double nota3;

     double peso1;
     double peso2;
     double peso3;

     public Avaliacao( double nota1, double nota2, double nota3, double peso1, double peso2, double peso3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
      }

     public double calcularMediaAritmetica() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
     }

     public double calcularMediaPonderada() {
        double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 4) / (2 + 3 + 4);
        return mediaPonderada;
     }
 }

