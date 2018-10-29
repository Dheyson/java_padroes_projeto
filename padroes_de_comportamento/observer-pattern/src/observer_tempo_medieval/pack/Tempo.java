package observer_tempo_medieval.pack;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DHEYSON
 */
public class Tempo {
    
    private TipoTempo tempoatual;
    private List<TempoObserver> observers;

    public Tempo() {
        observers = new ArrayList<>();
        tempoatual = TipoTempo.CHOVENDO;
    }
    
    public void addObserver(TempoObserver atual) {
        observers.add(atual);
    }
    
     public void rmvObserver(TempoObserver atual) {
        observers.remove(atual);
    }
     
    public void TemposPassa() {
        TipoTempo[] enumValues = TipoTempo.values();
        tempoatual = enumValues[(tempoatual.ordinal()+1) % enumValues.length];
         LOGGER.info("O tempo mudou para "+tempoatual);
         NotificarObservers();
    } 
     
     private void NotificarObservers() {
         for (TempoObserver observer : observers) {
             observer.atualizar(tempoatual);
         }
     }
    
    
}
