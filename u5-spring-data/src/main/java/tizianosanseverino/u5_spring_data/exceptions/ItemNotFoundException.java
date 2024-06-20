package tizianosanseverino.u5_spring_data.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(int id) {
        super("Item " + id + " not found");
    }
}
