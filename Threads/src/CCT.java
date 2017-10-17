
public class CCT extends Thread {

	private static String message;
	public CCT() {

	}

	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(350);
				setMessage("CCT Iteration "+ i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static String getMessage() {
		return message;
	}


	public static void setMessage(String message) {
		CCT.message = message;
		Main.cctText.setText(message);
		System.out.println(message);
	}
}