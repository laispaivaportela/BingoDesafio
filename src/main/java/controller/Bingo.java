/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author laispaivaportela
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

import model.Sorteio;
public class Bingo {
    protected List<Sorteio> sorteios = new ArrayList<>();
    Random sorteador = new Random();
    
    public int sorteiaNumero(){
         int numeroAleatorio = sorteador.nextInt(75) + 1;
         Sorteio sorteio = new Sorteio(numeroAleatorio);
         sorteios.add(sorteio);
         sorteio.imprimeNumero();
         return numeroAleatorio;
    }
    
    public String listaSorteio(){
        String numerosSorteados = "";
        for(int i = 0; i < sorteios.size() ; i++){
            numerosSorteados += String.format("%d\n", sorteios.get(i).getNumeroSorteado());
    }
    return numerosSorteados;
}
}
