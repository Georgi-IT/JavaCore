package homework.homework1;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("1.Բոլոր էլեմենտները իրար կողք, բաժանված պռաբելով _ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("2.Մասիվի առաջին էլեմենտը _ " + numbers[0]);

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("3.Մասիվի վերջին էլեմենտը _ " + numbers[numbers.length - 1]);

        System.out.println();
        System.out.println("-------------------------");
        int a = numbers.length;
        System.out.println("4.Մասիվի երկարությունը _ " + a);

        System.out.println();
        System.out.println("-------------------------");
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            b = b < numbers[i] ? b : numbers[i];
        }
        System.out.println("5.Մասիվի ամենափոքր թիվը _ " + b);
        System.out.println();
        System.out.println("-------------------------");
        if (numbers.length <= 2)
            System.out.println("6.can't print middle values");

        if (numbers.length % 2 == 0)
            System.out.println("6.Մեջտեղի երկու էլեմենտները _ " + numbers[numbers.length / 2 - 1] + " & " + numbers[numbers.length / 2]);

        if (numbers.length % 2 == 1)
            System.out.println("6.Մեջտեղի էլեմենտը _ " + numbers[numbers.length / 2]);
        System.out.println();
        System.out.println("-------------------------");
        int zuyg = 0;
        int kent = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                zuyg++;
            }

            if (numbers[i] % 2 == 1 || numbers[i] % 2 == -1) {
                kent++;
            }

        }
        System.out.println("7.zuyg _ " + zuyg );
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("8.kent _ " + kent);
        System.out.println();
        System.out.println("-------------------------");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
           sum = sum + numbers[i] ;
        }
        System.out.println("9.մասիվում էլեմենտների գումարը _ " + sum);
        System.out.println();
        System.out.println("-------------------------");
        double mijin = sum;
        System.out.println("10. մասիվում թվերի միջին թվաբանականը _ " + mijin/numbers.length);
    }
}
