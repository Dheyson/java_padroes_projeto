/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strategydragon.character;

import br.com.strategydragon.actions.Burn;
import br.com.strategydragon.actions.FlameBlast;
import br.com.strategydragon.actions.Melee;
/**
 *
 * @author DHEYSON
 */
public class Eragon {
   public static void main(String[] args) {
        
        System.out.println("Um dragão foi avistado, ele está prestes a atacar o vilarejo Sant'Anna");
        System.out.println("");
        
        System.out.println("Dragão Tur:");
        Dragon dragon = new Dragon(new Melee());
        dragon.irBatalhar();
        
        System.out.println("");
        System.out.println("Senhor do vilarejo:");
        System.out.println("Oh!, Santo Deus...Ele destruiu a casa do senhor Jonny Trall...Seus filhos...");
        System.out.println("Abaixem-se homens, ele está prestes a atacar novamente...Oh não!");
        System.out.println("É chama, ele vai queimar tudo");
        
        System.out.println("");
        
        System.out.println("Dragão Tur:");
        dragon.mudarAtaque(new FlameBlast());
        dragon.irBatalhar();
        
        System.out.println("");
        System.out.println("Dragão Tur:");
        System.out.println("Pah do hi...Fen dir [Todos vocês...devem morrer]");
        System.out.println("Revak golt het...Bron ni[Lugar sagrado aqui ... Nords não]");
        System.out.println("");
        
        System.out.println("E o vilarejo escuta seu último suspiro de vida existente...");
        System.out.println("");
        dragon.mudarAtaque(new Burn());
        System.out.println("Dragão Tur:");
        dragon.irBatalhar(); 
}
}
