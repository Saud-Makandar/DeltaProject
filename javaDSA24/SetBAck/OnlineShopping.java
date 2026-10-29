package SetBAck;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OnlineShopping {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Saud ka adda -> Wear Chadda's");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // creating an item List
        String[] cart={"Mac Book","Laptop","Tablet","Charizard i choose u !","Out Of Money"};
        JList<String> jcart = new JList<>(cart);// array ko list mein dala
        jcart.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane jslider= new JScrollPane(jcart);//list ko scrolling feature mein dal diya
        //creating text area
        JTextArea chitchat = new JTextArea();
        chitchat.setEditable(false);
        JScrollPane ChatSlider = new JScrollPane(chitchat);
        // creating buttons
        JButton add = new JButton("Add to cart");
        JButton close = new JButton("Checkout");
        //Creating panels to hold that buttons
        JPanel plate = new JPanel();
        plate.add(add);
        plate.add(close);
        // Add all UI components to their appropriate places in the frame ab bas baithane ka kaam bacha h
        frame.add(new JLabel("Available items :"),BorderLayout.NORTH);
        frame.add(jslider,BorderLayout.WEST);
        frame.add(ChatSlider,BorderLayout.CENTER);
        frame.add(plate,BorderLayout.SOUTH);
        //Event Handling
        add.addActionListener(e->{
            java.util.List<String> selected = jcart.getSelectedValuesList();
            for (String item : selected) {
                chitchat.append(item + "\n"); // Add item to the cart area (each on new line)
            }
        });
        close.addActionListener(e->{
        JOptionPane.showMessageDialog(frame,"Check out complete\njcart\n: "+chitchat.getText());
        chitchat.setText(" ");
        });
        frame.setVisible(true);
    }
}
