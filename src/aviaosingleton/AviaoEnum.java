/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviaosingleton;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author camil
 */
public class AviaoEnum {
    
    AviaoEnum INSTANCE;
    private Set<String> assentosDisponiveis;    
    
    private AviaoEnum(){
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1a");
        assentosDisponiveis.add("1b");
    }
    public boolean bookAssentos(String assento) {
        return assentosDisponiveis.remove(assento);
    }
    public static void agendarAssento(String assento){
        Aviao a = Aviao.getINSTANCE();
        System.out.println(a.bookAssentos(assento));
    }
}
