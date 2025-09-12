package homework.homework1;

public class FigurePainter {
    public static void main(String[] args) {
        int a=6;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int b = 5;
        for (int i = b; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int d = 5;
        for (int i = d; i >0; i--) {

            for (int k = d; k > i; k--) {
                System.out.print("  ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        int c = 6;
        for (int i = 0; i < c; i++) {

            for (int k = 0; k <c-i; k++) {
                System.out.print("  ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }

        System.out.println();
        System.out.println();

        int x = 6;
        for (int i = 0; i < x; i++) {

            for (int k = 0; k < x - i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int p = c-2; p > 0; p--) {

            for (int k = c; k > p; k--) {
                System.out.print(" ");

            }
            for (int j = 0; j < p; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }

    }
}
