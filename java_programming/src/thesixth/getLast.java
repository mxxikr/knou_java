package thesixth;
public class getLast {
    public static <T> T getLast(T[] a) {
        return a[a.length - 1]; // 배열의 마지막 원소 리턴
    }
}