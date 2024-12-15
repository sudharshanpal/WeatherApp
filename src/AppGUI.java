import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AppGUI extends JFrame {
    public AppGUI(){
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(500, 700);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        addGuiComponents();


    }

    private void addGuiComponents() {
        JTextField search = new JTextField();
        search.setBounds(15, 15, 350, 45);
        search.setFont(new Font("Dialog", Font.PLAIN, 24));
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(375, 13, 47, 45);
        add(searchButton);
        add(search);

        JLabel weatherType =  new JLabel(loadImage("src/assets/cloudy.png"));
        weatherType.setBounds(0, 125, 450, 220);
        add(weatherType);

        JLabel weatherText = new JLabel("69 C");
        weatherText.setBounds(0, 350, 450, 55);
        weatherText.setFont(new Font("Dialog", Font.PLAIN, 48));

        weatherText.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherText);

        JLabel weatherDescription = new JLabel("Cloudy");
        weatherDescription.setBounds(0, 405, 450, 35);
        weatherDescription.setFont(new Font("Dialog", Font.PLAIN, 32));
        weatherDescription.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherDescription);

        JLabel humidity = new JLabel(loadImage("src/assets/humidity.png"));
        humidity.setBounds(15, 500, 75, 65);
        add(humidity);

        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityText.setBounds(90, 500, 85, 55);
        humidityText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityText);

        JLabel wind = new JLabel(loadImage("src/assets/windspeed.png"));
        wind.setBounds(220, 500, 75, 65);
        add(wind);

        JLabel windText = new JLabel("<html><b>Windspeed</b> 25km/h</html>");
        windText.setBounds(310, 500, 85, 55);
        windText.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windText);



    }

    private ImageIcon loadImage(String path) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            return new ImageIcon(image);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Could not find the image in the folder");
        return null;
    }
}


