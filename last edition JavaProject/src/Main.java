import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.geom.RoundRectangle2D;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI;




class Proj extends JFrame{
    //first view main panels
    private JPanel left;
    private JPanel master;
    private JPanel rightPanel;
                                    //first view and first panel components
    private JPanel north;
    private JLabel name;
    private JLabel date;

    private JPanel south;

    private JPanel center;
    private JPanel northCenter;

    private JPanel centerOfCenter1;
    private JPanel centerOfCenter2;
    private JPanel centerOfCenter3;
    private JPanel centerOfCenter4;
    private JPanel centerOfCenter5;
    private JPanel centerOfCenter6;



    private JButton buttHot;
    private JButton buttCold;
    private JButton buttSoup;
    private JButton buttGrill;
    private JButton buttAppetizer;
    private JButton buttDessert ;
    private JButton percent ;

    private JComboBox options;
    private String nOptions []={"Dine in", "To go",  "Delivery"};


   private JPanel northRight ;
   private JPanel centerRight ;
   private JPanel southRight ;

    private JPanel rightOptions;

    private JPanel southRight1 ;
    private JPanel southRight2 ;
    private JPanel southRight3 ;

    JButton O1;
    JButton O2;
    JButton O3;




    double tprice =0.0;





                                                     //methode to current time
    public  String getCurrentDateFormatted() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy");
        String formattedDate = currentDate.format(formatter);
        return formattedDate;}






    public Proj() {                                    //Constructor
        super("Point of Sale");
        setLayout(null);

        //main panels
        left=new JPanel();
        master = new JPanel();
        rightPanel = new JPanel();

        north = new JPanel();
        south = new JPanel();

        center = new JPanel();
        northCenter = new JPanel();
        centerOfCenter1 = new JPanel();
        centerOfCenter2 = new JPanel();
        centerOfCenter3 = new JPanel();
        centerOfCenter4 = new JPanel();
        centerOfCenter5 = new JPanel();
        centerOfCenter6 = new JPanel();



        date = new JLabel(getCurrentDateFormatted());
            date.setForeground(Color.white);
        name = new JLabel("An-Najah Rest");
            name.setForeground(Color.WHITE);
        JLabel choose;
            choose = new JLabel("Choose Dishes");
            choose.setForeground(Color.WHITE);
            choose.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
        options = new JComboBox(nOptions);
        options.setMaximumRowCount(3);
        options.setBackground(Color.decode("#1F1D2B"));
        options.setForeground(Color.WHITE);

        // fonts and icons and date and colors
        ImageIcon icon = new ImageIcon("pper.jpg");
        Font smallFont = new Font(Font.DIALOG, Font.BOLD, 11);
        Font font = name.getFont(); // Get the current font
        font = font.deriveFont(24f); // Set the font size to 24
        name.setFont(font);
        Color color = Color.decode("#252836");
        Color darkcolor = Color.decode("#1F1D2B");
        Color orange = Color.decode("#CE655C");


        setBackground(color);

        // make panel used as space
        JPanel space =new JPanel();
        JPanel space2 =new JPanel();
        JPanel space3 =new JPanel();
        space.setPreferredSize(new Dimension(80, 3));
        space2.setPreferredSize(new Dimension(380, 2));
        space3.setPreferredSize(new Dimension(615, 1));
        space2.setBackground(color);
        space.setBackground(color);


        //buttons in south.north.master initialization
        buttHot = new JButton("Hot Dishes");
        buttCold = new JButton("Cold Dishes");
        buttSoup = new JButton("Soup");
        buttGrill = new JButton("Grill");
        buttAppetizer = new JButton("Appetizer");
        buttDessert = new JButton("Dessert");
        percent = new JButton(icon);
        percent.setToolTipText("Settings Icon");
        percent.setPreferredSize(new Dimension(25, 33));

        buttHot.setFont(smallFont);
            buttHot.setForeground(Color.WHITE);
            buttHot.setBackground(color);
            buttHot.setBorder(BorderFactory.createLineBorder(color));
        buttCold.setFont(smallFont);
            buttCold.setForeground(Color.WHITE);
            buttCold.setBackground(color);
            buttCold.setBorder(BorderFactory.createLineBorder(color));
        buttSoup.setFont(smallFont);
            buttSoup.setForeground(Color.WHITE);
            buttSoup.setBackground(color);
            buttSoup.setBorder(BorderFactory.createLineBorder(color));
        buttAppetizer.setFont(smallFont);
            buttAppetizer.setForeground(Color.WHITE);
            buttAppetizer.setBackground(color);
            buttAppetizer.setBorder(BorderFactory.createLineBorder(color));
        buttDessert.setFont(smallFont);
            buttDessert.setForeground(Color.WHITE);
            buttDessert.setBackground(color);
            buttDessert.setBorder(BorderFactory.createLineBorder(color));
        buttGrill.setFont(smallFont);
            buttGrill.setForeground(Color.WHITE);
            buttGrill.setBackground(color);
            buttGrill.setBorder(BorderFactory.createLineBorder(color));

        //Dishes

/////////////////////////////////
            JPanel Dish1 = new JPanel(new BorderLayout());
            Dish1.setPreferredSize(new Dimension(190, 230));
            Dish1.setBackground(darkcolor);

            ImageIcon pic1 = new ImageIcon(("Small Meatballs.jpg"));
            JLabel label511 = new JLabel(pic1);

            JPanel panel511 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel511.setBackground(darkcolor);
            JLabel label512 = new JLabel("                                                   ");
            JLabel label513 = new JLabel("   Small Meatballs    ");
            label513.setFont(new Font("dsd", Font.BOLD, 12));
            label513.setForeground(Color.white);
            JLabel label515 = new JLabel("$10.2");
            double ss1 =Double.parseDouble(label515.getText().replace("$",""));


            JLabel label516 = new JLabel("many Bowls available");
            label516.setFont(new Font("sadsa", Font.BOLD, 10));
            label516.setForeground(Color.GRAY);

            label515.setForeground(Color.white);
            label515.setFont(new Font("dsd", Font.BOLD, 15));

            panel511.add(label511);
            panel511.add(label512);
            panel511.add(label513);
            panel511.add(label515);
            panel511.add(label516);

            Dish1.add(panel511);
/////////////////////////////


/////////////////////////////////
            JPanel Dish2 = new JPanel(new BorderLayout());
            Dish2.setPreferredSize(new Dimension(190, 230));
            Dish2.setBackground(darkcolor);

            ImageIcon pic2 = new ImageIcon(("Vegetable Filet Mignon Wrap.jpg"));
            JLabel label521 = new JLabel(pic2);

            JPanel panel521 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel521.setBackground(darkcolor);
            JLabel label522 = new JLabel("                                                   ");
            JLabel label523 = new JLabel("Vegetable Filet Mignon Wrap");
            label523.setFont(new Font("dsd", Font.BOLD, 12));
            label523.setForeground(Color.white);
            JLabel label525 = new JLabel("$20.00");
             double ss2 =Double.parseDouble(label525.getText().replace("$",""));
            JLabel label526 = new JLabel("many Bowls available");
            label526.setFont(new Font("sadsa", Font.BOLD, 10));
            label526.setForeground(Color.GRAY);

            label525.setForeground(Color.white);
            label525.setFont(new Font("dsd", Font.BOLD, 15));

            panel521.add(label521);
            panel521.add(label522);
            panel521.add(label523);
            panel521.add(label525);
            panel521.add(label526);

            Dish2.add(panel521);
/////////////////////////////


////////////////////////////
            JPanel Dish3 = new JPanel(new BorderLayout());
            Dish3.setPreferredSize(new Dimension(190, 230));
            Dish3.setBackground(darkcolor);

            ImageIcon pic3 = new ImageIcon(("Chicken Fajitas.jpg"));
            JLabel label531 = new JLabel(pic3);

            JPanel panel531 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel531.setBackground(darkcolor);
            JLabel label532 = new JLabel("                                                   ");
            JLabel label533 = new JLabel("   Spicy seasoned    ");
            label533.setFont(new Font("dsd", Font.BOLD, 12));
            label533.setForeground(Color.white);
            JLabel label535 = new JLabel("$25.5");
            double ss3 =Double.parseDouble(label535.getText().replace("$",""));

            JLabel label536 = new JLabel("many Bowls available");
            label536.setFont(new Font("sadsa", Font.BOLD, 10));
            label536.setForeground(Color.GRAY);

            label535.setForeground(Color.white);
            label535.setFont(new Font("dsd", Font.BOLD, 15));

            panel531.add(label531);
            panel531.add(label532);
            panel531.add(label533);
            panel531.add(label535);
            panel531.add(label536);

            Dish3.add(panel531);
////////////////////////////

/////////////////////////////////
            JPanel Dish4 = new JPanel(new BorderLayout());
            Dish4.setPreferredSize(new Dimension(190, 230));
            Dish4.setBackground(darkcolor);

            ImageIcon pic4 = new ImageIcon(("Fisinjan Plov.jpg"));
            JLabel label541 = new JLabel(pic4);

            JPanel panel541 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel541.setBackground(darkcolor);
            JLabel label542 = new JLabel("                                                   ");
            JLabel label543 = new JLabel("   Spicy seasoned    ");
            label543.setFont(new Font("dsd", Font.BOLD, 12));
            label543.setForeground(Color.white);
            JLabel label545 = new JLabel("$15.5");
             double ss4 =Double.parseDouble(label545.getText().replace("$",""));

            JLabel label546 = new JLabel("many Bowls available");
            label546.setFont(new Font("sadsa", Font.BOLD, 10));
            label546.setForeground(Color.GRAY);

            label545.setForeground(Color.white);
            label545.setFont(new Font("dsd", Font.BOLD, 15));

            panel541.add(label541);
            panel541.add(label542);
            panel541.add(label543);
            panel541.add(label545);
            panel541.add(label546);

            Dish4.add(panel541);

/////////////////////////////


            /////////////////////////////////
            JPanel Dish5 = new JPanel(new BorderLayout());
            Dish5.setPreferredSize(new Dimension(190, 230));
            Dish5.setBackground(darkcolor);

            ImageIcon pic5 = new ImageIcon(("Chicken Orzo Salad.jpg"));
            JLabel label551 = new JLabel(pic5);

            JPanel panel551 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel551.setBackground(darkcolor);
            JLabel label552 = new JLabel("                                                   ");
            JLabel label553 = new JLabel("   Spicy seasoned    ");
            label553.setFont(new Font("dsd", Font.BOLD, 12));
            label553.setForeground(Color.white);
            JLabel label555 = new JLabel("$18.1");
             double ss5 =Double.parseDouble(label555.getText().replace("$",""));

            JLabel label556 = new JLabel("many Bowls available");
            label556.setFont(new Font("sadsa", Font.BOLD, 10));
            label556.setForeground(Color.GRAY);

            label555.setForeground(Color.white);
            label555.setFont(new Font("dsd", Font.BOLD, 15));

            panel551.add(label551);
            panel551.add(label552);
            panel551.add(label553);
            panel551.add(label555);
            panel551.add(label556);

            Dish5.add(panel551);

/////////////////////////////

            /////////////////////////////////
            JPanel Dish6 = new JPanel(new BorderLayout());
            Dish6.setPreferredSize(new Dimension(190, 230));
            Dish6.setBackground(darkcolor);

            ImageIcon pic6 = new ImageIcon(("Noodle Pad Thai.jpg"));
            JLabel label561 = new JLabel(pic6);

            JPanel panel561 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel561.setBackground(darkcolor);
            JLabel label562 = new JLabel("                                                   ");
            JLabel label563 = new JLabel("   Spicy seasoned    ");
            label563.setFont(new Font("dsd", Font.BOLD, 12));
            label563.setForeground(Color.white);
            JLabel label565 = new JLabel("$25.1");
             double ss6 =Double.parseDouble(label565.getText().replace("$",""));

            JLabel label566 = new JLabel("many Bowls available");
            label566.setFont(new Font("sadsa", Font.BOLD, 10));
            label566.setForeground(Color.GRAY);

            label565.setForeground(Color.white);
            label565.setFont(new Font("dsd", Font.BOLD, 15));

            panel561.add(label561);
            panel561.add(label562);
            panel561.add(label563);
            panel561.add(label565);
            panel561.add(label566);

            Dish6.add(panel561);

/////////////////////////////

            /////////////////////////////////
            JPanel Dish7 = new JPanel(new BorderLayout());
            Dish7.setPreferredSize(new Dimension(190, 230));
            Dish7.setBackground(darkcolor);

            ImageIcon pic7 = new ImageIcon(("Pasta Fagioli Soup.jpg"));
            JLabel label571 = new JLabel(pic7);

            JPanel panel571 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel571.setBackground(darkcolor);
            JLabel label572 = new JLabel("                                                   ");
            JLabel label573 = new JLabel("   Spicy seasoned    ");
            label573.setFont(new Font("dsd", Font.BOLD, 12));
            label573.setForeground(Color.white);
            JLabel label575 = new JLabel("$12.3");
             double ss7 =Double.parseDouble(label575.getText().replace("$",""));

            JLabel label576 = new JLabel("many Bowls available");
            label576.setFont(new Font("sadsa", Font.BOLD, 10));
            label576.setForeground(Color.GRAY);

            label575.setForeground(Color.white);
            label575.setFont(new Font("dsd", Font.BOLD, 15));

            panel571.add(label571);
            panel571.add(label572);
            panel571.add(label573);
            panel571.add(label575);
            panel571.add(label576);

            Dish7.add(panel571);
/////////////////////////////

            /////////////////////////////////
            JPanel Dish8 = new JPanel(new BorderLayout());
            Dish8.setPreferredSize(new Dimension(190, 230));
            Dish8.setBackground(darkcolor);

            ImageIcon pic8 = new ImageIcon(("Chicken Rice Soup.jpg"));
            JLabel label581 = new JLabel(pic8);

            JPanel panel581 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel581.setBackground(darkcolor);
            JLabel label582 = new JLabel("                                                   ");
            JLabel label583 = new JLabel("   Spicy seasoned    ");
            label583.setFont(new Font("dsd", Font.BOLD, 12));
            label583.setForeground(Color.white);
            JLabel label585 = new JLabel("$14.6");
             double ss8 =Double.parseDouble(label585.getText().replace("$",""));

            JLabel label586 = new JLabel("many Bowls available");
            label586.setFont(new Font("sadsa", Font.BOLD, 10));
            label586.setForeground(Color.GRAY);

            label585.setForeground(Color.white);
            label585.setFont(new Font("dsd", Font.BOLD, 15));

            panel581.add(label581);
            panel581.add(label582);
            panel581.add(label583);
            panel581.add(label585);
            panel581.add(label586);

            Dish8.add(panel581);
/////////////////////////////

            /////////////////////////////////
            JPanel Dish9 = new JPanel(new BorderLayout());
            Dish9.setPreferredSize(new Dimension(190, 230));
            Dish9.setBackground(darkcolor);

            ImageIcon pic9 = new ImageIcon(("spicy grilled chicken.jpg"));
            JLabel label591 = new JLabel(pic9);

            JPanel panel591 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel591.setBackground(darkcolor);
            JLabel label592 = new JLabel("                                                   ");
            JLabel label593 = new JLabel("   Spicy seasoned    ");
            label593.setFont(new Font("dsd", Font.BOLD, 12));
            label593.setForeground(Color.white);
            JLabel label595 = new JLabel("$15.00");
             double ss9 =Double.parseDouble(label595.getText().replace("$",""));

            JLabel label596 = new JLabel("many Bowls available");
            label596.setFont(new Font("sadsa", Font.BOLD, 10));
            label596.setForeground(Color.GRAY);

            label595.setForeground(Color.white);
            label595.setFont(new Font("dsd", Font.BOLD, 15));

            panel591.add(label591);
            panel591.add(label592);
            panel591.add(label593);
            panel591.add(label595);
            panel591.add(label596);

            Dish9.add(panel591);
/////////////////////////////

            /////////////////////////////////
            JPanel Dish10 = new JPanel(new BorderLayout());
            Dish10.setPreferredSize(new Dimension(190, 230));
            Dish10.setBackground(darkcolor);

            ImageIcon pica = new ImageIcon(("Pineapple Meatballs.jpg"));
            JLabel label5a1 = new JLabel(pica);

            JPanel panel5a1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel5a1.setBackground(darkcolor);
            JLabel label5a2 = new JLabel("                                                   ");
            JLabel label5a3 = new JLabel("   Spicy seasoned    ");
            label5a3.setFont(new Font("dsd", Font.BOLD, 12));
            label5a3.setForeground(Color.white);
            JLabel label5a5 = new JLabel("$12.00");
             double ss10 =Double.parseDouble(label5a5.getText().replace("$",""));

            JLabel label5a6 = new JLabel("many Bowls available");
            label5a6.setFont(new Font("sadsa", Font.BOLD, 10));
            label5a6.setForeground(Color.GRAY);

            label5a5.setForeground(Color.white);
            label5a5.setFont(new Font("dsd", Font.BOLD, 15));

            panel5a1.add(label5a1);
            panel5a1.add(label5a2);
            panel5a1.add(label5a3);
            panel5a1.add(label5a5);
            panel5a1.add(label5a6);

            Dish10.add(panel5a1);
/////////////////////////////

            /////////////////////////////////
            JPanel Dish11 = new JPanel(new BorderLayout());
            Dish11.setPreferredSize(new Dimension(190, 230));
            Dish11.setBackground(darkcolor);

            ImageIcon picb = new ImageIcon(("Strawberry Dump Cake.jpg"));
            JLabel label5b1 = new JLabel(picb);

            JPanel panel5b1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 5));
            panel5b1.setBackground(darkcolor);
            JLabel label5b2 = new JLabel("                                                   ");
            JLabel label5b3 = new JLabel("   Spicy seasoned    ");
            label5b3.setFont(new Font("dsd", Font.BOLD, 12));
            label5b3.setForeground(Color.white);
            JLabel label5b5 = new JLabel("$14.00");
             double ss11 =Double.parseDouble(label5b5.getText().replace("$",""));

            JLabel label5b6 = new JLabel("many Bowls available");
            label5b6.setFont(new Font("sadsa", Font.BOLD, 10));
            label5b6.setForeground(Color.GRAY);

            label5b5.setForeground(Color.white);
            label5b5.setFont(new Font("dsd", Font.BOLD, 15));

            panel5b1.add(label5b1);
            panel5b1.add(label5b2);
            panel5b1.add(label5b3);
            panel5b1.add(label5b5);
            panel5b1.add(label5b6);

            Dish11.add(panel5b1);
