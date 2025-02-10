import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
    private JTextField t1, t2;
    private JLabel lb1;
    private JButton btn1, btn2;
    private void initComponent(){
        setTitle("Chuong trinh dau tien");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(this);
        setLayout(new GridLayout(4, 2));
        add(new JLabel("So thu 1:"));
        t1=new JTextField();
        add(t1);
        add(new JLabel("So thu 2:"));
        t2=new JTextField();
        add(t2);
        add(new JLabel("Tong:"));
        lb1=new JLabel();
        add(lb1);
        btn1=new JButton("Tinh"); add(btn1);
        btn2=new JButton("Lam lai"); add(btn2);
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(""); t2.setText("");
                t1.requestFocus();
            }    
        });
        btn1.addActionListener(e->{
            double a, b;
            try{
                a=Double.parseDouble(t1.getText());
                b=Double.parseDouble(t2.getText());
                lb1.setForeground(Color.blue);
                lb1.setText(""+(a+b));
                
            }catch(NumberFormatException ex){
                lb1.setForeground(Color.red);
                lb1.setText("Nhap sai dinh dang");
            }
        });
    }
    public GUI(){
        initComponent();
    }
    public static void main(String[] args){
        GUI a=new GUI();
        a.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
