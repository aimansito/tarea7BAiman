/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author aiman
 */
public class ExpresionesRegulares {
    public static void main(String[] args) {
        String autopista = "AP-7";
        saberSiAutopistaEsValida(autopista);
        System.out.println("Autopista valida: "+saberSiAutopistaEsValida(autopista));
        System.out.println("Saber si cadena coincide con el patron anterior: "+saberSiCadenaCoincide("Aiman"));
        System.out.println("Matricula valida: "+comprobarMatricula("0245JGB"));
        System.out.println("Saber si contiene patron letra numero: "+contienePatronLetraNumero("e3r4q1w2d4"));
        System.out.println("Código postal válido: "+saberSiEsCodPostal("29680"));
        System.out.println("Usuario de pasen valido: "+saberSiEsUsuarioPasen("ahardao1001"));
        System.out.println("Cumple las condiciones: "+saberSiCadenaCumpleCondiciones("Rascacielos"));
        System.out.println("Contiene Software o Hardware: "+saberSiCadenaContienePalabra("Ordenador"));
    }
    
    //Saber si una cadena contiene el patrón AP-Nº (nombre de las autopistas), 
    //siendo Nº cualquier número de uno o dos dígitos. Ejemplos que cumplen el patrón: AP-7, AP-77...
    public static boolean saberSiAutopistaEsValida(String autopista){  
        return autopista.matches("^\\bAP-(\\d{1,2})\\b$");
    }
    //Saber si una cadena coincide exactamente con el patrón anterior.
    public static boolean saberSiCadenaCoincide(String cadena){
        return cadena.matches("\\bAP-(\\d{1,2})\\b");
    }
    //Saber si una cadena coincide exactamente con el patrón de la matrícula de un coche.
    public static boolean comprobarMatricula(String matricula){
        return matricula.matches("\\b[0-9]{4}[A-Z]{3}");
    }
    //Saber si una cadena contiene el patrón letraNumero, tantas veces como se repita. 
    //Ejemplos que cumplen el patrón: e3, e3r4, q1w2d4, ...
    public static boolean contienePatronLetraNumero(String cadena){
        return cadena.matches("([a-zA-Z]\\d)+");
    }
    //Saber si una cadena es un código postal (5 dígitos)
    public static boolean saberSiEsCodPostal(String codpostal){
        return codpostal.matches("\\b[0-9]{5}");
    }
    //Saber si una cadena es un usuario de IPasen, sabiendo que tiene entre 
    //7 y 8 caracteres seguidos de 3 o 4 dígitos numéricos.
    public static boolean saberSiEsUsuarioPasen(String usuario){
        return usuario.matches("\\b\\w{7,8}\\d{3,4}\\b");
    }
    //Saber si una cadena tiene tamaño 5 y no contiene ni F, ni R, ni K.
    public static boolean saberSiCadenaCumpleCondiciones(String cadena) {
        return cadena.length() == 5 && !cadena.matches(".*[FRKfrk].*");
    }   
    //Saber si una cadena contiene las palabras "Hardware" o "Software".
    public static boolean saberSiCadenaContienePalabra(String cadena){
        return cadena.equalsIgnoreCase("Hardware")||cadena.equalsIgnoreCase("Software");
    }
}
