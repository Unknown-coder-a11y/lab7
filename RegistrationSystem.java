import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {

    private static List<String> users = new ArrayList<>();

    public static void main(String[] args) {

        JFrame mainFrame = new JFrame("Бүртгэлийн систем");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton registerButton = new JButton("Хэрэглэгч бүртгэх");
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = JOptionPane.showInputDialog(mainFrame, "Нэрээ оруулна уу:");
                String email = JOptionPane.showInputDialog(mainFrame, "Имэйлээ оруулна уу:");

                if (name != null && email != null) {
                    users.add("Нэр: " + name + ", Имэйл: " + email);
                    System.out.println("Хэрэглэгч бүртгэгдлээ: " + name);
                }
            }
        });

        JButton viewUsersButton = new JButton("Бүртгэгдсэн хэрэглэгчдийг харах");
        viewUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (users.isEmpty()) {
                    JOptionPane.showMessageDialog(mainFrame, "Бүртгэгдсэн хэрэглэгч байхгүй.");
                } else {
                    StringBuilder userList = new StringBuilder();
                    for (String user : users) {
                        userList.append(user).append("\n");
                    }
                    JOptionPane.showMessageDialog(mainFrame, userList.toString());
                    System.out.println("Бүртгэгдсэн хэрэглэгчийн жагсаалт хэвлэгдлээ.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(registerButton);
        panel.add(viewUsersButton);
        mainFrame.add(panel);

        mainFrame.setVisible(true);
    }
}