/////////////////////////////


        //dishes
        //////////////////
        JPanel dish1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish1.setPreferredSize(new Dimension(380, 100));
        dish1.setBackground(darkcolor);
        ImageIcon icon1 = new ImageIcon(("small Small Meatballs.jpg"));
        JLabel iicon1 = new JLabel(icon1);
        JLabel title1 = new JLabel("Small Meatballs");
        title1.setPreferredSize(new Dimension(130, 20));
        JLabel p$1 = new JLabel("$10.2");
        p$1.setPreferredSize(new Dimension(40, 20));
        JTextField Q1 = new JTextField();
        Q1.setPreferredSize(new Dimension(35, 35));
        Q1.setBackground(color);
        JTextField price1 = new JTextField();
        price1.setEditable(false);
        price1.setPreferredSize(new Dimension(35, 35));
        price1.setText("00");
        price1.setPreferredSize(new Dimension(35, 35));
        JTextField note1 = new JTextField("Order note1...");
        note1.setPreferredSize(new Dimension(270, 35));
        note1.setBackground(color);
        note1.setBorder(BorderFactory.createLineBorder(color));
        ImageIcon delIcon1 = new ImageIcon(("delete.png"));
        JButton delete1 = new JButton(delIcon1);
        delete1.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note1.setForeground(Color.white);
        Q1.setForeground(Color.white);
        Q1.setBorder(BorderFactory.createLineBorder(color));
        title1.setForeground(Color.white);
        p$1.setForeground(Color.white);
        price1.setForeground(Color.WHITE);
        delete1.setBackground(darkcolor);
        price1.setBackground(darkcolor);


        //Adding components
        dish1.add(iicon1);
        dish1.add(title1);
        dish1.add(p$1);
        dish1.add(Q1);
        dish1.add(price1);
        dish1.add(note1);
        dish1.add(delete1);

