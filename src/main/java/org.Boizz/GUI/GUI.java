package GUI;

import com.fasterxml.jackson.databind.ObjectMapper;
//import org.Boizz.Data.EntryList;
//import org.example.Data.ReadingData;
import lombok.Getter;
import lombok.Setter;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class GUI extends JFrame {
    Container con;
    JPanel panel_Main;

    JLabel lbl_customerID;
    JTextField tf_customerID;
    JLabel      lbl_readingType;
    JComboBox   cBox_readingType;
    JLabel lbl_meterID;
    JTextField tf_meterID;
    JLabel      lbl_date;
    JTextField  tf_date;
    JLabel      lbl_isNew;
    JCheckBox   chkBox_isNew;
    JLabel      lbl_meterReading;
    JTextField  tf_meterReading;
    JLabel      lbl_commentary;
    JTextField  tf_commentary;
    @Getter
    @Setter
    JButton btn_save;

    private static final String FILE = "target/Readings.json";

   // private EntryList list;

    private ObjectMapper objectMapper;


    public GUI(){
        super("Ablesung Zähler");
        setSize(653,412);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //Initializing Components for main Panel
        {
            con                 = new Container();
            panel_Main          = new JPanel();

            btn_save = new JButton("Speichern");

            lbl_customerID = new JLabel("Kundennummer");
            lbl_readingType     = new JLabel("Zählerart");
            lbl_meterID = new JLabel("Zählernummer");
            lbl_date            = new JLabel("Datum");
            lbl_isNew           = new JLabel("neu eingebaut");
            lbl_meterReading    = new JLabel("Zählerstand");
            lbl_commentary      = new JLabel("Kommentare");

            tf_customerID       = new JTextField();
            cBox_readingType    = new JComboBox();
            tf_meterID = new JTextField();
            tf_date             = new JTextField();
            chkBox_isNew        = new JCheckBox();
            tf_meterReading     = new JTextField();
            tf_commentary       = new JTextField();
        }

        {
            con = getContentPane();
            con.setLayout(new BorderLayout());
            con.add(panel_Main, BorderLayout.CENTER);
            con.add(btn_save,BorderLayout.SOUTH);


            panel_Main.setLayout(new GridLayout(8,2));

            panel_Main.add(lbl_customerID);
            panel_Main.add(tf_customerID);
            panel_Main.add(lbl_readingType);
            panel_Main.add(cBox_readingType);
            panel_Main.add(lbl_meterID);
            panel_Main.add(tf_meterID);
            panel_Main.add(lbl_date);
            panel_Main.add(tf_date);
            panel_Main.add(lbl_isNew);
            panel_Main.add(chkBox_isNew);
            panel_Main.add(lbl_meterReading);
            panel_Main.add(tf_meterReading);
            panel_Main.add(lbl_commentary);
            panel_Main.add(tf_commentary);
        }

        //ActionListeners
        {
            //btn_save.addActionListener(e -> persistData() );
        }




        setVisible(true);
    }
    public boolean saveData(){

        tf_customerID.getText();
        cBox_readingType.getSelectedItem();
        tf_meterID.getText();
        tf_date.getText();
        chkBox_isNew.isSelected();
        tf_meterReading.getText();
        tf_commentary.getText();


        return true;
    }




  /*  private String[][] userDataToArray() {

        objectMapper = new ObjectMapper();
        try {

            list = objectMapper.readValue(new File(FILE), EntryList.class);
            String date;
            String[][] userArray = new String[list.size()][7] ;
            ArrayList<ReadingData> userDataArrayList = list.getListe();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

            for (int i = 0; i<userDataArrayList.size(); i++) {
                userArray[i][0] = String.valueOf(userDataArrayList.get(i).getCustomerID());
                userArray[i][1] = userDataArrayList.get(i).getReadingType();
                userArray[i][2] = String.valueOf(userDataArrayList.get(i).getMeterID());
                if (userDataArrayList.get(i).getDate() != null) {
                    date = dateFormat.format(userDataArrayList.get(i).getDate());
                } else {
                    date = "nicht da";
                }
                userArray[i][3] = date;
                userArray[i][4] = String.valueOf(userDataArrayList.get(i).isNew());
                userArray[i][5] = String.valueOf(userDataArrayList.get(i).getMeterReading());
                userArray[i][6] = userDataArrayList.get(i).getComment();
            }
            return userArray;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Laden fehlgeschlagen", "Fehler", JOptionPane.INFORMATION_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    public void persistData(){
        try {
            objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE), list);
        } catch (final Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Speichern fehlgeschlagen", "Fehler", JOptionPane.INFORMATION_MESSAGE);
        }
    }*/


}

