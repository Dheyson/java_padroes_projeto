package observer_tempo_teste;

import observer_tempo_medieval.Hobbits;
import observer_tempo_medieval.pack.Orcs;
import observer_tempo_medieval.pack.Tempo;

/**
 *
 * @author DHEYSON
 */
public class Aplicacao {
    public static void main(String[] args) {
      Tempo tempo = new Tempo();
      tempo.addObserver(new Orcs());
      tempo.addObserver(new Hobbits());
      
      tempo.TemposPassa();
      tempo.TemposPassa();
      
    }
}
