/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import campominado.Game;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lizandra Ottmann
 */
public class GameJUnitTest {
    
    Game g;
    
    public GameJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        g = new Game();
    }
    
    @After
    public void tearDown() {
    }
   
    
     @Test
     public void Jogar() {
    // Assert.assertArrayEquals(expecteds, actuals);
     
     }
}