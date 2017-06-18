package br.com.fiap.exe1;

import java.util.Stack;

public class LogPrint extends Thread {
	@Override
	public void run() {
		Stack<String> msgs = new Stack<>();
		msgs.push("Mensagem 1");
		msgs.push("Mensagem 2");
		msgs.push("Mensagem 3");
		msgs.push("Mensagem 4");

		while (!msgs.isEmpty()) {
			System.out.println(msgs.pop());
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
