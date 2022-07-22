package FunctionArray;

public class NumberOfNotes {
    public static void main(String[] args) {
        int amount = 1256;
        countAmount(amount);
    }

    public static void countAmount(int amount) {
        int[] notes = new int[]{1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] TotalNotes = new int[9];

        // Total Notes Count
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                TotalNotes[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("ToTal Notes :");
        for (int i = 0; i < 9; i++) {
            if (TotalNotes[i] != 0) {
                System.out.println(notes[i] + " : " + TotalNotes[i]);
            }
        }
    }
}
