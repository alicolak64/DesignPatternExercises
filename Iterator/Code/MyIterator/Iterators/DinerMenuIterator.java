public class DinerMenuIterator implements Iterator{

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        return items[position++];
    }

    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

}
