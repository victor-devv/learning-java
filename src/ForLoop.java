public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 20; i >= 10; i-=2) {
            System.out.println(i);
        }

        for (int i = 30; i >= 20;) {
            System.out.println(i);
            i-=5;
        }
    }
}
