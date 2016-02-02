package campominado;

/**
 * 
 * @author Thaisa
 */

/** Iterator é uma interface que descreve o "esqueleto" da classe MinasIterator */

public interface Iterator {
       
    //**Proxima Posiçao */ 
    boolean temProximo(); 
    Object proximo();
    
}