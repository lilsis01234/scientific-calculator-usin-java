package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class examen {

	private JFrame frame;
	private JTextField textField;
	double nbr1;
	double nbr2;
	double resultat;
	String operation;
	String rep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
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
	public examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 448, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 116, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton ln = new JButton("ln");
		ln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nbr = Double.parseDouble(textField.getText());
				double res = Math. log(nbr);
				textField.setText(Double.toString(res));
			}
		});
		ln.setFont(new Font("Arial Black", Font.BOLD, 14));
		ln.setBounds(137, 47, 85, 21);
		frame.getContentPane().add(ln);
		
		JButton expo = new JButton("e");
		expo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nbr = Double.parseDouble(textField.getText());
				double res = Math. exp(nbr);
				textField.setText(Double.toString(res));
			}
		});
		expo.setFont(new Font("Arial Black", Font.BOLD, 14));
		expo.setBounds(232, 47, 85, 21);
		frame.getContentPane().add(expo);
		
		JButton facto = new JButton("!");
		facto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nbr = Integer.parseInt(textField.getText());
				int fact=1;
				int i =1;

				for(i = 1; i <= nbr; i++)
		        {
		            fact = fact * i;
		        }
				textField.setText(Integer.toString(fact));
				
				if(nbr==0) {
					fact=1;
					textField.setText(Integer.toString(fact));
				}
			}});
		facto.setFont(new Font("Arial Black", Font.BOLD, 14));
		facto.setBounds(327, 47, 85, 21);
		frame.getContentPane().add(facto);
		
		JButton fois = new JButton("x");
		fois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		fois.setFont(new Font("Arial Black", Font.BOLD, 14));
		fois.setBounds(10, 47, 116, 21);
		frame.getContentPane().add(fois);
		
		JButton moins = new JButton("-");
		moins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		moins.setFont(new Font("Arial Black", Font.BOLD, 18));
		moins.setBounds(10, 78, 116, 21);
		frame.getContentPane().add(moins);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		plus.setFont(new Font("Arial Black", Font.BOLD, 14));
		plus.setBounds(10, 109, 116, 21);
		frame.getContentPane().add(plus);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		div.setFont(new Font("Arial Black", Font.BOLD, 14));
		div.setBounds(10, 140, 116, 21);
		frame.getContentPane().add(div);
		
		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnzero.getText();
				textField.setText(number);
			}		
			});
		btnzero.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnzero.setBounds(10, 171, 116, 21);
		frame.getContentPane().add(btnzero);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
			}		
			});
		btnClear.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnClear.setBounds(136, 78, 85, 21);
		frame.getContentPane().add(btnClear);
		
		
		JButton btnsquare = new JButton("X^n");
		btnsquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "^";
				
			}
		});
		btnsquare.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnsquare.setBounds(232, 78, 85, 21);
		frame.getContentPane().add(btnsquare);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nbr1 = textField.getText();
				double nbr = Double.parseDouble(nbr1);
				double nbr3 = Math.sqrt(nbr);
				textField.setText(Double.toString(nbr3));
				
			}
		});
		btnSqrt.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnSqrt.setBounds(327, 78, 85, 21);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nbr = Double.parseDouble(textField.getText());
				double res = Math. cos(nbr);
				textField.setText(Double.toString(res));
				
			}
		});
		btnCos.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnCos.setBounds(136, 110, 85, 21);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double nbr = Double.parseDouble(textField.getText());
				double res = Math. sin(nbr);
				textField.setText(Double.toString(res));
			}
		});
		btnSin.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnSin.setBounds(232, 110, 85, 21);
		frame.getContentPane().add(btnSin);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nbr1= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		
		btnModulo.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnModulo.setBounds(327, 112, 85, 21);
		frame.getContentPane().add(btnModulo);
		
		JButton btnone = new JButton("1");
		btnone.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			String number=textField.getText()+btnone.getText();
			textField.setText(number);
		}		
		});
		btnone.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnone.setBounds(137, 140, 85, 21);
		frame.getContentPane().add(btnone);
		
		
		JButton btntwo = new JButton("2");
		btntwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btntwo.getText();
				textField.setText(number);
			}		
			});
		btntwo.setFont(new Font("Arial Black", Font.BOLD, 14));
		btntwo.setBounds(232, 140, 85, 21);
		frame.getContentPane().add(btntwo);
		
		
		
		JButton btnthree = new JButton("3");
		btnthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnthree.getText();
				textField.setText(number);
			}		
			});
		btnthree.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnthree.setBounds(327, 140, 85, 21);
		frame.getContentPane().add(btnthree);
		
		
		JButton btnfour = new JButton("4");
		btnfour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnfour.getText();
				textField.setText(number);
			}		
			});
		btnfour.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnfour.setBounds(137, 171, 85, 21);
		frame.getContentPane().add(btnfour);
		
		
		JButton btnfive = new JButton("5");
		btnfive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnfive.getText();
				textField.setText(number);
			}		
			});
		btnfive.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnfive.setBounds(232, 171, 85, 21);
		frame.getContentPane().add(btnfive);
		
		
		JButton btnsix = new JButton("6");
		btnsix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnsix.getText();
				textField.setText(number);
			}		
			});
		btnsix.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnsix.setBounds(327, 171, 85, 21);
		frame.getContentPane().add(btnsix);
		
		
		JButton btnseven = new JButton("7");
		btnseven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnseven.getText();
				textField.setText(number);
			}		
			});
		btnseven.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnseven.setBounds(137, 202, 85, 21);
		frame.getContentPane().add(btnseven);
		
		
		JButton btneight = new JButton("8");
		btneight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btneight.getText();
				textField.setText(number);
			}		
			});
		btneight.setFont(new Font("Arial Black", Font.BOLD, 14));
		btneight.setBounds(232, 202, 85, 21);
		frame.getContentPane().add(btneight);
		
		
		JButton btnnine = new JButton("9");
		btnnine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btnnine.getText();
				textField.setText(number);
			}		
			});
		btnnine.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnnine.setBounds(327, 202, 85, 21);
		frame.getContentPane().add(btnnine);
		
		
		JButton v = new JButton(".");
		v.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+v.getText();
				textField.setText(number);
			}		
			});
		v.setFont(new Font("Arial Black", Font.BOLD, 14));
		v.setBounds(10, 202, 116, 21);
		frame.getContentPane().add(v);
		
		
		JButton egal = new JButton("=");
		egal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rep ;
				nbr2 = Double.parseDouble(textField.getText());
				if(operation=="+") {
					resultat = nbr1+nbr2;
					rep = String.format("%.2f", resultat);
					textField.setText(rep);
				
				}
				if(operation=="-") {
					resultat = nbr1-nbr2;
					rep = String.format("%.2f", resultat);
					textField.setText(rep);
				
				}
				if(operation=="*") {
					resultat = nbr1*nbr2;
					rep = String.format("%.2f", resultat);
					textField.setText(rep);
				
				}
				if(operation=="/") {
					resultat = nbr1/nbr2;
					rep = String.format("%.2f", resultat);
					textField.setText(rep);
				
				}
				if(operation=="%") {
					resultat = nbr1%nbr2;
					rep = String.format("%.2f", resultat);
					textField.setText(rep);
				
				}
				if(operation=="^") {
					resultat = Math.pow(nbr1,nbr2);
					rep = Double.toString(resultat);
					textField.setText(rep);
				}
			}
		});
		egal.setFont(new Font("Arial Black", Font.BOLD, 14));
		egal.setBounds(10, 236, 402, 21);
		frame.getContentPane().add(egal);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace = str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(136, 13, 276, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
