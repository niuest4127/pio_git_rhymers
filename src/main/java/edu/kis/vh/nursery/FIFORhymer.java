package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }

        int result = temp.countOut();

        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }

        return result;
    }
}