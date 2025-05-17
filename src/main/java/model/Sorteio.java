/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
public class Sorteio {
    private int numeroSorteado;

    public Sorteio(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    public Sorteio() {
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }
    public void imprimeNumero(){
        System.out.println(this.numeroSorteado);
    }
    
}
