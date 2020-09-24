package repaso;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CuentaAtras extends JFrame {
	
	static boolean proceso;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame ventana = new JFrame();
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.setTitle("contador");
		ventana.setSize(500,500);
		
		proceso = true;
	
		JButton btnStop = new JButton("STOP");
		ventana.add(btnStop, BorderLayout.NORTH);
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CuentaAtras.proceso = false;
			}
		});
		
		JLabel lblContador = new JLabel("");
		ventana.add(lblContador, BorderLayout.CENTER);
		
		JLabel lblContadorInferior = new JLabel("");
		ventana.add(lblContadorInferior, BorderLayout.SOUTH);
		ventana.setVisible(true);
		
		Thread t = new Thread(new Runnable() {
			int i = 0;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(proceso) {
					System.out.println("A= " + i);
					i++;
					lblContador.setText(i + "= A");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			int i = 20;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(i >= 0) {
					System.out.println("B = " + i);
					i--;
					lblContadorInferior.setText(i + "= B");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		t.start();
		t2.start();

	}

}