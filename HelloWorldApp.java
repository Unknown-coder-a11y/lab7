import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HelloWorldApp {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Hello World App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel for the content
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a label
        JLabel label = new JLabel("Click the button to print Hello World!", SwingConstants.CENTER);
        panel.add(label, BorderLayout.CENTER);

        // Create a button
        JButton button = new JButton("Print Hello World");
        panel.add(button, BorderLayout.SOUTH);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, World!");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
