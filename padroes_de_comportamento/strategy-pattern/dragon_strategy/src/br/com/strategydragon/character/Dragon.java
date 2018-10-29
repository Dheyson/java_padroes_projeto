package br.com.strategydragon.character;

import br.com.strategydragon.actions.*;

/**
 *
 * @author DHEYSON
 */
public class Dragon {
    private IAttack strategy;
    
     public Dragon(IAttack strategy) {
        this.strategy = strategy; }

    public void mudarAtaque(IAttack strategy) {
        this.strategy = strategy;
    }
    
    public void irBatalhar() {
        strategy.attack();
  }

}
