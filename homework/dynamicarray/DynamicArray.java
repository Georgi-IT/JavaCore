package homework.dynamicarray;

import java.util.Scanner;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()++++++
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ++++++
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել+++++
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];
    }

    //տպել մասիվի ավելացված էլեմենտները+++++
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //ջնջել մասիվի index-երորդ էլեմենտը
//եթե չկա նման ինդեքսով էլեմենտ, տպել, որ չկա նման էլեմենտ
    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index out of bound");
        }
        int[] tmp = new int[size - 1];
        for (int i = 0; i < index; i++) {
            tmp[i] = array[i];
        }
        for (int j = index; j < size - 1; j++) {
            tmp[j] = array[j + 1];
        }
        array = tmp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    //տրված value-ն դնելու ենք տրված index-ով էլեմենտի տեղը։
//Հին արժեքը կկորի
//եթե նման ինդեքսով էլեմենտ չկա, գրում ենք որ չկա։++++++++++++
    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("index out of bound");
        }
        array[index] = value;
    }

    //ավելացնել տրված value-ն տրված ինդեքսում, իսկ էղած էլեմենտները մի հատ աջ տանել։++++++
//Եթե չկա նման ինդեքս, տպել որ չկա
    public void add(int index, int value) {
        int newvalue = 0;
        if (index < 0 || index >= size) {
            System.out.println("index out of bound");

        }else {
            int[] tmp = new int[size + 1];
            for (int i = 0; i < index; i++) {
                tmp[i] = array[i];
            }
            for (int a = index + 1; a < size + 1; a++) {
                tmp[a] = array[a - 1];
            }
            tmp[index] = value;
            array = tmp;
            size++;
            for (int i : array) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    //Վերադարձնել true եթե տրված value-ն կա մեր մասիվի մեջ, եթե ոչ false ++++++
    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
            continue;
        }
        return false;
    }

    //Վերադարձնել տրված value-ի ինդեքսը, եթե շատ կա տվյալ թվից, վերադարձնել առաջին ինդեքսը։+++++
//եթե չկա, -1
    public int getIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;

            }

        }
        return -1;
    }
}


//public class DynamicArray {
//    private int[] array = new int[10];
//    private int size = 0;
//
//    private void extend() {
//        System.out.println("oldArray`");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int[] newArray = new int[array.length + 10];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//
//        }
//        array = newArray;
//
//    }
//
//    public void add(int value) {
//        if (size >= array.length) {
//            extend();
//        }
//        array[size] = value;
//        size++;
//    }
//
//    public DynamicArray() {
//        Scanner scanner = new Scanner(System.in);
//        String numbersStr = scanner.nextLine();
//        String[] numbersArrStr = numbersStr.split(",");
//        for (String s : numbersArrStr) {
//            add(Integer.parseInt(s));
//        }
//        System.out.println("newArray`");
//        for (int i = 0; i < numbersArrStr.length; i++) {
//            System.out.print(numbersArrStr[i] + " ");
//        }
//    }
//
//    public int getByIndex(int index) {
//        if (index >= 0 && index < array.length) {
//            System.out.println(array[index]);
//        } else
//            System.out.println("-1");
//        return -1;
//
//    }
//}
