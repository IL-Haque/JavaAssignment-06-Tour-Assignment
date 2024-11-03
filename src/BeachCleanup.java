public class BeachCleanup {
    public static void main(String[] args) {
        int[] beach = {1, 0, 1, 1, 0, 1, 0};

        System.out.print("Beach status before cleaning: ");
        printBeach(beach);

        cleanBeach(beach);

        System.out.print("Beach status after cleaning: ");
        printBeach(beach);
    }

    public static void cleanBeach(int[] beach) {
        for (int i = 0; i < beach.length; i++) {
            if (beach[i] == 1) {
                beach[i] = 0;
            }
        }
    }

    public static void printBeach(int[] beach) {
        for (int section : beach) {
            System.out.print(section + " ");
        }
        System.out.println();
    }
}
