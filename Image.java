// import java.rmi.server.Operation;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
// import java.awt.font;


// public static void operate(int key) {
//     JFileChooser fileChooser=new JFileChooser();
//     fileChooser.showOpenDialog(null);
//     File file=fileChooser.getSelectedFile();

//     //i use input file reader
//     try {
//         FileInputStream fis=new FileInputStream(file);

//         byte []data=new byte[fis.available()];
//         fis.read(data);
//         int i=0;
//         for(byte b:data)
//         {
//             System.out.println(b);
//             data[i]=(byte)(b^key);
//             i++;
//         }

//         FileOutputStream fos = new FileOutputStream(file);
//         fos.write(data);
//         fos.close();
//         fis.close();
//         JOptionPane.showOpenDialog(null, "Done");


//     } catch (Exception e) {
//       
//         e.printStackTrace();
//     }
// }

public class Image {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("This is system ruveillance");

        JFrame f=new JFrame();
        f.setTitle("Image");
        f.setSize(500, 500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        Font font=new Font("ROBOTO",Font.BOLD, 25);
        //now we create a button
        JButton button=new JButton();
        button.setText("Open the image");
        button.setFont(font);


        //creat text field
        JTextField testField=new JTextField(10);
        Component textField;
        textField.setFont(font);


         //add action listener function
         button.addActionListener(e -> {
            System.out.println("Button clicked by you, hare Krishna");
            String text= textField.getText();
            int temp=Integer.parseInt(text);
            // operate(temp);
            
        });

        f.setLayout(new FlowLayout());

        f.add(button);
        Component TextField;
        f.add(TextField);


        f.setVisible(true);
    }
}
