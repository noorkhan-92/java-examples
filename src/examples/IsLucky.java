package examples;

public class IsLucky {

    public IsLucky() {
        solution(11);
    }

    boolean solution(int n) {
        int a = 0, b = 0;
        if (Math.floor(Math.log10(n)) == 1) {
            System.out.println(n / 10 + " : " + n % 10);
            if (n / 10 == n % 10) {
                return true;
            }
        }
        if (Math.floor(Math.log10(n)) == 3) {
            a = n / 100;
            b = n % 100;
            System.out.println(a + " : " + b + " : " + (b / 10));
        }
        if (Math.floor(Math.log10(n)) == 5) {
            a = n / 1000;
            b = n % 1000;
            if ((a / 100 + a % 10 + (a / 10) % 10) == (b / 100 + b % 10 + (b / 10) % 10)) {
                return true;
            }
            System.out.println(a / 100 + a % 10 + (a / 10) % 10);
        }
        return false;
    }

    public static void main(String args[]) {
        IsLucky lucky = new IsLucky();
    }

}
