import java.util.concurrent.atomic.AtomicInteger;

/**
 * Thread safely generates sequence 1,2,3...
 */

public class SequenceGenerator {
    private AtomicInteger num = new AtomicInteger(1);
    // we can skip 'synchronized' because of using Atomic class instead int
    public int getNext(){
        return num.getAndIncrement();
    }
}
