
package br.com.strategy.teste;

import br.com.strategy.ataque.TetsuiUchi;
import br.com.strategy.lutadores.IpMan;
import br.com.strategy.lutadores.SrMiyagi;

/**
 *
 * @author DHEYSON
 */
public class Programa {
    public static void main(String[] args) {
      
      IpMan lutador = new IpMan();
      SrMiyagi lutador2 = new SrMiyagi();
      
      System.out.println("Campeonato de Karatê:\n");
      
      System.out.println("[IpMan]");
      lutador.DefenderBaixo();
      lutador.Ataque();
      lutador.DefenderAlto();
      
      System.out.println("");
      System.out.println("[Sr-Miyagi]");
      lutador2.Ataque();
      lutador2.DefenderBaixo();
      lutador2.setAtaque(new TetsuiUchi());
      lutador2.Ataque();
      
   
    }
}
