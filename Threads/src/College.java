
public class College implements Runnable {

	private static String message;
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(500);
				setMessage("College Iteration "+ i);		
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		College.message = message;
		Main.collegeText.setText(message);
		System.out.println(message);
	}		
}