/////////////////

//////////////////
        JPanel dish2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish2.setPreferredSize(new Dimension(380, 100));
        dish2.setBackground(darkcolor);
        ImageIcon icon2 = new ImageIcon(("small Vegetable Filet Mignon Wrap.jpg"));
        JLabel iicon2 = new JLabel(icon2);
        JLabel title2 = new JLabel("Vegetable Filet Mignon Wrap");
        title2.setPreferredSize(new Dimension(130, 20));
        JLabel p$2 = new JLabel("$20.00");
        p$2.setPreferredSize(new Dimension(40, 20));
        JTextField Q2 = new JTextField();
        Q2.setPreferredSize(new Dimension(35, 35));
        Q2.setBackground(color);
        JTextField price2 = new JTextField();
        price2.setEditable(false);
        price2.setPreferredSize(new Dimension(35, 35));
        price2.setText("00");
        price2.setPreferredSize(new Dimension(35, 35));
        JTextField note2 = new JTextField("Order note2...");
        note2.setPreferredSize(new Dimension(270, 35));
        note2.setBackground(color);
        ImageIcon delIcon2 = new ImageIcon(("delete.png"));
        JButton delete2 = new JButton(delIcon2);
        delete2.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note2.setForeground(Color.white);
        Q2.setForeground(Color.white);
        title2.setForeground(Color.white);
        p$2.setForeground(Color.white);
        price2.setForeground(Color.WHITE);
        delete2.setBackground(darkcolor);
        price2.setBackground(darkcolor);
        note2.setBorder(BorderFactory.createLineBorder(color));
        Q2.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish2.add(iicon2);
        dish2.add(title2);
        dish2.add(p$2);
        dish2.add(Q2);
        dish2.add(price2);
        dish2.add(note2);
        dish2.add(delete2);

/////////////////

        //////////////////
        JPanel dish3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish3.setPreferredSize(new Dimension(380, 100));
        dish3.setBackground(darkcolor);
        ImageIcon icon3 = new ImageIcon(("small Chicken Fajitas.jpg"));
        JLabel iicon3 = new JLabel(icon3);
        JLabel title3 = new JLabel("Chicken Fajitas");
        title3.setPreferredSize(new Dimension(130, 20));
        JLabel p$3 = new JLabel("$25.5");
        p$3.setPreferredSize(new Dimension(40, 20));
        JTextField Q3 = new JTextField();
        Q3.setPreferredSize(new Dimension(35, 35));
        Q3.setBackground(color);
        JTextField price3 = new JTextField();
        price3.setEditable(false);
        price3.setPreferredSize(new Dimension(35, 35));
        price3.setText("00");
        price3.setPreferredSize(new Dimension(35, 35));
        JTextField note3 = new JTextField("Order note3...");
        note3.setPreferredSize(new Dimension(270, 35));
        note3.setBackground(color);
        ImageIcon delIcon3 = new ImageIcon(("delete.png"));
        JButton delete3 = new JButton(delIcon3);
        delete3.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note3.setForeground(Color.white);
        Q3.setForeground(Color.white);
        title3.setForeground(Color.white);
        p$3.setForeground(Color.white);
        price3.setForeground(Color.WHITE);
        delete3.setBackground(darkcolor);
        price3.setBackground(darkcolor);
        note3.setBorder(BorderFactory.createLineBorder(color));
           Q3.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish3.add(iicon3);
        dish3.add(title3);
        dish3.add(p$3);
        dish3.add(Q3);
        dish3.add(price3);
        dish3.add(note3);
        dish3.add(delete3);

