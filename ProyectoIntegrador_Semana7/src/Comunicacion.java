import java.io.IOException;

public class Comunicacion extends Thread {
	
	// testing
	@Override
	public void run() {
		while(true){
			try {
				recibir();
				sleep(100);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	private void recibir() throws IOException{
				
	}
// ejemplo de mal uso...
}
