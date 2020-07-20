package stuCal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LogIn extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameTF;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					LogIn frame = new LogIn(); //invoke the frame
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * check if username and password is correct
	 * @param uName entered username
	 * @param uPass entered password
	 */
	public static void validateLogin(String uName, char[] uPass)
	{		
		String correctPassword = getPassword(uName); //get password from Database
		String passString = String.valueOf(uPass); //turn char[] to string
		
		if (uName.equals("Hello") && passString.equals(correctPassword))
		{
			JOptionPane.showMessageDialog(null, "Welcome, " + uName
					+ "\n" + "Please choose a function");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Combination not recognized, please try again!");
		}
	}
	
	/*
	 * get the username and return its matching password from the database
	 * not yet implemented
	 */
	public static String getPassword(String uName)
	{
		String password = "dummydata"; 
		if (uName.equals("Hello")) //this should be done with a DB instead
		{
			password = "world";
		}
		return password;
	}
	
	
	/**
	 * Create the frame.
	 * Sets the action listener
	 */
	public LogIn()
	{
		setResizable(false);
		setTitle("Student Calendar System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel MainLabel = new JLabel("Student Calendar System");
		MainLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 28));
		MainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		usernameTF = new JTextField();
		usernameTF.setColumns(10);
		
		/*
		 * Login button and cancel button
		 */
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				validateLogin(usernameTF.getText(), passwordField.getPassword());
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() 
		{
			//show a message and exit the application when cancel is pressed
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(null, "Account required to use the application!");
				setVisible(false); //turn the frame invisible (used for speed)
				dispose(); //Remove the JFrame object
			}
		});
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(129)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
							.addGap(120))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(MainLabel, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
							.addGap(80))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
									.addGap(33)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(passwordField)
										.addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap(103, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(MainLabel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 1, Short.MAX_VALUE)))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLogin)
						.addComponent(btnCancel))
					.addGap(92))
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.getRootPane().setDefaultButton(btnLogin);//have Enter key press the submit button
	}
	

}
