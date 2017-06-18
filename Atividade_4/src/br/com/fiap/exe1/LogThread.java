package br.com.fiap.exe1;
public class LogThread extends Thread {
	
	public LogPrint logPrint = new LogPrint();
	public LogPrintTime logPrintTime = new LogPrintTime();
	
	@Override
	public void run() {
		while (true) {
			System.out.println(logPrint.getState());
			System.out.println(logPrintTime.getState());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
