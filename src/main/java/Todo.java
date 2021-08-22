/**
 * Todo class which inherits from a Task.
 */


public class Todo extends Task {


    /**
     * Constructor for a Todo.
     * @param title takes in the title of the Task.
     */
    public Todo(String title)  {
        super(title);
    }

    /**
     * method to get the info of this Todo.
     * @return a String that describes the Todo.
     */
    @Override
    public String getInfo() {
        return "[T][ ]" + this.getTitle();
    }


    /**
     * The toString method.
     * @return a String describing the Todo.
     */
    @Override
    public String toString() {
        if (!this.getDone()) {
            return "[T][ ]" + this.getTitle();
        } else {
            return "[T][X]" + this.getTitle();
        }

    }
}