/////////////////


        //////////////////
        JPanel dish4 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish4.setPreferredSize(new Dimension(380, 100));
        dish4.setBackground(darkcolor);
        ImageIcon icon4 = new ImageIcon(("small Fisinjan Plov.jpg"));
        JLabel iicon4 = new JLabel(icon4);
        JLabel title4 = new JLabel("Fisinjan Plov");
        title4.setPreferredSize(new Dimension(130, 20));
        JLabel p$4 = new JLabel("$15.5");
        p$4.setPreferredSize(new Dimension(40, 20));
        JTextField Q4 = new JTextField();
        Q4.setPreferredSize(new Dimension(35, 35));
        Q4.setBackground(color);
        JTextField price4 = new JTextField();
        price4.setEditable(false);
        price4.setPreferredSize(new Dimension(35, 35));
        price4.setText("00");
        price4.setPreferredSize(new Dimension(35, 35));
        JTextField note4 = new JTextField("Order note4...");
        note4.setPreferredSize(new Dimension(270, 35));
        note4.setBackground(color);
        ImageIcon delIcon4 = new ImageIcon(("delete.png"));
        JButton delete4 = new JButton(delIcon4);
        delete4.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note4.setForeground(Color.white);
        Q4.setForeground(Color.white);
        title4.setForeground(Color.white);
        p$4.setForeground(Color.white);
        price4.setForeground(Color.WHITE);
        delete4.setBackground(darkcolor);
        price4.setBackground(darkcolor);
        note4.setBorder(BorderFactory.createLineBorder(color));
        Q4.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish4.add(iicon4);
        dish4.add(title4);
        dish4.add(p$4);
        dish4.add(Q4);
        dish4.add(price4);
        dish4.add(note4);
        dish4.add(delete4);

/////////////////

        //////////////////
        JPanel dish5 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish5.setPreferredSize(new Dimension(380, 100));
        dish5.setBackground(darkcolor);
        ImageIcon icon5 = new ImageIcon(("small Chicken Orzo Salad.jpg"));
        JLabel iicon5 = new JLabel(icon5);
        JLabel title5 = new JLabel("Chicken Orzo Salad");
        title5.setPreferredSize(new Dimension(130, 20));
        JLabel p$5 = new JLabel("$18.1");
        p$5.setPreferredSize(new Dimension(40, 20));
        JTextField Q5 = new JTextField();
        Q5.setPreferredSize(new Dimension(35, 35));
        Q5.setBackground(color);
        JTextField price5 = new JTextField();
        price5.setEditable(false);
        price5.setPreferredSize(new Dimension(35, 35));
        price5.setText("00");
        price5.setPreferredSize(new Dimension(35, 35));
        JTextField note5 = new JTextField("Order note5...");
        note5.setPreferredSize(new Dimension(270, 35));
        note5.setBackground(color);
        ImageIcon delIcon5 = new ImageIcon(("delete.png"));
        JButton delete5 = new JButton(delIcon5);
        delete5.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note5.setForeground(Color.white);
        Q5.setForeground(Color.white);
        title5.setForeground(Color.white);
        p$5.setForeground(Color.white);
        price5.setForeground(Color.WHITE);
        delete5.setBackground(darkcolor);
        price5.setBackground(darkcolor);
        note5.setBorder(BorderFactory.createLineBorder(color));
        Q5.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish5.add(iicon5);
        dish5.add(title5);
        dish5.add(p$5);
        dish5.add(Q5);
        dish5.add(price5);
        dish5.add(note5);
        dish5.add(delete5);

/////////////////

//////////////////
        JPanel dish6 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish6.setPreferredSize(new Dimension(380, 100));
        dish6.setBackground(darkcolor);
        ImageIcon icon6 = new ImageIcon(("small Noodle Pad Thai.jpg"));
        JLabel iicon6 = new JLabel(icon6);
        JLabel title6 = new JLabel("Noodle Pad Thai");
        title6.setPreferredSize(new Dimension(130, 20));
        JLabel p$6 = new JLabel("$25.1");
        p$6.setPreferredSize(new Dimension(40, 20));
        JTextField Q6 = new JTextField();
        Q6.setPreferredSize(new Dimension(35, 35));
        Q6.setBackground(color);
        JTextField price6 = new JTextField();
        price6.setEditable(false);
        price6.setPreferredSize(new Dimension(35, 35));
        price6.setText("00");
        price6.setPreferredSize(new Dimension(35, 35));
        JTextField note6 = new JTextField("Order note6...");
        note6.setPreferredSize(new Dimension(270, 35));
        note6.setBackground(color);
        ImageIcon delIcon6 = new ImageIcon(("delete.png"));
        JButton delete6 = new JButton(delIcon6);
        delete6.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note6.setForeground(Color.white);
        Q6.setForeground(Color.white);
        title6.setForeground(Color.white);
        p$6.setForeground(Color.white);
        price6.setForeground(Color.WHITE);
        delete6.setBackground(darkcolor);
        price6.setBackground(darkcolor);
        note6.setBorder(BorderFactory.createLineBorder(color));
        Q6.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish6.add(iicon6);
        dish6.add(title6);
        dish6.add(p$6);
        dish6.add(Q6);
        dish6.add(price6);
        dish6.add(note6);
        dish6.add(delete6);

/////////////////

//////////////////
        JPanel dish7 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish7.setPreferredSize(new Dimension(380, 100));
        dish7.setBackground(darkcolor);
        ImageIcon icon7 = new ImageIcon(("small Pasta Fagioli Soup.jpg"));
        JLabel iicon7 = new JLabel(icon7);
        JLabel title7 = new JLabel("Pasta Fagioli Soup");
        title7.setPreferredSize(new Dimension(130, 20));
        JLabel p$7 = new JLabel("$12.3");
        p$7.setPreferredSize(new Dimension(40, 20));
        JTextField Q7 = new JTextField();
        Q7.setPreferredSize(new Dimension(35, 35));
        Q7.setBackground(color);
        JTextField price7 = new JTextField();
        price7.setEditable(false);
        price7.setPreferredSize(new Dimension(35, 35));
        price7.setText("00");
        price7.setPreferredSize(new Dimension(35, 35));
        JTextField note7 = new JTextField("Order note7...");
        note7.setPreferredSize(new Dimension(270, 35));
        note7.setBackground(color);
        ImageIcon delIcon7 = new ImageIcon(("delete.png"));
        JButton delete7 = new JButton(delIcon7);
        delete7.setPreferredSize(new Dimension(35, 35));
        note7.setBorder(BorderFactory.createLineBorder(color));
        Q7.setBorder(BorderFactory.createLineBorder(color));

        //setting colors
        note7.setForeground(Color.white);
        Q7.setForeground(Color.white);
        title7.setForeground(Color.white);
        p$7.setForeground(Color.white);
        price7.setForeground(Color.WHITE);
        delete7.setBackground(darkcolor);
        price7.setBackground(darkcolor);

        //Adding components
        dish7.add(iicon7);
        dish7.add(title7);
        dish7.add(p$7);
        dish7.add(Q7);
        dish7.add(price7);
        dish7.add(note7);
        dish7.add(delete7);

/////////////////

//////////////////
        JPanel dish8 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish8.setPreferredSize(new Dimension(380, 100));
        dish8.setBackground(darkcolor);
        ImageIcon icon8 = new ImageIcon(("small Chicken Rice Soup.jpg"));
        JLabel iicon8 = new JLabel(icon8);
        JLabel title8 = new JLabel("Chicken Rice Soup");
        title8.setPreferredSize(new Dimension(130, 20));
        JLabel p$8 = new JLabel("$14.6");
        p$8.setPreferredSize(new Dimension(40, 20));
        JTextField Q8 = new JTextField();
        Q8.setPreferredSize(new Dimension(35, 35));
        Q8.setBackground(color);
        JTextField price8 = new JTextField();
        price8.setEditable(false);
        price8.setPreferredSize(new Dimension(35, 35));
        price8.setText("00");
        price8.setPreferredSize(new Dimension(35, 35));
        JTextField note8 = new JTextField("Order note8...");
        note8.setPreferredSize(new Dimension(270, 35));
        note8.setBackground(color);
        ImageIcon delIcon8 = new ImageIcon(("delete.png"));
        JButton delete8 = new JButton(delIcon8);
        delete8.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note8.setForeground(Color.white);
        Q8.setForeground(Color.white);
        title8.setForeground(Color.white);
        p$8.setForeground(Color.white);
        price8.setForeground(Color.WHITE);
        delete8.setBackground(darkcolor);
        price8.setBackground(darkcolor);
        note8.setBorder(BorderFactory.createLineBorder(color));
        Q8.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish8.add(iicon8);
        dish8.add(title8);
        dish8.add(p$8);
        dish8.add(Q8);
        dish8.add(price8);
        dish8.add(note8);
        dish8.add(delete8);

