package homework.lesson12;

public class BraceChecker {


    //teqsty
    String text;

    //klasi konstruktor, vory petq e ynduni String tipi text,ev veragri verevi textin
    //vor chkaroxananq  BraceChecker i obyekty sarqenq aranc text talu konstruktori mijocov
    public BraceChecker(String word) {
        text = word;
    }

    //sa himnakan metodn e vortex grelu enq voxj logikan, ashxatelu enq te stacki het te verevitexti
    public void chek() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("close without opening" + ch);
                    continue;
                }
                char last = stack.pop();
                if ((ch == ')' && last == '(') || (ch == '}' && last == '{') || (ch == ']' && last == '[')) {
                    System.out.println("it's ok " + last + " & " + ch);
                } else {

                    System.out.println("Error: opened " + last + " but closed" + ch + " at " + i);
                    return;
                }

            }

        }
            if (!stack.isEmpty()) {
                System.out.print("Open but not closed");


            }
        }
    }