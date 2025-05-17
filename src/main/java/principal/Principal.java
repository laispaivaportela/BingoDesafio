/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author laispaivaportela
 */
import controller.Bingo;
import model.Sorteio;
import view.FrmBingo;
//desafio: criar uma aplicação que simule um bingo, com implementação gráfica

public class Principal {
private static final Bingo bingo = new Bingo();
    public static void main(String[] args) {
        System.out.println("Hello World!");
        FrmBingo binguinho = new FrmBingo();
        binguinho.setVisible(true);
    }
    
   
}
