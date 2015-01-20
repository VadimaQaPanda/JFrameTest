package JFrameTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrameTest extends JFrame
    implements ActionListener {
  // Переменные для радиокнопок.
  public JRadioButton r1, r2, r3, r4, r5;
  String sel0, sel1; //Текст выбранной радиокнопки в каждой группе.
  // Две переменные для группы радиокнопок.
  public ButtonGroup bg = new ButtonGroup();
  public ButtonGroup bg1 = new ButtonGroup();
  // Конструктор.
  public MyFrameTest() {
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocation(400, 200);
    setSize(200, 200);
    setTitle("Title");

    Container con = getContentPane();
    con.setLayout(new FlowLayout());

    // Создание радиокнопок.
    r1 = new JRadioButton("Java");
    r2 = new JRadioButton("C/C++");
    r3 = new JRadioButton("C#");

    // Добавление радиокнопок к контейнеру.
    con.add(r1);
    con.add(r2);
    con.add(r3);

    // Добавление радиокнопок в группу.
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);

    // Указание обработчиков для радиокнопок.
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);

    // Выделение первой радиокнопки в первой группе.
    r1.setSelected(true);

    // Создание радиокнопок.
    r4 = new JRadioButton("Windows");
    r5 = new JRadioButton("Linux");

    // Добавление радиокнопок к контейнеру.
    con.add(r4);
    con.add(r5);

    // Добавление радиокнопок в группу.
    bg1.add(r4);
    bg1.add(r5);

    // Указание обработчиков для радиокнопок.
    r4.addActionListener(this);
    r5.addActionListener(this);
    
    // Выделение первой радиокнопки во второй группе.
    r4.setSelected(true);

    // Задание первоначального заголовка окна.
    sel0 = r1.getText();
    sel1 = r4.getText();
    setTitle(sel0 + " " + sel1);
  }

  public void actionPerformed(ActionEvent e) {
    // Изменение заголовка окна в зависимости от выбранной радиокнопки.
    String s = e.getActionCommand();

    // Выясняем изменения в первой группе радиокнопок.
    if(s==r1.getText() || s==r2.getText() || s==r3.getText()){
      sel0 = s;
    }
    // Выясняем изменения во второй группе радиокнопок.
    if(s==r4.getText() || s==r5.getText()){
      sel1 = s;
    }

    setTitle(sel0 + " " + sel1);
  }

  public static void main(String[] args) {
    // Создание главного окна.
    new MyFrameTest().setVisible(true);
  }

  public void windowClosing(WindowEvent ev) {
    System.exit(0);
  }
}