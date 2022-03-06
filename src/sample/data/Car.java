package sample.data;

public interface Car {
    int getTire();
    void ride();
    default boolean isBig(){
        return false;
    }
}
