package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int SIZE = 12;
    private static final int FULL_INDEX = SIZE - 1;
    
    // Oddzielne stałe dla każdej metody - semantycznie różne cele
    private static final int PEEKABOO_EMPTY_VALUE = -1;
    private static final int COUNTOUT_EMPTY_VALUE = -1;
    private static final int INITIAL_TOTAL_VALUE = -1;
    
    private int[] numbers = new int[SIZE];
    private int total = INITIAL_TOTAL_VALUE;
    
    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }
    
    public boolean callCheck() {
        return total == INITIAL_TOTAL_VALUE;
    }
    
    public boolean isFull() {
        return total == FULL_INDEX;
    }
    
    protected int peekaboo() {
        if (callCheck()) {
            return PEEKABOO_EMPTY_VALUE;
        }
        return numbers[total];
    }
    
    public int countOut() {
        if (callCheck()) {
            return COUNTOUT_EMPTY_VALUE;
        }
        return numbers[total--];
    }
    
    public int getTotal() {
        return total;
    }
}// Fast-forward przesuwa wskaźnik bez merge commit, --no-ff zawsze tworzy merge commit zachowując strukturę gałęzi, --squash łączy wszystkie zmiany w jeden nowy commit, --ff-only merguje tylko jeśli możliwy jest fast-forward (inaczej błąd), a recursive automatycznie tworzy merge commit gdy fast-forward niemożliwy.
