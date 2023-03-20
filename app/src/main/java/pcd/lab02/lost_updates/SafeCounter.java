package pcd.lab02.lost_updates;

public class SafeCounter {

    private int cont;
    private final Object lock;

    public SafeCounter(int base, Object lock){
        this.cont = base;
        this.lock = lock;
    }

    public synchronized void inc(){
        cont++;
    }

    public int getValue(){
        return cont;
    }
}
