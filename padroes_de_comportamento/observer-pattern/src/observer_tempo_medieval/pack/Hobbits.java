package observer_tempo_medieval;

import observer_tempo_medieval.pack.TempoObserver;
import observer_tempo_medieval.pack.TipoTempo;

/**
 *
 * @author DHEYSON
 */
public class Hobbits implements TempoObserver {
    
    @Override
    public void atualizar(TipoTempo tempoatual) {
        switch(tempoatual) {
            case FRIO:
                System.out.println("Hobbits não são afetados pelo frio");    
                break;
            case ENSOLARADO:
                System.out.println("Os Hobbits estão plantando a colheita");
                break;
            case VENTANDO:
                System.out.println("Os Hobbits seguraram seus pertences");
                break;
            case CHOVENDO:
                System.out.println("Os Hobbits procuraram cobertura");
                        
        }
    }
    
}
