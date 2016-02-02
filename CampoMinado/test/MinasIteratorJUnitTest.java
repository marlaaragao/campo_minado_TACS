/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import campominado.MinasIterator;
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
public class MinasIteratorJUnitTest {
    MinasIterator minasIterator;

    private int[][] minas;
    public MinasIteratorJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(ObjetoJogo _ObjJOgo) {
        minasIterator = new MinasIterator(minas, _ObjJOgo);
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