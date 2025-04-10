package thesixth;

class OrderedPair <K, V> implements Pair <K, V> { // 제네릭 클래스 정의
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}