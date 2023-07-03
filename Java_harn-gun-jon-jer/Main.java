import javax.swing.*;   
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        
        JFrame frame = new JFrame("Harm Gun Jon Jer");
        frame.setSize(255, 190); 
        frame.setLayout(null);

        JTextField inputTextField = new JTextField(); 
        inputTextField.setBounds(20,20,200, 30);
        frame.add(inputTextField); 

       
        JLabel outputLabel = new JLabel("Harn Gun Jon Jer");
        outputLabel.setBounds(20, 50, 200, 30);
        frame.add(outputLabel); 

        
        JButton button = new JButton("Calulate");
        button.setBounds(20,80,200,30);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inpuText = inputTextField.getText();
                int inputNumber = Integer.parseInt(inpuText);

                    String output = "Denominator : ";
                    for (int i =2; i <= inputNumber; i++) {
                    if (inputNumber % i == 0) {
                    output += i + ",";
                }
            }
            outputLabel.setText(output);
            }
        });
        frame.add(button); 

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}