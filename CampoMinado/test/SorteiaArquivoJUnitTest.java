/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import campominado.SorteiaArquivo;
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
public class SorteiaArquivoJUnitTest {
    SorteiaArquivo arquivo;
    
    public SorteiaArquivoJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        arquivo = new SorteiaArquivo();
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