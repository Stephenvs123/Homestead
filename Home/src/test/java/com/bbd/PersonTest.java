package com.bbd;


import org.junit.Before;
import org.junit.Test;

import static com.bbd.PersonType.President;
import static org.junit.Assert.*;

public class PersonTest {

    private Politician HelenZille;
    private Politician JuliusMalema;
    private Lawyer BarryRoux;
    private President JacobZuma;

    @Before
    public void setUp() throws Exception {
        HelenZille = new Politician("Hellen Zille", 50, Gender.FEMALE, PersonType.Politician);
        JuliusMalema = new Politician("Julius Malema", 38, Gender.MALE, PersonType.Politician);
        BarryRoux = new Lawyer("Barry Roux", 55, Gender.MALE, PersonType.Lawyer);
        JacobZuma = new President("Jacob Zuma", 60, Gender.MALE, PersonType.President);

    }
    @Test
    public void testNames() {
        assertEquals("Hellen Zille", HelenZille.getName());
        assertEquals("Julius Malema", JuliusMalema.getName());
        assertEquals("Barry Roux", BarryRoux.getName());
        assertEquals("Jacob Zuma", JacobZuma.getName());
    }

    @Test
    public void testAges() {
        assertEquals(50, HelenZille.getAge());
        assertEquals(38, JuliusMalema.getAge());
        assertEquals(55, BarryRoux.getAge());
        assertEquals(60, JacobZuma.getAge());
    }

    @Test
    public void testGender() {
        assertEquals(Gender.FEMALE, HelenZille.getGender());
        assertEquals(Gender.MALE, JuliusMalema.getGender());
        assertEquals(Gender.MALE, BarryRoux.getGender());
        assertEquals(Gender.MALE, JacobZuma.getGender());
    }

    @Test
    public void testType() {
        assertEquals(PersonType.Politician, HelenZille.getType());
        assertEquals(PersonType.Politician, JuliusMalema.getType());
        assertEquals(PersonType.Lawyer, BarryRoux.getType());
        assertEquals(PersonType.President, JacobZuma.getType());
    }
}
