package pcd.lab02.lost_updates;

public class TestCounter {

	public static void main(String[] args) throws Exception {
		int ntimes = 500000;//Integer.parseInt(args[0]);
		Object lock = new Object();
		SafeCounter c = new SafeCounter(0, lock);
		Worker w1 = new Worker(c,ntimes);
		Worker w2 = new Worker(c,ntimes);

		Cron cron = new Cron();
		cron.start();
		w1.start();
		w2.start();
		w1.join();
		w2.join();
		cron.stop();
		System.out.println("Counter final value: "+c.getValue()+" in "+cron.getTime()+"ms.");
	}
}
