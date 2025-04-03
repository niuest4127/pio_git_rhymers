public class DefaultCountingOutRhymer {
    int size = 12;
    int err_code = -1;
    private int[] numbers = new int[size];
    private int total = err_code;  

    // Getter dla pola total
    public int getTotal() {
        return total;
    }

    // Getter i setter dla numbers (w razie potrzeby)
    public int[] getNumbers() {
        return numbers.clone();  
    }

    public void setNumbers(int[] numbers) {
        if (numbers.length == size) {
            this.numbers = numbers.clone();
        }
    }

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == err_code;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return err_code;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return err_code;
        }
        return numbers[total--];
    }
}
