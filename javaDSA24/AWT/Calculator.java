package AWT;
import java.awt.*;
import java.awt.event.*;
public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame("Simply Complex Calculator");
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(5, 2, 10, 10));
        // entering input fields
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        // result
        Label result = new Label("Result will be shown here");
        //adding buttons;
        Button add = new Button("Add");           // Addition button
        Button sub = new Button("Subtract");      // Subtraction button
        Button mul = new Button("Multiply");      // Multiplication button
        Button div = new Button("Divide");
        //frame designing
        frame.add(new Label("Enter the value of num 1"));
        frame.add(num1);
        frame.add(new Label ("Enter the value of num 2"));
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        //
        frame.add(result);
        ActionListener calc = e->{
          try {
              Double a = Double.parseDouble(num1.getText());
              Double b = Double.parseDouble(num2.getText());
              String op = e.getActionCommand();
              double res=switch (op){
                  case "Add" -> a+b;
                  case "Subtract"->a-b;
                  case "Multiply"->a*b;
                  case "Divide"-> b!=0?a/b :Double.NaN;
                  default -> 0;
              };
              result.setText("Result: " + res);
             }
          catch(NumberFormatException n){
              result.setText("Invalid input!");
          }
        };
        add.addActionListener(calc);
        sub.addActionListener(calc);
        mul.addActionListener(calc);
        div.addActionListener(calc);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}
