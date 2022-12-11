public class ArrayEnumeration implements Enumeration {

    private Object[] objects;
    private int index = 0;

    public ArrayEnumeration(Object[] objects) {
        this.objects = objects;
    }

    @Override
    public boolean hasMoreElements() {
        return index < objects.length;
    }

    @Override
    public Object nextElement() {
        return objects[index++];
    }


}
