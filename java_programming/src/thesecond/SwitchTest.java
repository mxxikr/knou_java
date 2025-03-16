package thesecond;

public class SwitchTest {
    public static void main(String[] args) {
        int n = 20;
        switch(n) {
            case 10 :
                System.out.println("10입니다.");
                break;
            case 20 :
            case 30:
                System.out.println("20이거나 30입니다.");
                break;
            default:
                System.out.println("모르겠습니다.");
                break;
        }
    }
}