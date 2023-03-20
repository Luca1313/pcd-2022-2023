package pcd.lab02.lost_updates;


public class Worker extends Thread {

	private SafeCounter counter;
	private int ntimes;
	
	public Worker(SafeCounter c, int ntimes){
		this.counter = c;
		this.ntimes = ntimes;
	}
	
	public void run(){
		for (int i = 0; i < this.ntimes; i++){
			this.counter.inc();
		}
	}
}
