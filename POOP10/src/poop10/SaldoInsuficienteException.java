/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author tania
 */
public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String message){
        super("Saldo insuficente");
    }
}
