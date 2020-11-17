/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviaosingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Aula - https://www.youtube.com/watch?v=4F54CdYDE10&t=373s
 * @author camil
 */
public class AviaoSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException{
        
        AviaoEnum.agendarAssento("1a");
        AviaoEnum.agendarAssento("1a");
        
        Aviao a1 = Aviao.getINSTANCE();
        AviaoEnum a2 = null;
        System.out.println(a1 +" "+ a2);
        
        Constructor[] constructors = AviaoEnum.class.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            constructor.setAccessible(true);
            a2 = (AviaoEnum) constructor.newInstance();
            break;
        }
        
    }
    /*private static void agendarAssento(String assento){
        Aviao a = Aviao.getINSTANCE();
        System.out.println(a.bookAssentos(assento));
    }*/
    
}
