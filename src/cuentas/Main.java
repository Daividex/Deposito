/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;


public class Main {
    public static void main(String[] args) { 
    CCuenta cuenta1; 
    double saldoActual; 
 
    cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0); 
    saldoActual = cuenta1.estado(); 
    System.out.println("El saldo actual es "+ saldoActual ); 
 
        operaciones(cuenta1); 
        sacartodo(cuenta1);
    saldoActual = cuenta1.estado(); 
    System.out.println("El saldo actual es "+ saldoActual ); 
    } 

    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
    private static void sacartodo (CCuenta cuenta1) {
        cuenta1.retirar(50000);
    }
} 
