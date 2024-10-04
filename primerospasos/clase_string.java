public class clase_string {
    public static void main(String[] args) {
    String nombre = "julia"; 
    System.out.println(nombre);
    System.out.println("mi nombre tiene:"  + nombre.length()  +  "letras"); 
    System.out.println("la peimera letra de mi nombre es:"  +  nombre.charAt(0));
    int ultima_letra;
    ultima_letra=nombre.length();
    System.out.println("y la ultima letra es:"  +  nombre.charAt(ultima_letra-1));
    String frase="hoy es un bune dia para progrmar en java";
    String frase_resumen=frase.substring(21,24);
    System.out.println(frase_resumen);
    String alumno1, alumno2 ;
    
    alumno1="ana";
    alumno2="na";
    System.out.println(alumno1.equalsIgnoreCase(alumno2));

    }
}