/////////////////

        //////////////////
        JPanel dish9 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dish9.setPreferredSize(new Dimension(380, 100));
        dish9.setBackground(darkcolor);
        ImageIcon icon9 = new ImageIcon(("small spicy grilled chicken.jpg"));
        JLabel iicon9 = new JLabel(icon9);
        JLabel title9 = new JLabel("spicy grilled chicken");
        title9.setPreferredSize(new Dimension(130, 20));
        JLabel p$9 = new JLabel("$15.00");
        p$9.setPreferredSize(new Dimension(40, 20));
        JTextField Q9 = new JTextField();
        Q9.setPreferredSize(new Dimension(35, 35));
        Q9.setBackground(color);
        JTextField price9 = new JTextField();
        price9.setEditable(false);
        price9.setPreferredSize(new Dimension(35, 35));
        price9.setText("00");
        price9.setPreferredSize(new Dimension(35, 35));
        JTextField note9 = new JTextField("Order note9...");
        note9.setPreferredSize(new Dimension(270, 35));
        note9.setBackground(color);
        ImageIcon delIcon9 = new ImageIcon(("delete.png"));
        JButton delete9 = new JButton(delIcon9);
        delete9.setPreferredSize(new Dimension(35, 35));

        //setting colors
        note9.setForeground(Color.white);
        Q9.setForeground(Color.white);
        title9.setForeground(Color.white);
        p$9.setForeground(Color.white);
        price9.setForeground(Color.WHITE);
        delete9.setBackground(darkcolor);
        price9.setBackground(darkcolor);
        note9.setBorder(BorderFactory.createLineBorder(color));
        Q9.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dish9.add(iicon9);
        dish9.add(title9);
        dish9.add(p$9);
        dish9.add(Q9);
        dish9.add(price9);
        dish9.add(note9);
        dish9.add(delete9);

/////////////////

        //////////////////
        JPanel dishA = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dishA.setPreferredSize(new Dimension(380, 100));
        dishA.setBackground(darkcolor);
        ImageIcon iconA = new ImageIcon(("small Pineapple Meatballs.jpg"));
        JLabel iiconA = new JLabel(iconA);
        JLabel titleA = new JLabel("Pineapple Meatballs");
        titleA.setPreferredSize(new Dimension(130, 20));
        JLabel p$A = new JLabel("$12.00");
        p$A.setPreferredSize(new Dimension(40, 20));
        JTextField QA = new JTextField();
        QA.setPreferredSize(new Dimension(35, 35));
        QA.setBackground(color);
        JTextField priceA = new JTextField();
        priceA.setEditable(false);
        priceA.setPreferredSize(new Dimension(35, 35));
        priceA.setText("00");
        priceA.setPreferredSize(new Dimension(35, 35));
        JTextField noteA = new JTextField("Order noteA...");
        noteA.setPreferredSize(new Dimension(270, 35));
        noteA.setBackground(color);
        ImageIcon delIconA = new ImageIcon(("delete.png"));
        JButton deleteA = new JButton(delIconA);
        deleteA.setPreferredSize(new Dimension(35, 35));

        //setting colors
        noteA.setForeground(Color.white);
        QA.setForeground(Color.white);
        titleA.setForeground(Color.white);
        p$A.setForeground(Color.white);
        priceA.setForeground(Color.WHITE);
        deleteA.setBackground(darkcolor);
        priceA.setBackground(darkcolor);
        noteA.setBorder(BorderFactory.createLineBorder(color));
        QA.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dishA.add(iiconA);
        dishA.add(titleA);
        dishA.add(p$A);
        dishA.add(QA);
        dishA.add(priceA);
        dishA.add(noteA);
        dishA.add(deleteA);

/////////////////

//////////////////
        JPanel dishB = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        dishB.setPreferredSize(new Dimension(380, 100));
        dishB.setBackground(darkcolor);
        ImageIcon iconB = new ImageIcon(("small Strawberry Dump Cake.jpg"));
        JLabel iiconB = new JLabel(iconB);
        JLabel titleB = new JLabel("Strawberry Dump Cake");
        titleB.setPreferredSize(new Dimension(130, 20));
        JLabel p$B = new JLabel("$14.00");
        p$B.setPreferredSize(new Dimension(40, 20));
        JTextField QB = new JTextField();
        QB.setPreferredSize(new Dimension(35, 35));
        QB.setBackground(color);
        JTextField priceB = new JTextField();
        priceB.setEditable(false);
        priceB.setPreferredSize(new Dimension(35, 35));
        priceB.setText("00");
        priceB.setPreferredSize(new Dimension(35, 35));
        JTextField noteB = new JTextField("Order noteB...");
        noteB.setPreferredSize(new Dimension(270, 35));
        noteB.setBackground(color);
        ImageIcon delIconB = new ImageIcon(("delete.png"));
        JButton deleteB = new JButton(delIconB);
        deleteB.setPreferredSize(new Dimension(35, 35));

        //setting colors
        noteB.setForeground(Color.white);
        QB.setForeground(Color.white);
        titleB.setForeground(Color.white);
        p$B.setForeground(Color.white);
        priceB.setForeground(Color.WHITE);
        deleteB.setBackground(darkcolor);
        priceB.setBackground(darkcolor);
        noteB.setBorder(BorderFactory.createLineBorder(color));
        QB.setBorder(BorderFactory.createLineBorder(color));
        //Adding components
        dishB.add(iiconB);
        dishB.add(titleB);
        dishB.add(p$B);
        dishB.add(QB);
        dishB.add(priceB);
        dishB.add(noteB);
        dishB.add(deleteB);

/////////////////



        //south.north.master Components
        south.setLayout(new FlowLayout(FlowLayout.LEFT,30,0));
        south.setBorder(BorderFactory.createEmptyBorder(20, 0, 2, 0));
        south.setBackground(color);
        south.add(buttHot);
        south.add(buttCold);
        south.add(buttSoup);
        south.add(buttGrill);
        south.add(buttAppetizer);
        south.add(buttDessert);
        south.add(space);
        south.add(percent);
        south.add(space3);


        north.setLayout(new BorderLayout());
        north.add(name,BorderLayout.NORTH);
        north.add(date,BorderLayout.CENTER);
        north.add(south,BorderLayout.SOUTH);
        north.setBackground(color);
        north.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

     //northCenter Components (label and CompoBox)
        northCenter.setLayout(new FlowLayout(FlowLayout.LEFT));
        northCenter.setBackground(color);
        northCenter.setBorder(BorderFactory.createEmptyBorder(15,0,0,0));
        northCenter.add(choose);
        northCenter.add(space2);
        northCenter.add(options);


      //CenterOfCenter Components
        // 1st List of Dishes
        centerOfCenter1.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter1.setPreferredSize(new Dimension(900,500));
        centerOfCenter1.setBackground(color);
        centerOfCenter1.setBorder(BorderFactory.createEmptyBorder(15,0,0,0));
              centerOfCenter1.add(Dish1);
              centerOfCenter1.add(Dish2);
              centerOfCenter1.add(Dish3);
              centerOfCenter1.add(Dish4);

       //2nd List of Dishes
        centerOfCenter2.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter2.setPreferredSize(new Dimension(900,500));
        centerOfCenter2.setBackground(color);
              centerOfCenter2.add(Dish5);
              centerOfCenter2.add(Dish6);

       //3rd List of Dishes
        centerOfCenter3.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter3.setPreferredSize(new Dimension(900,500));
        centerOfCenter3.setBackground(color);
              centerOfCenter3.add(Dish7);
              centerOfCenter3.add(Dish8);

       //4th List of Dishes
        centerOfCenter4.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter4.setPreferredSize(new Dimension(900,500));
        centerOfCenter4.setBackground(color);
              centerOfCenter4.add(Dish9);

       //5th List of Dishes
        centerOfCenter5.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter5.setPreferredSize(new Dimension(900,500));
        centerOfCenter5.setBackground(color);
              centerOfCenter5.add(Dish10);

       //6th List of Dishes
        centerOfCenter6.setLayout(new FlowLayout(FlowLayout.LEFT,20,10));
        centerOfCenter6.setPreferredSize(new Dimension(900,500));
        centerOfCenter6.setBackground(color);
              centerOfCenter6.add(Dish11);



        //Center panel components
        center.setLayout(new BorderLayout());
        center.setBackground(color);
        center.add(northCenter,BorderLayout.NORTH);
        center.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        center.add(centerOfCenter2,BorderLayout.CENTER);
        center.add(centerOfCenter3,BorderLayout.CENTER);
        center.add(centerOfCenter4,BorderLayout.CENTER);
        center.add(centerOfCenter5,BorderLayout.CENTER);
        center.add(centerOfCenter6,BorderLayout.CENTER);
        center.add(centerOfCenter1,BorderLayout.CENTER);







