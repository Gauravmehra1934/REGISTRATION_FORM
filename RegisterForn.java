
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForn  extends JFrame{
    public JPanel Register;
    private JLabel rollno,phn,login,labreg, uname;
    private JTextField txtname,txtroll,txtphn;
    private JButton btnreg,btncancel;
    public RegisterForn() {
        btnreg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JOptionPane.showMessageDialog(txtname,"Registration successfully");
            }
        });
        btncancel.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                JOptionPane.showMessageDialog(uname,"Registration canceled");
            }
        });
    }
    public static void main(String[] args) {
        RegisterForn r = new RegisterForn();
        r.setContentPane(r.Register);
        r.setTitle("Registration form");
        r.setSize(500, 400);
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}




