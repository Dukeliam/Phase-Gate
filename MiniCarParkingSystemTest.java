import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MiniCarParkingSystemTest{
      
      @Test
      public void testTheEmptySlotIsZero(){
            MiniCarParkingSystem miniCarParkingSystem = new MiniCarParkingSystem();
            
            boolean expected = miniCarParkingSystem.isSlotEmpty(5);
            
            boolean actual = true;
            
            Assertions.assertEquals(actual, expected);
      }
      @Test
      public void testTheSlotIsOccupied(){
            MiniCarParkingSystem miniCarParkingSystem = new MiniCarParkingSystem();
            
            boolean expected = miniCarParkingSystem.isSlotOccupied(3);
            
            boolean actual = true;
            
            Assertions.assertEquals(actual, expected);
      }
      @Test
      public void testThatTheToChooseTheNextSlot(){
            MiniCarParkingSystem miniCarParkingSystem = new MiniCarParkingSystem();
            
            int expected = miniCarParkingSystem.nextSlot(1);
            
            int actual = 1;
            
            Assertions.assertEquals(actual, expected);
      }
        @Test
        public void testExitTheSlot(){
            MiniCarParkingSystem miniCarParkingSystem = new MiniCarParkingSystem();
            
            boolean expected = miniCarParkingSystem.existSlot(4);
            
            boolean actual = true;
            
            Assertions.assertEquals(actual, expected);
        }
}
