public class Main {

    public static void move(int[] aMN, int m) {
        for (int i = m; i >= 0; i--) {
            if (aMN[i] != -1)
                aMN[i+1] = aMN[i];
        }
    }
    public static void merge(int[] aMN, int[] aN, int m, int n) {

        move(aMN, m);

        int i = n, j = 0, k = 0;
        while (k < m) {
            if (j == n || (aN[j] >= aMN[i] && i < m)) {
                aMN[k] = aMN[i];
                k++;
                i++;
            } else {
                aMN[k] = aN[j];
                k++;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] aN = {5,8,12,17};
        int[] aMN = {2,-1,7,-1,-1,10,-1};
        int n = aN.length;
        int m = aMN.length;

        merge(aMN, aN, m, n);

        for (int j : aMN) System.out.print(j + " ");
    }
}