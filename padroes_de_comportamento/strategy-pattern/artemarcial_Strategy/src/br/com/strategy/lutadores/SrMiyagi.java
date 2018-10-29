/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strategy.lutadores;

import br.com.strategy.ataque.OiZuki;
import br.com.strategy.defesa.GedanBarai;

/**
 *
 * @author DHEYSON
 */
public class SrMiyagi extends Lutador {

    public SrMiyagi() {
        ataque = new OiZuki();
        defesabaixa = new GedanBarai();
    }
    
}
