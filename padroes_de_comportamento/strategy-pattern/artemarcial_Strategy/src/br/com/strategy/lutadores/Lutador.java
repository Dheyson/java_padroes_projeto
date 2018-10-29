/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.strategy.lutadores;

import br.com.strategy.ataque.iChudan;
import br.com.strategy.defesa.iGedan;
import br.com.strategy.defesa.iJodan;

/**
 *
 * @author DHEYSON
 */
public abstract class Lutador {
    
    private String nome;
    protected iChudan ataque;
    protected iGedan defesabaixa;
    protected iJodan defesaalta;

    public void Ataque() {
        ataque.ataque();
    }
    
    public void DefenderBaixo() {
        defesabaixa.defesabaixa();
    }
      public void DefenderAlto() {
        defesaalta.defesaalta();
    }

    public String getNome() {return nome; }

    public void setNome(String nome) { this.nome = nome;}
    public void setAtaque(iChudan ataque) { this.ataque = ataque;}
    public void setDefesabaixa(iGedan defesabaixa) {this.defesabaixa = defesabaixa;}
    public void setDefesaalta(iJodan defesaalta) {this.defesaalta = defesaalta;}
    

}
