import javax.swing.*;
import java.awt.*;

public class PortfolioUI {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("My Portfolio");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY); // dark green
        panel.setLayout(null);

        // Title
        JLabel title = new JLabel("MY PORTFOLIO");
        title.setBounds(140, 20, 250, 30);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setForeground(Color.BLACK);
        panel.add(title);

        // Profile Picture (replace path with your image)
        ImageIcon profilePic = new ImageIcon("C:\\Users\\johnc\\Downloads\\661446305_958458896548218_4324941052877069955_n.jpg"); // <-- put your image file here
        Image img = profilePic.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        JLabel picLabel = new JLabel(new ImageIcon(img));
        picLabel.setBounds(190, 60, 120, 120);
        panel.add(picLabel);

        // Info Box
        JLabel nameLabel = new JLabel("NAME:");
        nameLabel.setBounds(80, 200, 100, 25);
        panel.add(nameLabel);

        JLabel nameValue = new JLabel("JOHN CEDRIC S. FALCON");
        nameValue.setBounds(180, 200, 250, 25);
        panel.add(nameValue);

        JLabel courseLabel = new JLabel("COURSE:");
        courseLabel.setBounds(80, 230, 100, 25);
        panel.add(courseLabel);

        JLabel courseValue = new JLabel("BS COMPUTER SCIENCE");
        courseValue.setBounds(180, 230, 250, 25);
        panel.add(courseValue);

        JLabel sectionLabel = new JLabel("SECTION:");
        sectionLabel.setBounds(80, 260, 100, 25);
        panel.add(sectionLabel);

        JLabel sectionValue = new JLabel("1-C");
        sectionValue.setBounds(180, 260, 100, 25);
        panel.add(sectionValue);

        // Extra info
        JLabel age = new JLabel("I am 21 yrs old");
        age.setBounds(170, 300, 200, 25);
        panel.add(age);

        JLabel hobbies = new JLabel("My hobbies are online games, baseball");
        hobbies.setBounds(110, 330, 300, 25);
        panel.add(hobbies);

        JLabel quote = new JLabel("\"THANK YOU!\"");
        quote.setBounds(170, 360, 200, 25);
        quote.setForeground(Color.RED);
        panel.add(quote);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}