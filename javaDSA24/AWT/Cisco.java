package AWT;
import java.awt.*;
import java.awt.event.*;
public class Cisco {
    public static void main(String[] args) {
        Frame frame = new Frame("simple Calculator");
        frame.setSize(400,400);
        frame.setLayout(new GridLayout(5,2,10,10));
        //
    TextField num1 = new TextField();
        TextField num2 = new TextField();
    //
        Label result = new Label("Result will be shown here");
    //
        Button add =new Button("Add");
        Button sub =new Button("Subtraction");
        Button mul =new Button("Multiply");
        Button div=new Button("Divide");
        //
        frame.add(new Label("enter the first no "));
        frame.add(num1);
        frame.add(new Label("enter the Second no "));
        frame.add(num2);
        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        //
        frame.add(result);
        ActionListener cal = e->{
            try {
                Double a = Double.parseDouble(num1.getText());
                Double b = Double.parseDouble(num2.getText());
                String op = e.getActionCommand();
                double res = switch (op) {
                    case "Add" -> a + b;
                    case "Subtraction" -> a - b;
                    case "Multiply" -> a * b;
                    case "Divide" -> b != 0 ? a / b : Double.NaN;
                    default ->0 ;
                };
                result.setText("Result: " + res);
            }catch(NumberFormatException ex){
                System.out.println("Error");
            }
        };
        add.addActionListener(cal);
        sub.addActionListener(cal);
        mul.addActionListener(cal);
        div.addActionListener(cal);
        frame.setVisible(true);
    }
}
