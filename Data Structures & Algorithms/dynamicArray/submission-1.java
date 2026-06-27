class DynamicArray {
    int array_size = 0;
    int array_capacity = 5;
    int[] array;

    public DynamicArray() {
        this.array = new int[array_capacity];
    }

    public DynamicArray(int capacity) { 
        array_capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) { // Good
        if(i < array_size){
            return array[i];
        } 
        return -1;
        
    }

    public void set(int i, int n) { // Good
        if (i + 1> array_capacity){
            resize();
        }
        array[i] = n;
    }

    public void pushback(int n) {
        if (array_size >= array_capacity){
            resize();
        }
        array[array_size] = n;
        array_size++;
    }

    public int popback() {
        if (array_size >= array_capacity){
            System.out.println("Index out of bounds");
        }
        int thing = array[array_size - 1];
        array[array_size - 1] = 0;
        array_size--;
        return thing;
    }

    private void resize() {
        int new_capacity = (int)(array_capacity * 2);
        System.out.println("This new capacity" + new_capacity);
        int[] new_array = new int[new_capacity];

        for(int i = 0; i < array_capacity; i++){
            new_array[i] = array[i];
        }

        array_capacity = new_capacity;
        array = new_array;
    }

    public int getSize() {
        return array_size;
    }

    public int getCapacity() {
        return array_capacity;
    }
}
