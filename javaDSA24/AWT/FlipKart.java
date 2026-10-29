package AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FlipKart {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nemi Ka Store");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        frame.setLayout(new BorderLayout());
        //Nemi ke pass kitne items h
        String[] Dukaan={"Mac Book","I phone","I Pad","Gpt Ultra Pro Max","Nahi Nhi Bolne ki bimari"};
        JList<String> cart =new JList(Dukaan);//
        cart.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//
        JScrollPane Trolly = new JScrollPane(cart);
        // Sumit ki Basket
        JTextArea Thaila = new JTextArea();
        Thaila.setEditable(false);//
        JScrollPane Bag = new JScrollPane(Thaila);
        //
        JButton add = new JButton("Add To cart");
        JButton checkout = new JButton("Check out");
        //panel
        JPanel plate = new JPanel();
        plate.add(add);
        plate.add(checkout);
        //frame designing
        frame.add(new JLabel("Available items"),BorderLayout.NORTH);
        frame.add(Trolly,BorderLayout.WEST);
        frame.add(Bag,BorderLayout.CENTER);
        frame.add(plate,BorderLayout.SOUTH);
        //evenet handling
        add.addActionListener(e->{
            java.util.List<String>retrive=cart.getSelectedValuesList();//
            for(String ele : retrive){
                Thaila.append(ele+"\n");
            }
        });
        checkout.addActionListener(e->{
            JOptionPane.showMessageDialog(frame,"Items u Buyied\n"+Thaila.getText());
        });
        frame.setVisible(true);
    }
}
