import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainForm extends  JFrame {
    private JPanel panelMain;
    private JButton předchozíButton;
    private JButton dalšíButton;
    private JButton uložDoSouboruButton;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox checkBox1;
    private JTextField textField3;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private EvidenceProjektu evidenceProjektu;
    public MainForm(){
        setTitle("Projekty");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panelMain);

        evidenceProjektu.pridejProjekt();

        initMenu();

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                textField1.setText(evidenceProjektu.getSeznam());

            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void initMenu(){
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu projekt = new JMenu("Projekt");
        menuBar.add(projekt);

        JMenuItem pridej = new JMenuItem("Přidej další");
        projekt.add(pridej);

        JMenu statistika = new JMenu("Statistika");
        menuBar.add(statistika);


    }
}
