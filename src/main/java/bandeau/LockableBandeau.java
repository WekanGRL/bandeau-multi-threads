package bandeau;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockableBandeau extends Bandeau {
    private Lock bandeauLock = new ReentrantLock();

    public boolean tryLock(int delay) throws InterruptedException {
        return bandeauLock.tryLock(delay, TimeUnit.MILLISECONDS);
    }

    public void unlock(){
        bandeauLock.unlock();
    }
}
