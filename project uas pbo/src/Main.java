import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
public class Main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setSize(300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat tombol
        JButton button = new JButton("Klik");
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setBackground(Color.darkGray);
        button.setForeground(Color.black);
        // Menambahkan event listener ke tombol
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Kamu Gay");
            }
        });

        // Menambahkan tombol ke frame
        frame.add(button);

        // Menampilkan frame
        frame.setVisible(true);
    }
}