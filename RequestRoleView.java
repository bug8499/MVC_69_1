import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class RequestRoleView {
    MemberListView mv;
    JFrame main;
    JPanel panel;
    JLabel title;
    JButton backButton;
    JButton confirmButton;
    JTextField requester;
    JTextField target;
    JTextField role;
    Seed_data data = new Seed_data();

    RequestRoleView() {
        main = new JFrame("Make Request");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailList();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailList() {
        // Title
        title = new JLabel("Make Request Change Role");
        title.setBounds(1000, 50, 200, 50);
        main.add(title);

        // Request
        requester = new JTextField("Requester ID");
        requester.setBounds(700, 100, 200, 30);
        main.add(requester);

        target = new JTextField("target ID");
        target.setBounds(700, 200, 200, 30);
        main.add(target);

        role = new JTextField("Role");
        role.setBounds(700, 300, 200, 30);
        main.add(role);

        // All Button
        backButton = new JButton("Back");
        backButton.setBounds(1200, 100, 200, 50);

        confirmButton = new JButton("Back");
        confirmButton.setBounds(1200, 200, 200, 50);

        buttonAction();

        main.add(backButton);
        main.add(confirmButton);
    }

    
    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        backButton.addActionListener(listener);
        confirmButton.addActionListener(listener); 
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            RequestController rc = new RequestController();
            if(source == backButton) {
                mv = new MemberListView();
                main.dispose();
            }
            if(source == confirmButton) {
                String req = requester.getText();
                String tar = target.getText();
                String rol = role.getText();
                int no = rc.checkRequest(req, tar, rol);
                if (no == 0) {
                    target.setText("Set not same Requester ID");
                }
                else if (no == 1) {
                    requester.setText("You already have a request");
                    target.setText("");
                    role.setText("");
                }
                else if (no == 2) {
                    mv = new MemberListView();
                    main.dispose();
                }
            }
        }
    }

    public static void main(String[] args) {
        RequestRoleView m = new RequestRoleView();
    }
}
