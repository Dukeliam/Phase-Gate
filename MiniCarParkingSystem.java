public class MiniCarParkingSystem{

      static int[] slots = new int[20];

      public static void emptySlot(){
            for(int index = 0; index < 20; index++){
                  slots[index] = 0;
            }
      
      }
      public static boolean isSlotEmpty(int slot){
            int index = slot -1;
            if(slot < 1 || slot > 20){
                  return false;
            }
            if(slots[index] == 0){
                  return true;
            }
            
                  return false;
      }
      public static boolean isSlotOccupied(int slot){
            int index = slot -1;
            if(slot < 1 || slot > 20){
                  return false;
            }
            if(slots[index] == 0){
                  slots[index] = 1;
                  return true;
            }
            
                  return false;
      }
      public static int nextSlot(){
            for(int index = 0; index < 20; index++){
                  if(slots[index] == 0){
                        slots[index] = 1;
                        return + 1;
                  }
            }
                  return -1;
      }
}
