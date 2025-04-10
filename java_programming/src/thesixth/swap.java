package thesixth;

public class swap {
    public <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j]; // 배열에서 두 개의 객체를 교환
        array[j] = temp;
    }
}
