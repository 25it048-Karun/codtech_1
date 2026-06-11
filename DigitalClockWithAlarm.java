import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockWithAlarm extends JFrame {

    private JLabel clockLabel;
    private JTextField alarmField;
    private JButton setAlarmButton;

    private String alarmTime = "";

    public DigitalClockWithAlarm() {
        setTitle("Digital Clock with Alarm");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 30));

        alarmField = new JTextField(10);
        setAlarmButton = new JButton("Set Alarm");

        add(clockLabel);
        add(new JLabel("Alarm (HH:mm:ss):"));
        add(alarmField);
        add(setAlarmButton);

        setAlarmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alarmTime = alarmField.getText();
                JOptionPane.showMessageDialog(null,
                        "Alarm Set for " + alarmTime);
            }
        });

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateClock();
            }
        });

        timer.start();
        setVisible(true);
    }

    private void updateClock() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String currentTime = sdf.format(new Date());

        clockLabel.setText(currentTime);

        if (currentTime.equals(alarmTime)) {
            JOptionPane.showMessageDialog(this,
                    "⏰ Alarm! Time Reached!");
            alarmTime = "";
        }
    }

    public static void main(String[] args) {
        new DigitalClockWithAlarm();
    }
}
