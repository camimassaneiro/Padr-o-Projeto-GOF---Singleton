package aviaosingleton;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author camil
 */
public class Aviao {
    // Eager initialization (mais rápida)
    //private static final Aviao INSTANCE = new Aviao();
   
    private static Aviao INSTANCE;
    private Set<String> assentosDisponiveis;
    
    // Lazy initialization
    public static Aviao getINSTANCE(){
        if(INSTANCE == null){ // Double check, melhor desempenho
            synchronized (Aviao.class){
                if(INSTANCE == null){
                    INSTANCE = new Aviao();
                }
            }
        }
        return INSTANCE;
    }
    
    private Aviao(){
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1a");
        assentosDisponiveis.add("1b");
    }
    public boolean bookAssentos(String assento) {
        return assentosDisponiveis.remove(assento);
    }
}
