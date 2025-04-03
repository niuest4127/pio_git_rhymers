public class DefaultCountingOutRhymer {
    int size = 12;
    int err_code = -1;
    private int[] numbers = new int[size];
    private int total = err_code;  

    // Getter dla pola total
    public int getTotal() {
        return total;
    }

//<<<<<<< Accesory
    // Getter i setter dla numbers (w razie potrzeby)
    public int[] getNumbers() {
        return numbers.clone();  
    }

    public void setNumbers(int[] numbers) {
        if (numbers.length == size) {
            this.numbers = numbers.clone();
        }
    }
//=======
    private static final int NUM = 12;
    private static final int TOTAL = -1;
    private static final int FULL = 11;

    private final int[] numbers = new int[NUM];
    public int total = TOTAL;
//>>>>>>> master

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    

    public boolean callCheck() {
//<<<<<<< Accesory
        return total == err_code;
=======
        return total == TOTAL;
//>>>>>>> master
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck()) {
//<<<<<<< Accesory
            return err_code;
//=======
            return TOTAL;
//>>>>>>> master
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
//<<<<<<< Accesory
            return err_code;
//=======
            return TOTAL;
//>>>>>>> master
        }
        return numbers[total--];
    }
}
