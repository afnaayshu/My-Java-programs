package gui;
import java.awt.*;
//import java.awt.event.Itemlistener;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener{
	TextField text1; 
	TextField text2;
	TextField text3;
	TextField text4;
	Button button;
	RegistrationForm()
	{
		setTitle("Registraion Form");
		setLayout(null);
		setSize(1000,600);  
		//setResizable(false);
		 
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);
		Font labelFont =new  Font("arial", Font.PLAIN, 18); 
		Font buttonFont = new Font("fira sans",Font.BOLD, 20);
		
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Label Title = new Label("Registration Form"); 
		Title.setBounds(250,40,300,50);
		Title.setFont(titleFont);
		Title.setForeground(Color.YELLOW);
		add(Title);
		
		//name
		Label username = new Label("Name  :");
		text1 = new TextField();
		username.setBounds(250,100,150,30);
		text1.setBounds(400,100,400,30);
		username.setFont(labelFont);
		username.setForeground(Color.WHITE);
		add(username);
		add(text1);
		
		//age
		Label age = new Label("Age     :");
		text2 = new TextField();
		age.setBounds(250,150,150,30);
		text2.setBounds(400,150,400,30);
		age.setFont(labelFont);
		age.setForeground(Color.WHITE);
		add(age);
		add(text2);
		
		//class
		Label classname = new Label("Class   :");
		text3 = new TextField();
		classname.setBounds(250,200,150,30);
		text3.setBounds(400,200,400,30);
		classname.setFont(labelFont);
		classname.setForeground(Color.WHITE);
		add(classname);
		add(text3);
		
		//email
		Label email = new Label("Email   :");
		text4 = new TextField();
		email.setBounds(250,250,150,30);
		text4.setBounds(400,250,400,30);
		email.setFont(labelFont);
		email.setForeground(Color.WHITE);
		add(email);
		add(text4);
		
		//BUTTON
		button = new Button("SUBMIT");
		button.setBounds(300,350,100,30);
		button.setForeground(Color.WHITE);
		button.setFont(buttonFont);
		button.setBackground(Color.RED);	
		button.addActionListener(this);
		add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		RegistrationForm form = new RegistrationForm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(text1.getText());
		System.out.println(text2.getText());
		System.out.println(text3.getText());
		System.out.println(text4.getText());
		
	}

}
