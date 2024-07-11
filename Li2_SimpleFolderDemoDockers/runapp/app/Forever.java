import lombok.extern.java.Log;

@Log
class Forever{

	public static void main(String args[]) throws InterruptedException {
	
		log.info("Run Forever using Lombok..!");
		System.out.println("I am Forever Java!");
		
		Thread.currentThread().join();
	
	}

}