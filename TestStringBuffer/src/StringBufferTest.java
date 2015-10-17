public class StringBufferTest {
	private StringBuffer contents = new StringBuffer();

	public void log(String message) {
		contents.append(System.currentTimeMillis());
		contents.append("; ");
		contents.append(Thread.currentThread().getName());
		for (int i = 0; i < 10000; i++) {
			contents.append(i);
			contents.append(message); // append�������̰߳�ȫ�ģ��޸�contentsʱ�������߳��޷����ʡ�
			contents.append("\n");
		}
		contents.append("\n\n");
	}

	public void getContents() {
		System.out.println(contents);
	}
	
	public synchronized void synLog(String message) {
		contents.append(System.currentTimeMillis());
		contents.append("; ");
		contents.append(Thread.currentThread().getName());
		for (int i = 0; i < 10000; i++) {
			contents.append(i);
			contents.append(message); // append�������̰߳�ȫ�ģ��޸�contentsʱ�������߳��޷����ʡ�
			contents.append("\n");
		}
		contents.append("\n\n");
	}

	public synchronized void synGetContents() {
		System.out.println(contents);
	}
}
