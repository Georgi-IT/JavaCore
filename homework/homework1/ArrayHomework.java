package homework.homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        //1.
        int n = 6;
        int array[] = {5, 25, 25,25,100,100,200, 7, 4, 9,200, 4, 36, 4, 36, 9, 7};
        int count = 0;
        for (int i : array) {
            if (i == n) {
                count++;
            }
        }
        System.out.println("6 ունենք - " + count + "հատ");
        System.out.println("___________");
        //2.
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("___________");
        //3.
        //array[] = {5, 25, 7,  4, 9,4, 36, 4, 36, 9, 7};
        int recurring = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isAlreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isAlreadyCounted = true;
                    break;
                }
            }
            if (!isAlreadyCounted) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        recurring++;
                        break;
                    }
                }
            }
        }
        System.out.println("ունենք - " + recurring + " հատ կրկնվող");
        System.out.println("___________");

//4.
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int charCount = 0;
        for (char aChar : chars) {
            switch (aChar) {
                case 'ա':
                case 'ե':
                case 'է':
                case 'ը':
                case 'ի':
                case 'ո':
                case 'և':
                case 'օ':
                    charCount++;
                    System.out.print(aChar + " ");
            }


        }
        System.out.println();
        System.out.println("Ունենք " + charCount + " ձայնավոր");
    }
}


