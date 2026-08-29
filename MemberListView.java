import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class MemberListView {
    RequestRoleView rv;
    RequestListView rl;
    JFrame main;
    JPanel panel;
    JLabel title;
    JLabel memberlist;
    JButton requestRoleButton;
    JButton requestListButton;
    Seed_data data = new Seed_data();

    MemberListView() {
        main = new JFrame("Member Page");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailList();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailList() {
        // Title
        title = new JLabel("Member List");
        title.setBounds(1000, 50, 100, 50);
        main.add(title);

        // Members List
        ArrayList<Member> member = data.members;
        memberlist = new JLabel("ID               Name              Role             Active");
        memberlist.setBounds(700, 100, 300, 30);
        main.add(memberlist);
        for(int i = 0; i < member.size(); i++) {
            String text = member.get(i).getid() + "       " + member.get(i).getName() + "    " + member.get(i).getRole()
                        + "     " + member.get(i).isActive();
            memberlist = new JLabel(text);
            memberlist.setBounds(700, 100 + ((i + 1) * 50), 300, 30);
            main.add(memberlist);
        }

        // Request Role Button
        requestRoleButton = new JButton("Request Role");
        requestRoleButton.setBounds(1200, 100, 200, 50);

        requestListButton = new JButton("Request List");
        requestListButton.setBounds(1200, 200, 200, 50);

        buttonAction();

        main.add(requestRoleButton);
        main.add(requestListButton);
    }

    
    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        requestRoleButton.addActionListener(listener); 
        requestListButton.addActionListener(listener);
    }

    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            if(source == requestRoleButton) {
                rv = new RequestRoleView();
                main.dispose();
            }
            else if(source == requestListButton) {
                rl = new RequestListView();
                main.dispose();
            }
        }
    }

    public static void main(String[] args) {
        MemberListView m = new MemberListView();
    }
}
