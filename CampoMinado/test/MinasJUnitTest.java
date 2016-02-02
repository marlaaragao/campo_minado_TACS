/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import campominado.Minas;
import campominado.ObjetoJogo;
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
public class MinasJUnitTest {
    
    Minas minas;
    private ObjetoJogo _ObjJogo;
    
    public MinasJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        minas = new Minas(_ObjJogo);
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