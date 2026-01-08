package edu.kis.vh.nursery;

/**
 * Implementacja rymowanki FIFO (First-In-First-Out).
 * <p>
 * Klasa rozszerza {@link DefaultCountingOutRhymer} i nadpisuje
 * metodę {@link #countOut()}, aby działała zgodnie z zasadą FIFO.
 * </p>
 */
class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * Tymczasowy stos używany do odwracania kolejności elementów,
     * aby możliwe było ich pobieranie w kolejności FIFO.
     */
    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Zwraca i usuwa najstarszy element (FIFO).
     * <p>
     * Metoda przenosi wszystkie elementy z bieżącego rymowacza
     * do rymowacza tymczasowego, pobiera ostatni z nich,
     * a następnie odtwarza pozostałe elementy w pierwotnej strukturze.
     * </p>
     *
     * @return najstarszy dodany element lub -1, jeśli rymowacz jest pusty
     */
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
