package codeWithNLayeredApp.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged(DATABASE): " + data);
		
	}

}
