package observer_tempo_medieval.pack;

/**
 *
 * @author DHEYSON
 */
public enum TipoTempo {
    ENSOLARADO,CHOVENDO,FRIO,VENTANDO;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
