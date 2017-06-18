package br.com.fiap.exe1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogPrintTime extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
