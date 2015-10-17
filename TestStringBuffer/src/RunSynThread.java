/**
 * 线程安全
 * @author Administrator
 *
 */
public class RunSynThread extends Thread {
	String message;
	StringBufferTest buffer;

	public RunSynThread(StringBufferTest buffer, String message) {
		this.buffer = buffer;
		this.message = message;
	}

	public void run() {
		while (true) {
			buffer.synLog(message);
			buffer.synGetContents();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferTest ss = new StringBufferTest();
		new RunSynThread(ss, "you").start();
		new RunSynThread(ss, "me").start();
		new RunSynThread(ss, "she").start();
	}

}
