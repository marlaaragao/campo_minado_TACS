/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import campominado.SorteiaAleatorio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lizandra Ottmann
 */
public class SorteiaAleatorioJUnitTest {
    SorteiaAleatorio aleatorio;
    public SorteiaAleatorioJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        aleatorio = new SorteiaAleatorio();
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}