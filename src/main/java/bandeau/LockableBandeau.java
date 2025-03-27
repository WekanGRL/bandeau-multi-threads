package bandeau;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockableBandeau extends Bandeau {
    private Lock bandeauLock = new ReentrantLock();

    public void lock() throws InterruptedException {
        bandeauLock.lockInterruptibly();
    }

    public void unlock(){
        bandeauLock.unlock();
    }
}
