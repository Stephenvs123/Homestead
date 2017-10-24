package com.bbd;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


    public class HomesteadTest {

        private Homestead homestead;
        private Nkandla nkandla;
        private Politician politicianHZ;
        private Politician politicianJM;
        private Politician JacobZuma;

        @Before
        public void setUp() throws Exception {
            homestead = new Homestead("Zuma", "uThungulu", "Gauteng", "ZA");
            nkandla = new Nkandla("Zuma", "uThungulu", "Gauteng", "ZA");
            politicianHZ = new Politician("Hellen Zille", 50, Gender.FEMALE, PersonType.Politician);
            politicianJM = new Politician("Julius Malema", 38, Gender.MALE, PersonType.Politician);
            JacobZuma = new Politician("Jacob Zuma", 43, Gender.MALE, PersonType.President);

            SwimmingPool pool = new SwimmingPool(50, 20, 10);
            nkandla.setSwimmingPool(pool);
            ChickenRun chikchik = new ChickenRun(95);
            nkandla.setChickenRun(chikchik);
            Amphitheater amphi = new Amphitheater(6500);
            nkandla.setAmphitheater(amphi);
        }

        @Test
        public void testHomestead(){
            String testing = "Homestead{Name='Zuma', District='uThungulu', Province='Gauteng', Country='ZA'}";
            assertEquals(testing, homestead.toString());
        }

        @Test
        public void testPoliticianHZ() {
            String poli = "Politician{} Person{name='Hellen Zille', age=50, gender=FEMALE, type=Politician}";
            assertEquals(poli, politicianHZ.toString());
        }

        @Test
        public void testPoliticianJM() {
            String poli = "Politician{} Person{name='Julius Malema', age=38, gender=MALE, type=Politician}";
            assertEquals(poli, politicianJM.toString());
        }

        @Test
        public void testPoliticianJacobZuma() {
            String poli = "Politician{} Person{name='Jacob Zuma', age=43, gender=MALE, type=President}";
            assertEquals(poli, JacobZuma.toString());
        }

        @Test (expected = RuntimeException.class)
        public void testAcceptHellen(){
            homestead.accept(politicianHZ);
        }

        @Test (expected = RuntimeException.class)
        public void testAcceptNull(){
            homestead.accept(null);
        }

        @Test
        public void testJacob(){
            homestead.accept(JacobZuma);
        }


        @Test
        public void testSwimmingwithVol(){
            String swim = "SwimmingPool{length=50, width=20, depth=10, volume=10000}";
            assertEquals(swim, nkandla.getSwimmingPool().toString());
        }

        @Test
        public void testSwimmingPool(){
            assertEquals(50, nkandla.getSwimmingPool().getLength());
            assertEquals(20, nkandla.getSwimmingPool().getWidth());
            assertEquals(10, nkandla.getSwimmingPool().getDepth());
            assertEquals(10000, nkandla.getSwimmingPool().getVolume());
        }

        @Test
        public void testChickens(){
            assertEquals(95, nkandla.getChickenRun().getNumOfChickens());
        }

        @Test
        public void testAmphitheather(){
            assertEquals(6500, nkandla.getAmphitheater().getNumSeats());
        }
}
