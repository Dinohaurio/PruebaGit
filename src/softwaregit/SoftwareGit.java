/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwaregit;

/**
 *
 * @author priro
 */
public class SoftwareGit {

    public static int sumar(int num, int num2){
        return num + num2;
    }

    public static int resta(int num, int num2){
        return num - num2;
    }

    public static int multiplicar(int num, int num2){
        return num * num2;
    }

    public static int dividir(int num, int num2){
        return num / num2;
    }
    
    public static int factorial(int num){
        if(num == 0) return 1; //chupate esta josecarlos
        if(num < 3) return num;
        return (factorial(num-1) * num);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(sumar(2,3));
    }
 
    
    
    
}

