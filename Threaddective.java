public class Threaddective {

	private static int idNumber = 1;
	
	private int myId;
	
	private int[] locker = {1, 2, 3, 4 ,5, 6, 7, 8, 9, 10};

	public Threaddective() {
		myId = idNumber++;
		
		new Thread() {
		
			{setName("Throodle#" + myId);} // initializer
		
			public void run() {
			
				while(true) {
					synchronized(locker) {
						for (int i = 0; i < 1000000; i++) {
							for (int j = 0; j < 10; j++) {
								locker[j] = (int)(Math.random() * 1000);
							}
						}
						writeArray(getName());
					}
				}
				
			}
		}.start();
	}

	private void writeArray(String name) {
	
		System.out.print(name + "= ");
	
		for (int i = 0; i < 10; i ++)
			System.out.println(i + " : " + locker[i] + ", ");
			
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Threaddective t1 = new Threaddective();
		Threaddective t2 = new Threaddective();
		Threaddective t3 = new Threaddective();
		
		while(true) {

			System.out.println("looper");			

			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	
	}

}