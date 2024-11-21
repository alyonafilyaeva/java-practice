package laba8;

public interface Available {
   default boolean isAvailable(String title) {
       return true;
   }
}
