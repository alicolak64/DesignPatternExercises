import java.util.Stack;

public class StackEnumeration implements Enumeration {

    private Stack stack;

    public StackEnumeration(Stack stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasMoreElements() {
        return !stack.isEmpty();
    }

    @Override
    public Object nextElement() {
        return stack.pop();
    }

}
