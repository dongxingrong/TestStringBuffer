/**
 * 非线程安全
 * 
 * @author Administrator
 * 
 */
public class RunThread extends Thread {
	String message;
	StringBufferTest buffer;

	public RunThread(StringBufferTest buffer, String message) {
		this.buffer = buffer;
		this.message = message;
	}

	public void run() {
		while (true) {
			buffer.log(message);
			buffer.getContents();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBufferTest ss = new StringBufferTest();
		new RunThread(ss, "you").start();
		new RunThread(ss, "me").start();
		new RunThread(ss, "she").start();
	}

}
