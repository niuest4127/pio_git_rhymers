package edu.kis.vh.nursery;

private class FIFORhymer extends DefaultCountingOutRhymer {
    
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.countIn(super.countOut());
        }
        int ret = temp.countOut();
        while (!temp.callCheck()) {
            countIn(temp.countOut());
        }
        return ret;
    }
}
