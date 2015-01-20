package JFrameTest;


//Импортируем нужные пространства имен.
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//Класс основного окна программы.
public class MyFrame extends JFrame {

	JTextField testName, jTextField1;

	// Переменная для кнопки.
	public JButton button;
	// Конструктор.
	public MyFrame(){
		// Задаем действие,
		// выполняемое при выходе из программы.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Устанавливаем размеры и расположение.
		setLocation(750, 350);
		setSize(300, 500);
		setTitle("Title");
		// Задаем контейнер для компонентов.
		Container con = getContentPane();
		con.setLayout(new FlowLayout());

		// JLabel
		JLabel label = new JLabel("test name");
		con.add(label);
		
		// Создание JTextField
		testName = new JTextField("test name example:", 20);
		// Добавление JTextField к контейнеру.
		con.add(testName);

		// JLabel
		JLabel label1 = new JLabel("Test1");
		con.add(label1);
		
		// Создание JTextField
		jTextField1 = new JTextField("example1:", 20);
		// Добавление JTextField к контейнеру.
		con.add(jTextField1);

		// Создание кнопки.
		button = new JButton("Press me");
		// Добавление кнопки к контейнеру.
		con.add(button);

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

	}

	public static void main(String[] args) {
		// Создание главного окна.
		new MyFrame().setVisible(true);
	}

	public void windowClosing(WindowEvent ev) {
		System.exit(0);
	}
}