//////////////////////////////////////////// Here begin the right panel \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //divide right panel initialization
        northRight =new JPanel();
        centerRight=new JPanel();
        southRight=new JPanel();

    //northRight component
        northRight.setLayout(new BorderLayout());
        northRight.setBackground(darkcolor);
        JLabel orders=new JLabel("  Orders #34562                                          ");
        orders.setBorder(BorderFactory.createEmptyBorder(5, 0, 10, 0));
        orders.setFont(new Font(Font.DIALOG, Font.BOLD, 17));
        rightOptions=new JPanel();
        rightOptions.setLayout(new FlowLayout(FlowLayout.LEFT,10,0));
        O1=new JButton("Dine In");
        O2=new JButton("To Go");
        O3=new JButton("Delivery");
        rightOptions.add(O1);
        rightOptions.add(O2);
        rightOptions.add(O3);
        northRight.add(orders,BorderLayout.NORTH);
        northRight.add(rightOptions,BorderLayout.CENTER);
                    //set colors
                     rightOptions.setBackground(darkcolor);
                     orders.setForeground(Color.white);
                     orders.setBackground(color);
                     O1.setForeground(orange);
                     O2.setForeground(orange);
                     O3.setForeground(orange);
                     O1.setBackground(darkcolor);
                     O2.setBackground(darkcolor);
                     O3.setBackground(darkcolor);

                     O1.setBorder(BorderFactory.createLineBorder(color));
                     O2.setBorder(BorderFactory.createLineBorder(color));
                     O3.setBorder(BorderFactory.createLineBorder(color));


    //CenterRight Components
        centerRight.setLayout(new BorderLayout());
        centerRight.setBorder(BorderFactory.createEmptyBorder(10, 5, 5, 5));
        centerRight.setPreferredSize(new Dimension(385,400));
        centerRight.setBackground(darkcolor);
            //NCenterRight panel
            JPanel NCenterRight = new JPanel();
            NCenterRight.setBackground(darkcolor);
            NCenterRight.setLayout(new FlowLayout(FlowLayout.LEFT,15,0));
            JLabel item=new JLabel("Item                                                                    ");
            JLabel qty =new JLabel("Qty");
            JLabel Price =new JLabel("Price");
            item.setForeground(Color.white);
            qty.setForeground(Color.white);
            Price.setForeground(Color.white);
            NCenterRight.add(item);
            NCenterRight.add(qty);
            NCenterRight.add(Price);

            JPanel CCCenterRight= new JPanel();
        CCCenterRight.setLayout(new BorderLayout(0,0));
        CCCenterRight.setBackground(darkcolor);
        centerRight.add(CCCenterRight,BorderLayout.CENTER);

        JPanel CCenterRight = new JPanel();
           CCenterRight.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
