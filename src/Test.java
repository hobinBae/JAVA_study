import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int answer = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);

    }
}
