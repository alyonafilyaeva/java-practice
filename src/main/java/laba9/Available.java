package laba9;

public interface Available {
   default boolean isAvailable(String title) {
       return true;
   }
}
