import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class RequestListView {
    MemberListView mv;
    JFrame main;
    JPanel panel;
    JLabel title;
    JLabel list;
    JButton requestRoleButton;
    Seed_data data = new Seed_data();

    RequestListView() {
        main = new JFrame("Request Page");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailList();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailList() {
        // Title
        title = new JLabel("Request List");
        title.setBounds(1000, 50, 100, 50);
        main.add(title);

        // Members List
        ArrayList<Request> request = data.role_change_requests;
        list = new JLabel("ID               request id --> target id        role        status");
        list.setBounds(700, 100, 300, 30);
        main.add(list);
        for(int i = 0; i < request.size(); i++) {
            String text = request.get(i).getId() + "       " + request.get(i).getRequester_id() + "  --->  " + request.get(i).getTarget_id()
                        + "     " + request.get(i).getNew_role()+ "     " + request.get(i).getStatus();
            list = new JLabel(text);
            list.setBounds(700, 100 + ((i + 1) * 50), 300, 30);
            main.add(list);
        }

        // Request Role Button
        requestRoleButton = new JButton("Back");
        requestRoleButton.setBounds(1200, 100, 200, 50);

        buttonAction();

        main.add(requestRoleButton);
    }

    
    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        requestRoleButton.addActionListener(listener); 
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            if(source == requestRoleButton) {
                mv = new MemberListView();
                main.dispose();
            }
        }
    }

    public static void main(String[] args) {
        RequestListView m = new RequestListView();
    }
}
