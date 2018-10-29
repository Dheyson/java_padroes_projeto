
package br.com.strategy.lutadores;

import br.com.strategy.ataque.OiZuki;
import br.com.strategy.defesa.GedanBarai;
import br.com.strategy.defesa.ShutoUke;

/**
 *
 * @author DHEYSON
 */
public class IpMan extends Lutador {

    public IpMan() {
        defesabaixa = new GedanBarai();
        ataque = new OiZuki();
        defesaalta = new ShutoUke();
        
    }
    
}
