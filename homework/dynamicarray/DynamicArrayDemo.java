package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(4);
        dynamicArray.add(12);
        dynamicArray.add(60);
        dynamicArray.add(5);
        dynamicArray.add(30);

        dynamicArray.print();
        int u = dynamicArray.getByIndex(3);
        System.out.println(u);

        boolean ok = dynamicArray.exists(7);
        System.out.println(ok);

        int gbiv = dynamicArray.getIndexByValue(12);
        System.out.println(gbiv);
        dynamicArray.set(2, 44);
        dynamicArray.print();
        dynamicArray.add(12, 15);
        dynamicArray.deleteByIndex(2);
    }

}
