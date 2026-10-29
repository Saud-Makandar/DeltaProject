
import java.awt.*;
import java.awt.event.*;

public class Chapo {
    public static void main(String[] args) {
        Frame frame = new Frame("Simply Complex Calculator");
        frame.setSize(300, 250);
        frame.setLayout(new BorderLayout(10, 10));

        // Top panel for inputs
        Panel inputPanel = new Panel(new GridLayout(2, 2, 5, 5));
        TextField num1 = new TextField();
        TextField num2 = new TextField();
        inputPanel.add(new Label("Enter num 1:"));
        inputPanel.add(num1);
        inputPanel.add(new Label("Enter num 2:"));
        inputPanel.add(num2);

        // Center panel for buttons
        Panel buttonPanel = new Panel(new GridLayout(1, 4, 5, 5));
        Button add = new Button("Add");
        Button sub = new Button("Subtract");
        Button mul = new Button("Multiply");
        Button div = new Button("Divide");
        buttonPanel.add(add);
        buttonPanel.add(sub);
        buttonPanel.add(mul);
        buttonPanel.add(div);

        // Bottom label for result
        Label result = new Label("Result will be shown here", Label.CENTER);

        // Add panels to frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(result, BorderLayout.SOUTH);

        // Event handling
        ActionListener calc = e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String op = e.getActionCommand();
                double res = switch (op) {
                    case "Add" -> a + b;
                    case "Subtract" -> a - b;
                    case "Multiply" -> a * b;
                    case "Divide" -> b != 0 ? a / b : Double.NaN;
                    default -> 0;
                };
                result.setText("Result: " + res);
            } catch (NumberFormatException ex) {
                result.setText("Invalid input!");
            }
        };

        add.addActionListener(calc);
        sub.addActionListener(calc);
        mul.addActionListener(calc);
        div.addActionListener(calc);

        // Close handler
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}