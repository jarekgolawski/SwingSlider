import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CelsiusToKelvin extends JFrame implements ChangeListener {
    private JLabel lCelsius, lKelvin;
    private JSlider sCelsius, sKelvin;
    private int iCelsius, iKelvin;


    public CelsiusToKelvin()
    {
        setSize(500,300);
        setTitle("Convert km to miles");
        setLayout(null);

        sCelsius = new JSlider(0,1000,0);
        sCelsius.setBounds(50,50,300,50);
        sCelsius.setMajorTickSpacing(200);
        sCelsius.setMinorTickSpacing(50);
        sCelsius.setPaintLabels(true);
        sCelsius.setPaintTicks(true);
        sCelsius.addChangeListener(this);
        add(sCelsius);
        sKelvin = new JSlider(-280,730,0);
        sKelvin.setBounds(50,150,300,50);
        sKelvin.setMajorTickSpacing(200);
        sKelvin.setMinorTickSpacing(50);
        sKelvin.setPaintLabels(true);
        sKelvin.setPaintTicks(true);
        sKelvin.setEnabled(false);
        add(sKelvin);

        lCelsius = new JLabel("Celsius: ");
        lCelsius.setBounds(350,50,300,50);
        add(lCelsius);

        lKelvin = new JLabel("Kelvin: ");
        lKelvin.setBounds(350,150,300,50);
        add(lKelvin);

    }

    public static void main (String[] args)
    {
        CelsiusToKelvin app = new CelsiusToKelvin();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        iCelsius = sCelsius.getValue();
        lCelsius.setText("Celsius: "+iCelsius);
        iKelvin = iCelsius-273;
        lKelvin.setText("Kelvin: "+iKelvin);
        sKelvin.setValue(iKelvin);
    }
}
