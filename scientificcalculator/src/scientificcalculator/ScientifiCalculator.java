package scientificcalculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ScientifiCalculator {

	private JFrame frame;
	private JTextField txtDisplay;
	String operations;
	double firstnum;
	double secondnum;
	double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScientifiCalculator window = new ScientifiCalculator();
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
	public ScientifiCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 367, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// ....................toprow......................
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if (txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length() - 1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setBounds(79, 152, 63, 50);
		btnBackSpace.setFont(new Font("Wingding", Font.BOLD, 15));
		frame.getContentPane().add(btnBackSpace);

		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setBounds(152, 151, 60, 50);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnClear);

		JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+" % ");
				operations = "%";
			}
		});
		btnPer.setBounds(222, 152, 58, 50);
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(btnPer);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+" + ");
				operations = "+";
			}
		});
		btnPlus.setBounds(290, 151, 50, 50);
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnPlus);
		// ....................row1......................
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"7");
			}
		});
		btn7.setBounds(79, 206, 63, 50);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"8");
			}
		});
		btn8.setBounds(152, 206, 60, 50);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"9");
			}
		});
		btn9.setBounds(222, 206, 58, 50);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn9);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+" - ");
				operations = "-";
			}
		});
		btnSub.setBounds(290, 206, 50, 50);
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnSub);
		// ......................row2.............................
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"4");
			}
		});
		btn4.setBounds(79, 257, 63, 50);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"5");
			}
		});
		btn5.setBounds(152, 257, 60, 50);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"6");
			}
		});
		btn6.setBounds(222, 257, 58, 50);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn6);

		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+" * ");
				operations = "*";
			}
		});
		btnMul.setBounds(290, 257, 50, 50);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnMul);

		// ......................row3.............................
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"1");
			}
		});
		btn1.setBounds(79, 308, 63, 50);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"2");
			}
		});
		btn2.setBounds(152, 308, 60, 50);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"3");
			}

		});
		btn3.setBounds(222, 308, 58, 50);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+" / ");
				operations = "/";
			}
		});
		btnDiv.setBounds(290, 308, 50, 50);
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDiv);

		// ......................row4.............................
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+"0");
			}
		});
		btn0.setBounds(6, 369, 63, 50);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btn0);

		JButton btnDec = new JButton(".");
		btnDec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+".");
			}
		});
		btnDec.setBounds(79, 369, 60, 50);
		btnDec.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnDec);

		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setBounds(152, 369, 58, 50);
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				
				txtDisplay.setText(txtDisplay.getText()+" = ");
				String str=txtDisplay.getText();
				String[] substr=str.split("\\s+"); 
				firstnum=Double.parseDouble(substr[0]);
				secondnum=Double.parseDouble(substr[2]);
				
				if (operations == "+") {
					
					result=(firstnum+secondnum);
					txtDisplay.setText(txtDisplay.getText()+" "+result);
				} 
				else if (operations == "-") {
					result=(firstnum-secondnum);
					txtDisplay.setText(txtDisplay.getText()+" "+result);

				} 
				else if (operations == "/") {
					result=(firstnum/secondnum);
					txtDisplay.setText(txtDisplay.getText()+" "+result);

				} else if (operations == "*") {
					result=(firstnum*secondnum);
					txtDisplay.setText(txtDisplay.getText()+" "+result);

				} else if (operations == "%") {
					result=(firstnum%secondnum);
					txtDisplay.setText(txtDisplay.getText()+" "+result);

				} 
				else if (operations == "x^y") {
					
					double resultt = 1;
					for (int i = 0; i < secondnum; i++) {
						resultt = firstnum * resultt;
					}
					result=resultt;
					txtDisplay.setText(txtDisplay.getText()+" "+result);
		

				}
				
				firstnum = result;

			}
		});
		btnEqual.setBounds(222, 369, 118, 50);
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.getContentPane().add(btnEqual);

		JButton btnFactorial = new JButton("n!");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(txtDisplay.getText());
				double fact = 1;
				while (a != 0) {
					fact = fact * a;
					a--;
				}
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + fact);
			}
		});
		btnFactorial.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFactorial.setBounds(6, 308, 63, 50);
		frame.getContentPane().add(btnFactorial);

		JButton btnSquare = new JButton("x^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText()));
				
				txtDisplay.setText(txtDisplay.getText()+" "+(a*a));
			}
		});
		btnSquare.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSquare.setBounds(6, 258, 63, 50);
		frame.getContentPane().add(btnSquare);

		JButton btnCube = new JButton("x^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText(txtDisplay.getText()+"= " +(a*a*a));
			}
		});
		btnCube.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCube.setBounds(6, 206, 63, 50);
		frame.getContentPane().add(btnCube);

		JButton btnXpowerY = new JButton("X^y");
		btnXpowerY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText(txtDisplay.getText()+" ^ ");
				operations = "x^y";
			}
		});
		btnXpowerY.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnXpowerY.setBounds(6, 152, 63, 50);
		frame.getContentPane().add(btnXpowerY);

		JButton btnDivByX = new JButton("1/x");
		btnDivByX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = 1 / (Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText(txtDisplay.getText()+"="+ a);
			}
		});
		btnDivByX.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDivByX.setBounds(6, 102, 63, 50);
		frame.getContentPane().add(btnDivByX);

		JButton btnSquareRoot = new JButton("\u221A");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sqrt(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnSquareRoot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSquareRoot.setBounds(6, 49, 63, 50);
		frame.getContentPane().add(btnSquareRoot);

		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.log(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLog.setBounds(79, 102, 63, 50);
		frame.getContentPane().add(btnLog);

		JButton btnExponent = new JButton("e^x");
		btnExponent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(txtDisplay.getText()));
			
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnExponent.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExponent.setBounds(79, 49, 63, 50);
		frame.getContentPane().add(btnExponent);

		JButton btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSinh.setBounds(150, 102, 60, 50);
		frame.getContentPane().add(btnSinh);

		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSin.setBounds(149, 49, 63, 50);
		frame.getContentPane().add(btnSin);

		JButton btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cosh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCosh.setBounds(217, 102, 63, 50);
		frame.getContentPane().add(btnCosh);

		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnCos.setBounds(217, 49, 63, 50);
		frame.getContentPane().add(btnCos);

		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTan.setBounds(277, 49, 63, 50);
		frame.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(txtDisplay.getText()));
				txtDisplay.setText("");
				txtDisplay.setText(txtDisplay.getText() + a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnTanh.setBounds(277, 102, 63, 50);
		frame.getContentPane().add(btnTanh);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDisplay.setBounds(6, 11, 334, 32);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);



	}
}
