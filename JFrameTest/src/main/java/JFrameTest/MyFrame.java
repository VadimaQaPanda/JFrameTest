package JFrameTest;


//Import the necessary namespaces
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



//Class of the main program window
public class MyFrame extends JFrame {

	JTextField testName, jTextField1;
	JLabel xmlLabel;
	String xmlHtml;
	TextArea textArea;
	JButton buttonAllSitesAndLocations;

	//designer
	public MyFrame(){
		//Specifies the action to take when you exit the program
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Sets the size and location.
		setLocation(750, 350);
		setSize(500, 500);
		setTitle("Title");
		//Ask a container for components.
		JPanel panel = new JPanel();
		panel.setLayout(null);

		// JLabel
		xmlHtml = "<html><font color=\'#800080\' size=\'2\' face=\'Verdana\'>&lt;?xml version='1.0' encoding='UTF-8'?></font></html>";
		xmlLabel = new JLabel(xmlHtml);
		xmlLabel.setBounds(10, 10, 400, 10);
		panel.add(xmlLabel);

		xmlHtml = "<html><font color=\'#800080\' size=\'2\' face=\'Verdana\'>&lt;!DOCTYPE suite SYSTEM 'http://testng.org/testng-1.0.dtd'></font></html>";
		xmlLabel = new JLabel(xmlHtml);
		xmlLabel.setBounds(10, 20, 400, 10);
		panel.add(xmlLabel);

		xmlHtml = "<html><font color=\'#800080\' size=\'2\' face=\'Verdana\'>&lt;suite name='Test' parallel='tests' thread-count='1'></font></html>";
		xmlLabel = new JLabel(xmlHtml);
		xmlLabel.setBounds(10, 30, 400, 10);
		panel.add(xmlLabel);

		xmlHtml = "<html><font color=\'#800080\' size=\'2\' face=\'Verdana\'>&lt;test name='Test'></font></html>";
		xmlLabel = new JLabel(xmlHtml);
		xmlLabel.setBounds(10, 50, 400, 10);
		panel.add(xmlLabel);

		// textArea
		String textAreaString = "<parameter name='site' value='UPFORIT'/>\n"
				+"<classes>\n"
				+"   <class name='phoenix.web.tests.smoke.SmokeRel'>\n"
				+"      <methods>\n"
				+"        <include name='checkSuccessfulRegistration' />\n"
				+"        <include name='checkAutologinFromAdmin' />\n"
				+"        <include name='checkSuccessfulConfirm' />\n"
				+"      </methods>\n"
				+"   </class>\n"
				+"</classes>\n";
		textArea = new TextArea(textAreaString);
		textArea.setBounds(10, 60, 400, 200);
		panel.add(textArea);

		// JLabel
		xmlHtml = "<html><font color=\'#800080\' size=\'2\' face=\'Verdana\'>&lt;/test></font></html>";
		xmlLabel = new JLabel(xmlHtml);
		xmlLabel.setBounds(10, 260, 400, 10);
		panel.add(xmlLabel);



		/*

	    TextArea textAreaBody = new TextArea(textAreaString);
	    textAreaBody.setBounds(10, 100, 400, 75);
		panel.add(textAreaBody);
		 */

		/*	
		//JTextField
		testName = new JTextField("test name example:");
		testName.setBounds(10, 30, 300, 100);

		panel.add(testName);



		// JLabel
		JLabel label1 = new JLabel("Test1");
		label1.setBounds(10, 150, 100, 10);
		panel.add(label1);


		//JTextField
		jTextField1 = new JTextField("example1:", 20);
		jTextField1.setBounds(10, 200, 300, 100);
		panel.add(jTextField1);



		textArea = new TextArea("Ваш заказ:");
		textArea.setBounds(10, 300, 300, 100);
		panel.add(textArea);
		 */

		//Create a button buttonAllSitesAndLocations.
		buttonAllSitesAndLocations = new JButton("Create config for all sites and locations");
		buttonAllSitesAndLocations.setBounds(10, 400, 300, 25);
		//Add a button to the container.
		panel.add(buttonAllSitesAndLocations);

		//Adding a handler for the button buttonAllSitesAndLocations.
		buttonAllSitesAndLocations.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//change Btn

				String textAreaString = textArea.getText();
				setTitle(textAreaString);
				// sleep
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				// alert
				JOptionPane.showMessageDialog(null, "xml confi mas be created 'config/");
				// close
				System.exit(getDefaultCloseOperation());

			}
		});


		getContentPane().add(panel);
		setPreferredSize(new Dimension(285, 145));

	}

	public static void main(String[] args) {
		//Creating the main window.
		new MyFrame().setVisible(true);
	}

	public void windowClosing(WindowEvent ev) {
		System.exit(0);
	}
}