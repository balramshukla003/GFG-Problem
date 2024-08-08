class Answer {
    int MissingTerm(int n, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int a = i + 1;
            if ((arr[i] + 1) == (arr[a])) {
            } else return arr[i] + 1;
        }
        return 0;
    }
}

public class MissingNumArr {
    public static void main(String[] args) {

        int n = 5;
        int[] arr = {1, 2, 4, 5};
        Answer sc = new Answer();    //Solution class Object Initialization
        int k = sc.MissingTerm(n, arr);  //Method Call of solution class

        if (k == 0) {
            System.out.println("No Missing Term");
        } else System.out.println("The Missing term is "+k);

    }
}
