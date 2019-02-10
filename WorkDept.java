import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class LoginPage extends JFrame implements ActionListener{
	Container cp;
	Label usernameL, passwordL, inst;
	JTextField usernameT;
	JPasswordField passwordT;
	JButton login;

	public LoginPage(){
		super("Worker Department");
		cp = getContentPane();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		inst = new Label("You must have to login first!");
		usernameL = new Label("Username:");
		passwordL = new Label("Password:");
		usernameT = new JTextField();
		passwordT = new JPasswordField();
		login = new JButton("Login");

		inst.setBounds(100, 40, 200, 20);
		usernameL.setBounds(50, 100, 100, 30);
		usernameT.setBounds(200, 100, 250, 30);
		passwordL.setBounds(50, 150, 100, 30);
		passwordT.setBounds(200, 150, 250, 30);
		login.setBounds(200, 200, 100, 40);

		cp.add(inst);
		cp.add(login);
		cp.add(passwordT);
		cp.add(usernameL);
		cp.add(passwordL);
		cp.add(usernameT);

		login.addActionListener(this);

		setLayout(null);
		//setLocationRelativeTo(null);
		setSize(500, 700);
	}

	public void actionPerformed(ActionEvent e){
		new FirstPage();
		this.setVisible(false);
	}
}

class FirstPage extends JFrame{
	JMenuBar menuBar;
	JMenu worker, sift, group;
	JMenuItem add, remove, modify;
	Container cp;
	AddPanel addPanel;

	public FirstPage(){
		super("Work Department");
		cp = getContentPane();
		setSize(500, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);

		menuBar = new JMenuBar();
		worker = new JMenu("Manage Workers");
		sift = new JMenu("Manage Shifts");
		group = new JMenu("Manage Groups");
		add = new JMenuItem("Add new Worker");
		remove = new JMenuItem("Remove Worker");
		modify = new JMenuItem("modify worker details");
		addPanel = new AddPanel();
		
		worker.add(add);
		worker.add(remove);
		worker.add(modify);

		menuBar.add(worker);
		menuBar.add(sift);
		menuBar.add(group);

		menuBar.setBounds(0, 0, 500, 30);
		addPanel.setBounds(0, 30, 670, 500);
		add.addActionListener(new GetAddPage());

		cp.add(menuBar);
		//cp.add(addPanel);
	}

	class GetAddPage implements ActionListener{
		public void actionPerformed(ActionEvent e){
			cp.add(addPanel);
			repaint();
		}
	}

	class AddPanel extends JPanel{
		Label head, idL, nameL, gradeL, designationL, esiNoL, acNoL, panL, pfNoL, phoneL, addrL, genL;
		JTextField idT, nameT, gradeT, designationT, esiNoT, acNoT, panT, pfNoT, phoneT;
		public void paintComponent(Graphics g){
			head = new Label("Enter the details for the new Employee");
			idL = new Label("ID:");
			nameL = new Label("Name:");
			gradeL = new Label("Grade: ");
			designationL = new Label("designation:");
			esiNoL = new Label("ESI No.:");
			acNoL = new Label("Account No.:");
			panL = new Label("PAN:");
			pfNoL = new Label("PF No.:");
			phoneL = new Label("Phone No.:");
			addrL = new Label("Address:");
			genL = new Label("Gender:");
			
			idT = new JTextField();
			nameT = new JTextField();
			gradeT = new JTextField();
			designationT = new JTextField();
			esiNoT = new JTextField();
			acNoT = new JTextField();
			panT = new JTextField();
			pfNoT = new JTextField();
			phoneT = new JTextField();

			head.setBounds(100, 10, 250, 20);
			idL.setBounds(50, 50, 100, 30);
			nameL.setBounds(50, 100, 100, 30);
			gradeL.setBounds(50, 150, 100, 30);
			designationL.setBounds(50, 200, 100, 30);
			esiNoL.setBounds(50, 250, 100, 30);
			acNoL.setBounds(50, 300, 100, 30);
			panL.setBounds(50, 350, 100, 30);
			pfNoL.setBounds(50, 400, 100, 30);
			phoneL.setBounds(50, 450, 100, 30);
			addrL.setBounds(50, 500, 100, 30);
			genL.setBounds(50, 550, 100, 30);

			idT.setBounds(200, 50, 100, 30);
			nameT.setBounds(200, 100, 100, 30);
			gradeT.setBounds(200, 150, 100, 30);
			designationT.setBounds(200, 200, 100, 30);
			esiNoT.setBounds(200, 250, 100, 30);
			acNoT.setBounds(200, 300, 100, 30);
			panT.setBounds(200, 350, 100, 30);
			pfNoT.setBounds(200, 400, 100, 30);
			phoneT.setBounds(200, 450, 100, 30);
			//addrL.setBounds(50, 500, 100, 30);
			//genL.setBounds(50, 550, 100, 30);			

			setVisible(true);
			add(head);
			add(idL);
			add(nameL);
			add(gradeL);
			add(designationL);
			add(esiNoL);
			add(acNoL);
			add(panL);
			add(pfNoL);
			add(phoneL);
			add(addrL);
			add(genL);

			add(idT);
			add(nameT);
			add(gradeT);
			add(designationT);
			add(esiNoT);
			add(acNoT);
			add(panT);
			add(pfNoT);
			add(phoneT);
			//add(addrL);
			//add(genL);

		}
	}
}

public class WorkDept {
	public static void main(String []args){
		new LoginPage();
	}
}