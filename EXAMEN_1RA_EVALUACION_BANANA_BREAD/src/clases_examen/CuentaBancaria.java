/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

import java.util.Scanner;

/**
 *
 * @author José Sebastian López Ibarra & Sebastian Emilio Murillo Andrade
 */

class CuentaBancaria {
    private String numeroCuenta, nombreCliente;
    double saldo;public String getNumeroCuenta() {
    return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
    }
    public String getNombreCliente() {
    return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
    }
    public double getSaldo() {
    return saldo;
    }
    public void setSaldo(double saldo) {
    this.saldo = saldo;
    }
    public CuentaBancaria() {
    numeroCuenta = "";
    nombreCliente = "";
    saldo = 0;
    }
    public CuentaBancaria(String numeroCuenta, String nombreCliente, int saldo) {
    this.numeroCuenta = numeroCuenta;
    this.nombreCliente = nombreCliente;
    this.saldo = saldo;
    }
    public double depositarEnCuenta(double saldo) {
    return this.saldo += saldo;
    }
    public void retirarDeCuenta(double saldo) {
    if (this.saldo > 0) {
        this.saldo -= saldo;
    } else {
        System.out.println("Saldo insuficiente.");
    }
    }
    public static void imprimirDatos() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduzca su número de cuenta:");
    String cuenta = entrada.nextLine();
    System.out.println("Introduzca su nombre:");
    String nombre = entrada.nextLine();
    System.out.println("Si desea depositar, introduzca \"1\". Si desea retirar, introduzca \"2\".");
    int accion = entrada.nextInt();
        switch (accion) {
            case 1 -> {
                System.out.println("Introduzca la cantidad a depositar:");
                double deposito = entrada.nextDouble();
                depositarEnCuenta(deposito);
            }
            case 2 -> {
                System.out.println("Introduzca una cantidad a retirar:");
                double retiro = entrada.nextDouble();
                retirarDeCuenta(retiro);
            }
            default -> System.out.println("Introduzca una opción válida.");
        }
    CuentaBancaria cliente1 = new CuentaBancaria();
    cliente1.setNombreCliente(nombre);
    cliente1.setNumeroCuenta(cuenta);
    System.out.println("Número de cuenta:" + cliente1.getNumeroCuenta());
    System.out.println("Nombre del cliente:" + cliente1.getNombreCliente());
    System.out.println("Saldo actual:" + cliente1.getSaldo());
    }
 }
