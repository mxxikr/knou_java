package thesixth;

class MyPair implements Pair<String, Integer> {
    private String key;
    private Integer value;

    public MyPair(String key, Integer value) {
        this.key = key; this.value = value;
    }

    public String getKey( ) {
        return key;
    }

    public Integer getValue( ) {
        return value;
    }
}