package bilet26;


public class MyArrayList {
    private Integer[] array = new Integer[10];
    private Integer size = 0;

    public void add(Integer el) {
        if(this.size + 1 > this.array.length) {
            Integer[] oldArray = this.array;
            this.array = new Integer[this.size * 2];

            System.arraycopy(oldArray, 0, this.array, 0, this.size);
        }

        this.array[size] = el;
        size++;
    }

    public void del(Integer index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException();
        }

        System.arraycopy(this.array, index + 1, this.array, index, size - index);
    }

    public Integer get(Integer index) {
        if(index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return this.array[index];
    }
}
