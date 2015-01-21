package JFrameTest;


//Импортируем нужные пространства имен.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.*;

import org.w3c.dom.Text;


//Класс основного окна программы.
public class MyFrame extends JFrame {

	JTextField testName, jTextField1;
	private Text       textBox;
	
	// Переменная для кнопки.
	public JButton button;
	// Конструктор.
	public MyFrame(){
		// Задаем действие,
		// выполняемое при выходе из программы.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Устанавливаем размеры и расположение.
		setLocation(750, 350);
		setSize(500, 500);
		setTitle("Title");
		// Задаем контейнер для компонентов.
//		Container con = getContentPane();
//		con.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
	    panel.setLayout(null);


	    // textArea
	    String textAreaString = "<?xml version='1.0' encoding='UTF-8'?>\n"
	    +"<!DOCTYPE suite SYSTEM 'http://testng.org/testng-1.0.dtd'>\n"
	    +"<suite name='Search Chek Web' parallel='tests' thread-count='1'>";
	    TextArea textAreaDeader = new TextArea(textAreaString);
	    textAreaDeader.setBounds(10, 10, 400, 75);
		panel.add(textAreaDeader);
	    
	    TextArea textAreaBody = new TextArea(textAreaString);
	    textAreaBody.setBounds(10, 100, 400, 75);
		panel.add(textAreaBody);
		
		
/*	
		// Создание JTextField
		testName = new JTextField("test name example:");
		testName.setBounds(10, 30, 300, 100);
		// Добавление JTextField к контейнеру.
		panel.add(testName);
		
		

		// JLabel
		JLabel label1 = new JLabel("Test1");
		label1.setBounds(10, 150, 100, 10);
		panel.add(label1);
		

		// Создание JTextField
		jTextField1 = new JTextField("example1:", 20);
		jTextField1.setBounds(10, 200, 300, 100);
		// Добавление JTextField к контейнеру.
		panel.add(jTextField1);

		
		
		textArea = new TextArea("Ваш заказ:");
		textArea.setBounds(10, 300, 300, 100);
		panel.add(textArea);
*/
		
		// Создание кнопки.
		button = new JButton("Press me");
		button.setBounds(10, 400, 100, 25);
		// Добавление кнопки к контейнеру.
		panel.add(button);

		// Добавление обработчика для кнопки.
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// Изменение Btn

				String testNameString = testName.getText();
				setTitle(testNameString);
				// sleep
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				// alert
				JOptionPane.showMessageDialog(null, testNameString+".xml confi mas be created 'config/"+testNameString+".xml");
				// close
				System.exit(getDefaultCloseOperation());

			}
		});

		
        getContentPane().add(panel);
        setPreferredSize(new Dimension(285, 145));
        
	}

	public static void main(String[] args) {
		// Создание главного окна.
		new MyFrame().setVisible(true);
	}

	public void windowClosing(WindowEvent ev) {
		System.exit(0);
	}
}