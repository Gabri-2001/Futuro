
//Gabriel Ademar Díaz Arnold

public class Futuro {
    
    
    private static String veredicto(String valor1, String valor2){
    
        if(valor1.equals(valor2)){
        return "No está mal, pero se puede mejorar";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
        return "Es demasiado poco tiempo de estudio. Debes dedicar más tiempo.";
        }
        else{
        return "Tú tiempo de estudio es ideal.";
        }
        }
    
    
    
    public static void main (String [] args){
    
    System.out.println("Estudiante " + args[0] + " : " + Futuro.veredicto(args[2], args[1]));
    
    
    
    
    }
}
