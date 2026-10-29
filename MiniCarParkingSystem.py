
def emptySlot(){
      slots = []
      for index in range(20):
            index = 0
            slots.append(index)
      return slots

}
def isSlotEmpty(int slot){
      int index = slot - 1;
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
public static int nextSlot(int index){
      for(index = 0; index < 20; index++){
            if(slots[index] == 0){
                  slots[index] = 1;
                  return index + 1;
            }
      }
            return -1;
}
public static boolean existSlot(int slot){
      int index = slot - 1;
      if(slot < 1 || slot > 20){
            return false;
      }
      if(slots[index] == 1){
            slots[index] = 0;
            return true;
      }
      
            return false;
}
public static int countAvaliableSpaces(){
      int avaliable = 0;
      for(int index = 0; index < 20; index++){
            if(slots[index] == 0){
                  avaliable++;
            }
      }
            return avaliable;
}
}
