package observer_tempo_medieval.pack;

/**
 *
 * @author DHEYSON
 */
public class Orcs implements TempoObserver {

    @Override
    public void atualizar(TipoTempo tempoatual) {
        switch(tempoatual) {
            case FRIO:
                System.out.println("Os Orcs estão acostumados com o frio");    
                break;
            case ENSOLARADO:
                System.out.println("O sol fere os olhos dos Orcs");
                break;
            case VENTANDO:
                System.out.println("O vento limpa o mal cheiro dos Orcs");
                break;
            case CHOVENDO:
                System.out.println("Os Orcs estão molhados");
                        
        }
    }
    
}
