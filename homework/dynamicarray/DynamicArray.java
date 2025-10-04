package homework.dynamicarray;

import java.util.Scanner;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    private void extend() {
        System.out.println("oldArray`");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];

        }
        array = newArray;

    }

    public void add(int value) {
        if (size >= array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    public DynamicArray() {
        Scanner scanner = new Scanner(System.in);
        String numbersStr = scanner.nextLine();
        String[] numbersArrStr = numbersStr.split(",");
        for (String s : numbersArrStr) {
            add(Integer.parseInt(s));
        }
        System.out.println("newArray`");
        for (int i = 0; i < numbersArrStr.length; i++) {
            System.out.print(numbersArrStr[i] + " ");
        }
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < array.length) {
            System.out.println(array[index]);
        } else
            System.out.println("-1");
        return -1;

    }
}
