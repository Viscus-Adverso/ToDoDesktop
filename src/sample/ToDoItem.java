package sample;

/**
 * Created by Viscus on 9/27/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    public ToDoItem() {
    }

    public ToDoItem(String text, boolean toggle) {
        this.text = text;
        this.isDone = toggle;
    }


    @Override
    public String toString() {
        String checkbox = "[ ]";
        if (isDone) {
            checkbox = "[x]";
        }
        return String.format("%s %s", checkbox, text);
    }
}
