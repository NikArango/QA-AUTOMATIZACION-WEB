package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.example.models.Nissan;
import org.example.models.Toyota;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    @Test
    public void nissanTest(){
        Nissan nissan = new Nissan("PAL2302");
        assertEquals(false,nissan.acelerar(-20) );
        assertEquals(true,nissan.acelerar(300) );
        assertEquals(false,nissan.acelerar(301) );
    }

    @Test
    public void toyotaTest(){
        Toyota toy = new Toyota("PAL2303");
        assertEquals(false,toy.acelerar(0) );
        assertEquals(true,toy.acelerar(140) );
        assertEquals(false,toy.acelerar(150) );
    }
}