//         CCenterRight.add(dish1);
//           CCenterRight.add(dish2);
//           CCenterRight.add(dish3);
//           CCenterRight.add(dish4);
//            CCenterRight.add(dish5);
//           CCenterRight.add(dish6);
//           CCenterRight.add(dish7);
//           CCenterRight.add(dish8);
//           CCenterRight.add(dish9);
//          CCenterRight.add(dishA);
//           CCenterRight.add(dishB);

        CCenterRight.setBackground(darkcolor);
        centerRight.add(NCenterRight,BorderLayout.NORTH);
        CCCenterRight.add(CCenterRight,BorderLayout.CENTER);

    //southRight panel
      southRight.setLayout(new BorderLayout());
        JPanel disCount =new JPanel(new FlowLayout(FlowLayout.LEFT));
                JLabel DISCOUNT =new JLabel("Discount                                                                                             ");
                JTextField Dis$=new JTextField("0$");
                    Dis$.setEditable(false);
                    Dis$.setBackground(darkcolor);
                    Dis$.setForeground(Color.WHITE);
                    Dis$.setBorder(BorderFactory.createLineBorder(darkcolor));
            disCount.add(DISCOUNT);
            disCount.add(Dis$ );
        JPanel Sub =new JPanel(new FlowLayout(FlowLayout.LEFT));
                 JLabel subTotal =new JLabel("Sub total ");
                 subTotal.setPreferredSize(new Dimension(315,10));
                 JTextField sub$=new JTextField("0$");
                     sub$.setPreferredSize(new Dimension(40,20));
                     sub$.setEditable(false);
                     sub$.setBackground(darkcolor);
                     sub$.setForeground(Color.WHITE);
                     sub$.setBorder(BorderFactory.createLineBorder(darkcolor));

        Sub.add(subTotal);
            Sub.add(sub$ );
        JPanel butt =new JPanel(new FlowLayout(FlowLayout.CENTER));
             JButton Cont=new JButton("Continue to Payment");
                Cont.setPreferredSize(new Dimension(350,25));
             butt.add(Cont);

      southRight.add(disCount,BorderLayout.NORTH);
      southRight.add(Sub,BorderLayout.CENTER);
      southRight.add(butt,BorderLayout.SOUTH);
        southRight.setBackground(darkcolor);
        disCount.setBackground(darkcolor);
        DISCOUNT.setForeground(Color.lightGray);
        subTotal.setForeground(Color.lightGray);
        Sub.setBackground(darkcolor);
        butt.setBackground(darkcolor);
        Cont.setBackground(orange);
        Cont.setForeground(Color.WHITE);



        //left panel
        left.setLocation(0,0);
        left.setSize(50,700);
        left.setBackground(color);

        // master panel
        master.setLocation(50,0);
        master.setSize(650,700);
        master.setBackground(color);
        master.setLayout(new BorderLayout(0,0));
        //adding components to master panel
        master.add(north,BorderLayout.NORTH);
        master.add(center,BorderLayout.CENTER);


        // right panel
        rightPanel.setLocation(700,0);
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setSize(385,700);
        rightPanel.setBackground(darkcolor);
        //adding components to right panel
        rightPanel.add(northRight,BorderLayout.NORTH);
        rightPanel.add(centerRight,BorderLayout.CENTER);
        rightPanel.add(southRight,BorderLayout.SOUTH);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));


        add(master);
        add(rightPanel);
        add(left);













        /////////////////////////////////aym.


        JPanel panel7=new JPanel(new BorderLayout());
        panel7.setLocation(0,0);
        panel7.setSize(450,700);
        panel7.setVisible(true);
        panel7.setBackground(darkcolor);
        ///////////////////////////////////////////////////////////////start north border
        JPanel panel7n=new JPanel(new BorderLayout());
        panel7n.setBackground(darkcolor);
        ImageIcon back=new ImageIcon(getClass().getResource("back.png"));
        JButton button7n=new JButton(back);
        button7n.setBackground(darkcolor);
        button7n.setBorder(BorderFactory.createLineBorder(darkcolor));
        button7n.setPreferredSize(new Dimension(32,32));
        JPanel panel7nn=new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel7nn.setBackground(darkcolor);
        panel7nn.add(button7n,BorderLayout.NORTH);
        panel7n.add(panel7nn,BorderLayout.NORTH);
        JPanel panel7nc=new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel7nc.setBackground(darkcolor);
        JLabel label7nc1=new JLabel("    confirmation                                ");
        label7nc1.setForeground(Color.white);
        label7nc1.setFont(new Font("dsd",Font.BOLD,20));
        panel7nc.add(label7nc1);
        ImageIcon add=new ImageIcon(getClass().getResource("add.png"));
        JLabel label7nc2=new JLabel(add);
        panel7nc.add(label7nc2);
        panel7n.add(panel7nc,BorderLayout.CENTER);
        JPanel panel7ns=new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel7ns.setBackground(darkcolor);

        JLabel label7ns=new JLabel("      Order #34562");
        label7ns.setPreferredSize(new Dimension(450,20));
        label7ns.setForeground(Color.white);
        label7ns.setFont(new Font("dsd",Font.BOLD,13));
        panel7ns.add(label7ns);
        panel7n.add(panel7ns,BorderLayout.SOUTH);

        panel7.add(panel7n,BorderLayout.NORTH);
        //////////////////////////////////////////////////////////////end north border
        //////////////////////////////////////////////////////////////start cennter border
        JPanel panel7c=new JPanel(new BorderLayout());
        panel7c.setBackground(darkcolor);
        panel7c.setBorder(BorderFactory.createEmptyBorder(0,50,0,0));
        panel7.add(panel7c,BorderLayout.CENTER);
        //////////////////////////////////////////////////////////////end start border

        //////////////////////////////////////////////////////////////end south border
        JPanel panel7s=new JPanel(new FlowLayout(FlowLayout.LEFT,0,50));
        panel7s.setBackground(darkcolor);

        panel7s.setPreferredSize(new Dimension(450,100));
        JLabel label7s1=new JLabel("     Sub total                                                                                    ");
        label7s1.setForeground(Color.GRAY);
        label7s1.setFont(new Font("dsd",Font.BOLD,13));
        JLabel label7s2=new JLabel("$0");
        label7s2.setForeground(Color.GRAY);
        label7s2.setFont(new Font("dsd",Font.BOLD,13));

        panel7s.add(label7s1);
        panel7s.add(label7s2);
        panel7.add(panel7s,BorderLayout.SOUTH);
        //////////////////////////////////////////////////////////////end south border

        add(panel7);
        //////////////////////////////////////////////////////////////end panel7







        ///////////////////////////////////////////////////////////////start panel8
        JPanel panel8=new JPanel();
        panel8.setLocation(450,0);
        panel8.setSize(1,700);
        panel8.setVisible(true);
        panel8.setBackground(Color.gray);
        add(panel8);
        //////////////////////////////////////////////////////////////end panel8
        ///////////////////////////////////////////////////////////////start panel9
        JPanel panel9=new JPanel();
        panel9.setLocation(451,0);
        panel9.setSize(449,700);
        panel9.setBackground(darkcolor);
        panel9.setVisible(true);
        ////////////////////////////////////////////////////////////// panel 9 north start
        JPanel panel9n=new JPanel(new BorderLayout());
        panel9n.setBackground(darkcolor);
        JPanel panel9nn=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel9nc=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel9ns=new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label9n1=new JLabel(" ");
        panel9nn.add(label9n1);
        //
        panel9nn.setPreferredSize(new Dimension(449,50));
        panel9nn.setBackground(darkcolor);
        panel9n.add(panel9nn,BorderLayout.NORTH);

        JLabel label9n2=new JLabel("     Payment                                         ");
        label9n2.setForeground(Color.white);
        label9n2.setFont(new Font("dsd",Font.BOLD,20));
        panel9nc.add(label9n2);
        //
        panel9nc.setPreferredSize(new Dimension(449,50));
        panel9nc.setBackground(darkcolor);
        panel9n.add(panel9nc,BorderLayout.CENTER);

        JLabel label9n3=new JLabel("        2 Payment methode availabel   ");
        label9n3.setPreferredSize(new Dimension(450,20));
        label9n3.setForeground(Color.white);
        label9n3.setFont(new Font("dsd",Font.BOLD,13));
        panel9ns.add(label9n3);
        panel9n.add(panel9ns,BorderLayout.SOUTH);
        //
        panel9ns.setBackground(darkcolor);
        panel9.add(panel9n,BorderLayout.NORTH);
        ////////////////////////////////////////////////////////////// panel 9 north end
        ////////////////////////////////////////////////////////////// panel 9 center start
        JPanel panel9c=new JPanel(new BorderLayout());
        panel9c.setPreferredSize(new Dimension(450,400));
        panel9c.setBackground(darkcolor);
        JPanel panel9cn=new JPanel(new FlowLayout(FlowLayout.LEFT,30,10));
        panel9cn.setBackground(darkcolor);
        panel9cn.setPreferredSize(new Dimension(450,100));
        JLabel label9cn=new JLabel("Payment Name                                                                    ");
        label9cn.setFont(new Font("sd",Font.BOLD,15));
        label9cn.setForeground(Color.white);
        panel9cn.add(label9cn);
        ImageIcon visa=new ImageIcon(getClass().getResource("visa.png"));
        JButton buttonvisa=new JButton(visa);
        buttonvisa.setBackground(color);
        buttonvisa.setPreferredSize(new Dimension(90,50));
        panel9cn.add(buttonvisa);
        ImageIcon cash=new ImageIcon(getClass().getResource("cash.png"));
        JButton buttoncash=new JButton(cash);
        buttoncash.setBackground(darkcolor);
        buttoncash.setPreferredSize(new Dimension(90,50));
        panel9cn.add(buttoncash);
        panel9c.add(panel9cn,BorderLayout.NORTH);
        /////////////////////////////////////////////////////////// visa
        JPanel panelvisa=new JPanel(new FlowLayout(FlowLayout.LEFT,13,10));
        panelvisa.setVisible(true);
        panelvisa.setPreferredSize(new Dimension(450,300));
        panelvisa.setBackground(darkcolor);

        JLabel visa1=new JLabel("Cardholder Name   ");
        visa1.setPreferredSize(new Dimension(430,20));
        visa1.setForeground(Color.white);
        JTextField visa2=new JTextField("",35);
        visa2.setPreferredSize(new Dimension(430,40));
        visa2.setForeground(Color.white);
        visa2.setBackground(color);
        JLabel visa3=new JLabel("Card Number   ");
        visa3.setPreferredSize(new Dimension(430,20));
        visa3.setForeground(Color.white);
        JTextField visa4=new JTextField("",35);
        visa4.setPreferredSize(new Dimension(430,40));
        visa4.setForeground(Color.white);
        visa4.setBackground(color);
        JLabel visa5=new JLabel("Expiration Date                                      cvv   ");
        visa5.setPreferredSize(new Dimension(430,20));
        visa5.setForeground(Color.white);
        JTextField visa6=new JTextField("",19);
        visa6.setPreferredSize(new Dimension(200,40));
        visa6.setForeground(Color.white);
        visa6.setBackground(color);
        JPasswordField visa7=new JPasswordField("",19);
        visa7.setPreferredSize(new Dimension(200,40));
        visa7.setForeground(Color.white);
        visa7.setBackground(color);
        panelvisa.add(visa1);panelvisa.add(visa2);panelvisa.add(visa3);panelvisa.add(visa4);
        panelvisa.add(visa5);panelvisa.add(visa6);panelvisa.add(visa7);


        ///////////////////////////////////////////////////////////////// cash
        JPanel panelcash=new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelcash.setPreferredSize(new Dimension(450,300));
        panelcash.setBackground(darkcolor);


        panel9.add(panel9c,BorderLayout.CENTER);

        ////////////////////////////////////////////////////////////// panel 9 center end
        ////////////////////////////////////////////////////////////// panel 9 south end
        JPanel panel9s=new JPanel(new BorderLayout());
        panel9s.setBackground(darkcolor);
        panel9s.setPreferredSize(new Dimension(450,150));
        JPanel panel9ss=new JPanel(new FlowLayout(FlowLayout.LEFT,30,10));
        panel9ss.setBackground(darkcolor);
        JButton button9s1=new JButton("     Cancel     ");
        button9s1.setBorder(BorderFactory.createLineBorder(orange));
        button9s1.setPreferredSize(new Dimension(180,40));
        button9s1.setBackground(darkcolor);
        button9s1.setForeground(orange);
        JButton button9s2=new JButton("  Confirm Payment  ");
        button9s2.setPreferredSize(new Dimension(180,40));
        button9s2.setForeground(Color.white);
        button9s2.setBackground(orange);
        button9s2.setBorder(BorderFactory.createLineBorder(orange));
        panel9ss.add(button9s1);panel9ss.add(button9s2);
        panel9s.add(panel9ss,BorderLayout.SOUTH);
        panel9.add(panel9s,BorderLayout.SOUTH);


        ////////////////////////////////////////////////////////////// panel 9 south end


        add(panel9);
