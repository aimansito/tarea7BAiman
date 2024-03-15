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
        System.out.println("Matricula valida: "+comprobarMatricula("0245JGB"));
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
        return cadena.matches("");
    }
}
