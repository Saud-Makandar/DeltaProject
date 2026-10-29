package SetBAck;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TopTen {
    public static void main(String[] args) {
        //Start with making the frames
        JFrame frame = new JFrame("Topten Online portal");
        frame.setSize(250,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout( new BorderLayout());
        //Ek cart list banani h
        String [] cart={"Mac Book M4","Mac Book M3","Iphone (4*4*4-(64-16)","\n" +
                "Bulgari watch Serpento","Gucci Bag"};
        JList<String> cartList = new JList<>(cart);
        cartList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane cartListscroller = new JScrollPane(cartList);
        //add to cart wala section bhi toh bana padega
        JTextArea Bucket = new JTextArea();
        Bucket.setEditable(false);
        JScrollPane BucketScroller = new JScrollPane(Bucket);
        // now we will be designing buttons
        JButton add = new JButton("Add to Bucket");
        JButton complete = new JButton("checkout ");
        JPanel ButtonPanel = new JPanel();
        ButtonPanel.add(add);
        ButtonPanel.add(complete);
        //Desiging humeing scrolling wale options dalne hote h
        frame.add(new JLabel("Available Goodies : "),BorderLayout.NORTH);
        frame.add(cartListscroller ,BorderLayout.WEST);
        frame.add(BucketScroller,BorderLayout.CENTER);
        frame.add(ButtonPanel,BorderLayout.SOUTH);
        //event Handling
        add.addActionListener(e->{
            java.util.List<String> chosen = cartList.getSelectedValuesList();
            for(String item : chosen){
                Bucket.append(item + "\n");// yaha par hum log selected items ko bhar rahe h
            }
        });
        complete.addActionListener(e->{
            JOptionPane.showMessageDialog(frame,"Checkout Successfully cart :\n "+Bucket.getText());
            Bucket.setText("");
        });
        frame.setVisible(true);
    }
}
