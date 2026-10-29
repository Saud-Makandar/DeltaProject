package AWT;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OnlineCarting {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Aap Ka Apna Bazaar Big Bazaar");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//
        frame.setLayout(new BorderLayout());//
        // itemlist bananao
        String[] item={"Laptop","Mobile","Bulgari Watches","Bulgari necklace"};
        JList<String> itemlist = new JList<>(item);
        itemlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);//
        JScrollPane IList = new JScrollPane(itemlist);

        // hamari cart
        JTextArea cart = new JTextArea();
        cart.setEditable(false);//
        JScrollPane Trolly = new JScrollPane(cart);
        // Buttons Banana
        JButton add = new JButton("Add to cart");
        JButton checkout = new JButton("CheckOut");
        // creating Pannel for button
        JPanel plate = new JPanel();
        plate.add(add);
        plate.add(checkout);
        // designing the frame
        frame.add(new JLabel("Available items"),BorderLayout.NORTH);
        frame.add(IList,BorderLayout.WEST);
        frame.add(Trolly, BorderLayout.CENTER);
        frame.add(plate,BorderLayout.SOUTH);
        //Now the event Handling PArt comes into picture;
       add.addActionListener(e->{
           java.util.List<String> retrive=itemlist.getSelectedValuesList();
           for(String ele:retrive){
               cart.append(ele+"\n");
           }
       });
       checkout.addActionListener(e->{
           JOptionPane.showMessageDialog(frame,"Check out complete\njcart\n: "+cart.getText());
           cart.setText(" ");

       });
        frame.setVisible(true);
    }
}
