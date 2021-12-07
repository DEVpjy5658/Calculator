import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private String func = "ADD";
	private double firstNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel answer = new JLabel("0");
		answer.setHorizontalAlignment(SwingConstants.RIGHT);
		answer.setFont(new Font("Tahoma", Font.PLAIN, 50));
		answer.setBounds(10, 28, 370, 107);
		frame.getContentPane().add(answer);
		
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn0.setBounds(105, 419, 85, 81);
		frame.getContentPane().add(btn0);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn9.setBounds(200, 146, 85, 81);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn8.setBounds(105, 146, 85, 81);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn7.setBounds(10, 146, 85, 81);
		frame.getContentPane().add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn6.setBounds(200, 237, 85, 81);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn5.setBounds(105, 237, 85, 81);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn4.setBounds(10, 237, 85, 81);
		frame.getContentPane().add(btn4);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn3.setBounds(200, 328, 85, 81);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn2.setBounds(105, 328, 85, 81);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn1.setBounds(10, 328, 85, 81);
		frame.getContentPane().add(btn1);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnDot.setBounds(10, 419, 85, 81);
		frame.getContentPane().add(btnDot);
		
		
		JButton btnPlu = new JButton("+");
		btnPlu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "ADD";
			}
		});
		btnPlu.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnPlu.setBounds(295, 146, 85, 81);
		frame.getContentPane().add(btnPlu);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "SUB";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMin.setBounds(295, 237, 85, 81);
		frame.getContentPane().add(btnMin);
		
		JButton btnMul = new JButton("X");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "MULT";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnMul.setBounds(295, 328, 85, 81);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = answer.getText();
				firstNumber = Double.parseDouble(curr);
				answer.setText("0");
				func = "DIV";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnDiv.setBounds(295, 419, 85, 81);
		frame.getContentPane().add(btnDiv);
		
		
		JButton btnRes = new JButton("=");
		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double currValue;
				switch(func)
				{
				case "ADD" : {
					currValue = Double.parseDouble(answer.getText());
					answer.setText((firstNumber + currValue) + "");
					break;
				}
				
				case "SUB" : {
					currValue = Double.parseDouble(answer.getText());
					answer.setText((firstNumber - currValue) + "");
					break;
				}
				
				case "MULT" : {
					currValue = Double.parseDouble(answer.getText());
					answer.setText((firstNumber * currValue) + "");
					break;
				}
				
				case "DIV" : {
					currValue = Double.parseDouble(answer.getText());
					answer.setText((firstNumber / currValue) + "");
					break;
				}
				}
			}
		});
		btnRes.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnRes.setBounds(200, 419, 85, 81);
		frame.getContentPane().add(btnRes);
		
		
		btn0.addActionListener(new NumberActionListener(answer, "0"));
		btn1.addActionListener(new NumberActionListener(answer, "1"));
		btn2.addActionListener(new NumberActionListener(answer, "2"));
		btn3.addActionListener(new NumberActionListener(answer, "3"));
		btn4.addActionListener(new NumberActionListener(answer, "4"));
		btn5.addActionListener(new NumberActionListener(answer, "5"));
		btn6.addActionListener(new NumberActionListener(answer, "6"));
		btn7.addActionListener(new NumberActionListener(answer, "7"));
		btn8.addActionListener(new NumberActionListener(answer, "8"));
		btn9.addActionListener(new NumberActionListener(answer, "9"));
		btnDot.addActionListener(new NumberActionListener(answer, "."));

	}
}

class NumberActionListener implements ActionListener{
	private JLabel label;
	private String text;
	
	public NumberActionListener(JLabel l, String s)
	{
		label = l;
		text = s;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String curr = label.getText();
		if(curr.equals("0"))
		{
			label.setText(text);
		}
		else
		{
			label.setText(label.getText() + text);
		}
	}
	
}