//////////////////////////////////////////////////////////////end panel9

        master.setVisible(true);
        rightPanel.setVisible(true);
        left.setVisible(true);
        panel7.setVisible(false);
        panel8.setVisible(false);
        panel9.setVisible(false);




        /////////////////////////////////////////////// event handling ////////////////






        Cont.addActionListener(new ActionListener() {/////////// cash button
            @Override
            public void actionPerformed(ActionEvent e) {


                master.setVisible(false);
                rightPanel.setVisible(false);
                left.setVisible(false);

                setSize(900,800);
                panel7.setVisible(true);
                panel8.setVisible(true);
                panel9.setVisible(true);

                panel7c.add(CCenterRight,BorderLayout.CENTER);

            }

        });


        button7n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                left.setVisible(true);
                rightPanel.setVisible(true);
                master.setVisible(true);
                setSize(1100,750);
                panel7.setVisible(false);
                panel8.setVisible(false);
                panel9.setVisible(false);
                CCCenterRight.add(CCenterRight,BorderLayout.CENTER);

            }
        });
        buttonvisa.addActionListener(new ActionListener() {/////////// visa boutton
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==buttonvisa){
                    panel9c.add(panelvisa,BorderLayout.CENTER);
                    panelcash.setVisible(false);
                    panelvisa.setVisible(true);
                    repaint();
                    revalidate();}

            }
        });
        buttoncash.addActionListener(new ActionListener() {/////////// cash boutton
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==buttoncash){
                    panel9c.add(panelcash,BorderLayout.CENTER);
                    panelcash.setVisible(true);
                    panelvisa.setVisible(false);
                    repaint();
                    revalidate();}

            }
        });



        button9s1.addActionListener(new ActionListener() {///////// to cancel button
            @Override
            public void actionPerformed(ActionEvent e) {


                master.setVisible(true);
                rightPanel.setVisible(true);
                left.setVisible(true);
                setSize(1100,750);
                panel7.setVisible(false);
                panel8.setVisible(false);
                panel9.setVisible(false);

                CCCenterRight.add(CCenterRight,BorderLayout.CENTER);


            } });

        button9s2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();// to close frame
                JOptionPane.showMessageDialog( null, "Added successfully" );
            }

        });



                //ALL lists Action listeners
        buttHot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter1,BorderLayout.CENTER);



            }

        });
        buttCold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter2,BorderLayout.CENTER);

            }

        });

        buttSoup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter3,BorderLayout.CENTER);
            }

        });
        buttGrill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter4,BorderLayout.CENTER);
            }

        });
        buttAppetizer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter5,BorderLayout.CENTER);
            }

        });
        buttDessert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                center.removeAll();
                center.revalidate();
                center.repaint();
                center.add(northCenter,BorderLayout.NORTH);
                center.add(centerOfCenter6,BorderLayout.CENTER);
            }

        });



        //CopoBox Action listener
        options.setSelectedIndex(0);
        options.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (options.getSelectedIndex() == 0) {
                        O2.setBackground(darkcolor);
                        O1.setForeground(Color.white);
                        O1.setBackground(orange);
                        O3.setForeground(Color.white);
                        O3.setBackground(darkcolor);
                    }
                    if (options.getSelectedIndex() == 1) {
                        O1.setForeground(Color.white);
                        O1.setBackground(darkcolor);
                        O2.setForeground(Color.white);
                        O2.setBackground(orange);
                        O3.setForeground(Color.white);
                        O3.setBackground(darkcolor);
                    }
                    if (options.getSelectedIndex() == 2) {
                        O1.setForeground(Color.white);
                        O1.setBackground(darkcolor);
                        O3.setForeground(Color.white);
                        O3.setBackground(orange);
                        O2.setForeground(Color.white);
                        O2.setBackground(darkcolor);
                    }
                }
            }
        });

            //ALl right lists action listeners
        Dish1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish1);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });

        Dish2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish2);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });

        Dish3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish3);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });

        Dish4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish4);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });

        Dish5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish5);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish6);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish7);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish8);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dish9);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dishA);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });
        Dish11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CCenterRight.add(dishB);
                CCenterRight.revalidate();
                CCenterRight.repaint();
            }
        });

            //delete buttons event handling
        delete1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish1);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price1.setText("00");

                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });
        delete2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish2);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price2.setText("00");

                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });


        delete3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish3);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price3.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        delete4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish4);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price4.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        delete5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish5);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price5.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });
        delete6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish6);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price6.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });


        delete7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish7);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price7.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        delete8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish8);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price8.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        delete9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dish9);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                price9.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        deleteA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dishA);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                priceA.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

        deleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                CCenterRight.remove(dishB);
                CCenterRight.revalidate();
                CCenterRight.repaint();
                priceB.setText("00");
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");

                label7s2.setText(sub$.getText());
            }

        });

            //Q TextFields event Handlings
        Q1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price1.setText(String.format("%.2f", (Integer.parseInt(Q1.getText())*ss1)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                        + Double.parseDouble(price2.getText())
                        + Double.parseDouble(price3.getText())
                        + Double.parseDouble(price4.getText())
                        + Double.parseDouble(price5.getText())
                        + Double.parseDouble(price6.getText())
                        + Double.parseDouble(price7.getText())
                        + Double.parseDouble(price8.getText())
                        + Double.parseDouble(price9.getText())
                        + Double.parseDouble(priceA.getText())
                        + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price2.setText(String.format("%.2f", (Integer.parseInt(Q2.getText())*ss2)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        Q3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price3.setText(String.format("%.2f", (Integer.parseInt(Q3.getText())*ss3)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price4.setText(String.format("%.2f", (Integer.parseInt(Q4.getText())*ss4)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        Q5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price5.setText(String.format("%.2f", (Integer.parseInt(Q5.getText())*ss5)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price6.setText(String.format("%.2f", (Integer.parseInt(Q6.getText())*ss6)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price7.setText(String.format("%.2f", (Integer.parseInt(Q7.getText())*ss7)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price8.setText(String.format("%.2f", (Integer.parseInt(Q8.getText())*ss8)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price9.setText(String.format("%.2f", (Integer.parseInt(Q9.getText())*ss9)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        QA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                priceA.setText(String.format("%.2f", (Integer.parseInt(QA.getText())*ss10)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        QB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                priceB.setText(String.format("%.2f", (Integer.parseInt(QB.getText())*ss11)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        Q1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price1.setText(String.format("%.2f", (Integer.parseInt(Q1.getText())*ss1)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });


        Q1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price1.setText(String.format("%.2f", (Integer.parseInt(Q1.getText())*ss1)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });

        Q1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                price1.setText(String.format("%.2f", (Integer.parseInt(Q1.getText())*ss1)));
                sub$.setText((String.valueOf(
                        Double.parseDouble(price1.getText())
                                + Double.parseDouble(price2.getText())
                                + Double.parseDouble(price3.getText())
                                + Double.parseDouble(price4.getText())
                                + Double.parseDouble(price5.getText())
                                + Double.parseDouble(price6.getText())
                                + Double.parseDouble(price7.getText())
                                + Double.parseDouble(price8.getText())
                                + Double.parseDouble(price9.getText())
                                + Double.parseDouble(priceA.getText())
                                + Double.parseDouble(priceB.getText()) ))+"$");
                label7s2.setText(sub$.getText());


            }
        });
















    }












}











//    setLayout(null);
//        panel1=new JPanel();
//                panel1.setLocation(0,0);
//                panel1.setSize(80,800);
//                panel1.setBackground(darkcolor);




//    public  String getCurrentDateFormatted() {
//        LocalDate currentDate = LocalDate.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy");
//        String formattedDate = currentDate.format(formatter);
//        return formattedDate;}









public class Main {
    public static void main(String[] args) {
        Proj myProj =new Proj();
        myProj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myProj.setSize(1100,750);

        // Center the frame on the screen
        myProj.setLocationRelativeTo(null);

        myProj.setVisible(true);
    }
}