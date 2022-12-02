import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener {
	private Container c;
	private JLabel title;
	private JLabel title1;
	private JLabel district;
	private JTextField tdistrict;
	private JLabel collegename;
	private JTextField tcollegename;
	private JLabel programname;
	private JComboBox tprogramname;
	private JLabel medium;
	private JComboBox tmedium;
	private JLabel title2;
	private JLabel name;
	private JTextField tname;
	private JLabel fathername;
	private JTextField tfathername;
	private JLabel mothername;
	private JTextField tmothername;
	private JLabel gender;
	private JRadioButton male;
	private JRadioButton female;
	private ButtonGroup gengp;
	private JLabel dob;
	private JComboBox date;
	private JComboBox month;
	private JComboBox year;
	private JLabel nationality;
	private JComboBox tnationality;
	private JLabel religion;
	private JComboBox treligion;
	private JLabel add;
	private JTextArea tadd;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	private String programs[]={"MCA","MTECH","BCOM","MA","MBA","PHD"};
	private String mediums[]={"ENGLISH","HINDI"};
	private String nationalities[]={"INDIAN","OTHER"};
	private String religions[]={"HINDU","MUSLIM","SIKH","CHRISTIAN","JAIN"};
	private String dates[]
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
			"11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20",
			"21", "22", "23", "24", "25",
			"26", "27", "28", "29", "30",
			"31" };
	private String months[]
		= { "Jan", "feb", "Mar", "Apr",
			"May", "Jun", "July", "Aug",
			"Sup", "Oct", "Nov", "Dec" };
	private String years[]
		= { "1995", "1996", "1997", "1998",
			"1999", "2000", "2001", "2002",
			"2003", "2004", "2005", "2006",
			"2007", "2008", "2009", "2010",
			"2011", "2012", "2013", "2014",
			"2015", "2016", "2017", "2018",
			"2019" };

	// constructor, to initialize the components
	// with default values.
	public MyFrame()
	{
		setTitle("Registration Form");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
		title = new JLabel("Registration Form");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		title1 = new JLabel("College and Course Details");
		title1.setFont(new Font("Arial", Font.PLAIN, 30));
		title1.setSize(300, 30);
		title1.setLocation(300, 30);
		c.add(title1);
		district = new JLabel("District");
		district .setFont(new Font("Arial", Font.PLAIN, 20));
		district .setSize(100, 20);
		district .setLocation(100, 100);
		c.add(district );
		tdistrict  = new JTextField();
		tdistrict .setFont(new Font("Arial", Font.PLAIN, 15));
		tdistrict .setSize(190, 20);
		tdistrict .setLocation(200, 100);
		c.add(tdistrict );
		collegename = new JLabel("College Name");
		coleegename.setFont(new Font("Arial", Font.PLAIN, 20));
		collegename.setSize(100, 20);
		collegename.setLocation(100, 100);
		c.add(collegename);
		tcollegename = new JTextField();
		tcollegename.setFont(new Font("Arial", Font.PLAIN, 15));
		tcollegename.setSize(190, 20);
		tcollegename.setLocation(200, 100);
		c.add(tcollegename);

		programname = new JLabel("Program Name");
		programname.setFont(new Font("Arial", Font.PLAIN, 20));
		programname.setSize(100, 20);
		programname.setLocation(100, 100);
		c.add(programname);

		tprogramname = new JComboBox(programs);
		tprogramname.setFont(new Font("Arial", Font.PLAIN, 15));
		tprogramname.setSize(50, 20);
		tprogramname.setLocation(200, 250);
		c.add(tprogramname);

		medium = new JLabel("Medium");
		medium .setFont(new Font("Arial", Font.PLAIN, 20));
		medium .setSize(100, 20);
		medium .setLocation(100, 100);
		c.add(medium );

		tmedium= new JComboBox(mediums);
		tmedium .setFont(new Font("Arial", Font.PLAIN, 15));
		tmedium .setSize(50, 20);
		tmedium .setLocation(200, 250);
		c.add(tmedium );		
 
		title2 = new JLabel("Personal Details");
		title2.setFont(new Font("Arial", Font.PLAIN, 30));
		title2.setSize(300, 30);
		title2.setLocation(300, 30);
		c.add(title2);
		name = new JLabel("Student Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);
		
		fathername = new JLabel("Father Name");
		fathername.setFont(new Font("Arial", Font.PLAIN, 20));
		fathername.setSize(100, 20);
		fathername.setLocation(100, 100);
		c.add(fathername);

		tfathername = new JTextField();
		tfathername.setFont(new Font("Arial", Font.PLAIN, 15));
		tfathername.setSize(190, 20);
		tfathername.setLocation(200, 100);
		c.add(tfathername);
		
		mothername = new JLabel("mother Name");
		mothername.setFont(new Font("Arial", Font.PLAIN, 20));
		mothername.setSize(100, 20);
		mothername.setLocation(100, 100);
		c.add(fathername);

		tmothername = new JTextField();
		tmothername.setFont(new Font("Arial", Font.PLAIN, 15));
		tmothername.setSize(190, 20);
		tmothername.setLocation(200, 100);
		c.add(tmothername);

		gender = new JLabel("Gender");
		gender.setFont(new Font("Arial", Font.PLAIN, 20));
		gender.setSize(100, 20);
		gender.setLocation(100, 200);
		c.add(gender);

		male = new JRadioButton("Male");
		male.setFont(new Font("Arial", Font.PLAIN, 15));
		male.setSelected(true);
		male.setSize(75, 20);
		male.setLocation(200, 200);
		c.add(male);

		female = new JRadioButton("Female");
		female.setFont(new Font("Arial", Font.PLAIN, 15));
		female.setSelected(false);
		female.setSize(80, 20);
		female.setLocation(275, 200);
		c.add(female);

		gengp = new ButtonGroup();
		gengp.add(male);
		gengp.add(female);

		dob = new JLabel("DOB");
		dob.setFont(new Font("Arial", Font.PLAIN, 20));
		dob.setSize(100, 20);
		dob.setLocation(100, 250);
		c.add(dob);

		date = new JComboBox(dates);
		date.setFont(new Font("Arial", Font.PLAIN, 15));
		date.setSize(50, 20);
		date.setLocation(200, 250);
		c.add(date);

		month = new JComboBox(months);
		month.setFont(new Font("Arial", Font.PLAIN, 15));
		month.setSize(60, 20);
		month.setLocation(250, 250);
		c.add(month);

		year = new JComboBox(years);
		year.setFont(new Font("Arial", Font.PLAIN, 15));
		year.setSize(60, 20);
		year.setLocation(320, 250);
		c.add(year);

		nationality= new JLabel("Nationality");
		nationality .setFont(new Font("Arial", Font.PLAIN, 20));
		nationality .setSize(100, 20);
		nationality.setLocation(100, 100);
		c.add(nationality);

		tnationality= new JComboBox(nationalities);
		tnationality .setFont(new Font("Arial", Font.PLAIN, 15));
		tnationality.setSize(50, 20);
		tnationality .setLocation(200, 250);
		c.add(tnationality);
		
		religion= new JLabel("Religion");
		religion .setFont(new Font("Arial", Font.PLAIN, 20));
		religion .setSize(100, 20);
		religion.setLocation(100, 100);
		c.add(religion);

		treligion= new JComboBox(religions);
		treligion .setFont(new Font("Arial", Font.PLAIN, 15));
		treligion.setSize(50, 20);
		treligion .setLocation(200, 250);
		c.add(treligion);
		
		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		c.add(term);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	// method actionPerformed()
	// to get the action performed
	// by the user and act accordingly
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data1;
				String data
					= "Name : "
					+ tname.getText() + "\n"
					+ "Mobile : "
					+ tmno.getText() + "\n";
				if (male.isSelected())
					data1 = "Gender : Male"
							+ "\n";
				else
					data1 = "Gender : Female"
							+ "\n";
				String data2
					= "DOB : "
					+ (String)date.getSelectedItem()
					+ "/" + (String)month.getSelectedItem()
					+ "/" + (String)year.getSelectedItem()
					+ "\n";

				String data3 = "Address : " + tadd.getText();
				tout.setText(data + data1 + data2 + data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			tadd.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			date.setSelectedIndex(0);
			month.setSelectedIndex(0);
			year.setSelectedIndex(0);
			resadd.setText(def);
		}
	}
}
class Registration {
public static void main(String[] args) throws Exception
{
MyFrame f = new MyFrame();
}
}


