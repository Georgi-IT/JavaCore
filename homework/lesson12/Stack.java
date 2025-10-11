package homework.lesson12;

public class Stack {

    String[] array = new String[10];
    int tos;

    Stack() {
        tos = -1;

    }

    private void extend() {
        String[] tmp = new String[array.length + 10];
        for (int i = 0; i <= tos; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    void push(char text) {
        if (tos == array.length - 1) {
            extend();
        }
        tos++;
        array[tos] = Character.toString(text);
    }

    char pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;

        }
        char ch = array[tos].charAt(0);
        tos--;
        return ch;
    }
    boolean isEmpty() {
        return tos < 0;
    }
}
