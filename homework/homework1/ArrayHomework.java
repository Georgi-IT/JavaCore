package homework.homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        //1.
        int n = 6;
        int array[] = {5, 7, 8, 6, 6, 7, 5, 4, 9, 7};
        int count = 0;
        for (int i : array) {
            if (i == n) {
                count++;
            }
        }
        System.out.println("6 ka -" + count + "hat");
        System.out.println("___________");
        //2.
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("___________");
        //3.
        //array[] = {5, 7, 8, 6, 6, 7, 5, 4, 9, 7};
        int find = 0;
        int sempl = 0;
        for (int i1 : array){

            for (int i = 0; i < array.length; i++) {

                if (i1 == array[i]) {
                    find++;
                    // ՍՏԵՂ ինչղ ենեմ որ արդեն եթե i1
                    // մի անգամ ֆռացել է մասիվով, էլի նույն թվից հանդիպելու դեպքում չստուգի?
                }
            }

        if (find > 1) {
            sempl++;
        }
        }
        System.out.println(sempl + "hat");

}
}


