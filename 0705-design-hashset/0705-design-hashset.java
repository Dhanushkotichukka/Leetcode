class MyHashSet {
    public boolean array[];

    public MyHashSet() {
        array = new boolean[1000001];
        Arrays.fill(array,false);
    }
    
    public void add(int key) {
        array[key] = true;
    }
    
    public void remove(int key) {
        array[key] = false;
    }
    
    public boolean contains(int key) {
        return array[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */