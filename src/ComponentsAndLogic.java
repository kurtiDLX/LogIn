import javax.sound.sampled.Line;
import javax.swing.*;
import java.util.LinkedList;


public class ComponentsAndLogic extends JFrame {
    private JLabel emailText, passwordText, textRight;
    private JTextField emailField;
    private JPasswordField jPasswordField;
    private JButton Login;
    private LinkedList<String> userInfo = new LinkedList<>();
    public ComponentsAndLogic(){
        super("LogIn");
        setLayout(null);

        userInfo.add("mark");
        userInfo.add("123");
        userInfo.add("Admin");
        userInfo.add("AdminPass");


        emailText = new JLabel("Email: ");
        emailText.setBounds(10,25,80,10);

        passwordText = new JLabel("Password: ");
        passwordText.setBounds(10, 50, 80, 10 );

        emailField = new JTextField(20);
        emailField.setBounds(100,20,165,25);;

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(100,45,165,25);

        Login = new JButton("Login");
        Login.setBounds(30,90,80,25);

        textRight = new JLabel("");
        textRight.setBounds(130,90,300,25);

        Login.addActionListener(e -> {
            try {
                String password, email;
                password = jPasswordField.getText();
                email = emailField.getText();
                if (userInfo.contains(password) && userInfo.contains(email)) {
                    textRight.setText("Hello " + email);
                } else {
                    textRight.setText("wrong password or email");
                }
            }catch (Exception ex){

            }
        });

        add(emailText);
        add(emailField);
        add(jPasswordField);
        add(passwordText);
        add(Login);
        add(textRight);
    }
}
