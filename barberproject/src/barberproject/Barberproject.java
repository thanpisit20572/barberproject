package barberproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;




public class Barberproject extends JFrame{
    
    

    public static void main(String[] args) {
       //Frame1
        JFrame frame = new JFrame("BARBER SHOP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
           
        JLabel lb1 = new JLabel("- Barber shop -");
        lb1.setFont(new Font("Serif", Font.BOLD, 30));
        lb1.setBounds(20, 30, 300, 30);
        frame.add(lb1);
        
        JButton memberbutton = new JButton("Member");  
                memberbutton.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
             member m = new member();
             m.setVisible(true);
               
        }
           
        }
            );
        memberbutton.setBounds(20,100,150,50);  
        frame.add(memberbutton);
        Color green = new Color(120,165,87);
        memberbutton.setBackground(green);
        
        
        JButton costbutton = new JButton("Cost");  
                costbutton.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
             int [] allcost = new int[6];
             int [] allallcost = new int [1];
        
       //Frame1
        JFrame frame = new JFrame("COST");
        frame.setSize(400, 400);
        frame.setVisible(true);
           
        JLabel lb1 = new JLabel("COST = ");
        lb1.setFont(new Font("Serif", Font.BOLD, 30));
        lb1.setBounds(20, 30, 300, 30);
        frame.add(lb1);
        
        
        JLabel tellabel = new JLabel();
        tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
        tellabel.setFont(new Font("Serif", Font.BOLD, 30));
        tellabel.setBounds(150, 30, 300, 30);
        frame.add(tellabel);
   
        
        JButton hairset = new JButton("Hairset");  
                hairset.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
              
               allcost[0] = 350;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
               
        }
           
        }
            );
        hairset.setBounds(20,100,150,50);  
        frame.add(hairset);
        
        
        JButton cut = new JButton("Cut");  
                cut.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               allcost[0] = 500;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
        }
           
        }
            );
        cut.setBounds(200,100,150,50);  
        frame.add(cut);
        
        
        
        
        JButton fashioncolor = new JButton("Fashion Color");  
         fashioncolor.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               allcost[0] = 5500;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
        }
           
        }
            );
        fashioncolor.setBounds(20,170,150,50);  
        frame.add(fashioncolor);
        
        
        
        //FrameBarber
        JButton perm = new JButton("Perm"); 
        perm.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               allcost[0] = 6500;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
          }
        }
            );
        perm.setBounds(200,170,150,50);  
        frame.add(perm);
        
        
        JButton Straightening = new JButton("Straightening"); 
        Straightening.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               allcost[0] = 6500;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
          }
        }
            );
        Straightening.setBounds(20,240,150,50);  
        frame.add(Straightening);
        
        
        JButton treatment = new JButton("Treatment"); 
        treatment.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               allcost[0] = 3500;
               int sss = 0;
               for (int i = 0; i<=5;i++){
               sss = sss + allcost[i];
               }
               allallcost[0] = allallcost[0] + sss;
               System.out.println(allallcost[0]);
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
          }
        }
            );
        treatment.setBounds(200,240,150,50);  
        frame.add(treatment);
        
        
        JPanel panel = new JPanel();
        JButton clear = new JButton("Clear"); 
        clear.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               for (int i = 0; i<=5;i++){
                   allcost[i] = 0;
               }
               allallcost[0] = 0;
               tellabel.setText(String.valueOf(allallcost[0] + "  Bath"));
          }
        }
            );
        panel.add(clear);
        
        JTextArea ta = new JTextArea();
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        
               
        }
           
        }
            );
        costbutton.setBounds(200,100,150,50);  
        frame.add(costbutton);
        Color red = new Color(161,71,44);
        costbutton.setBackground(red);
        
        
        
        JButton bookingbutton = new JButton("Booking");  
         bookingbutton.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
             booking b = new booking();
             b.setVisible(true);
               
        }
           
        }
            );
        bookingbutton.setBounds(20,170,150,50);  
        frame.add(bookingbutton);
        Color blue = new Color(63,182,216);
        bookingbutton.setBackground(blue);
        
        
        
        //FrameBarber
        JButton barberbutton = new JButton("Barber"); 
        barberbutton.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
               JFrame frame2 = new JFrame("BARBER2");
               frame2.setSize(400, 400);
               frame2.setVisible(true);
               frame2.setLayout(null);
               
               ImageIcon image1 = new ImageIcon(getClass().getResource("naruto.jpg"));
               JLabel label1 = new JLabel(image1);
               label1.setBounds(30, 80, 100, 100);
               frame2.add(label1);
               
               ImageIcon nn = new ImageIcon(getClass().getResource("buzz.jpg"));
               JLabel label11 = new JLabel(nn);
               frame2.add(label11);
               
               ImageIcon nnn = new ImageIcon(getClass().getResource("greenman.png"));
               JLabel label111 = new JLabel(nnn);
               frame2.add(label111);
               
               JLabel infobarber1 = new JLabel("Name: Uzumaki");
               JLabel infobarber11 = new JLabel("Surname: Naruto");
               JLabel infobarber111 = new JLabel("Age: 25 Sex: Men");
               infobarber1.setFont(new Font("Serif", Font.BOLD, 20));
               infobarber11.setFont(new Font("Serif", Font.BOLD, 20));
               infobarber111.setFont(new Font("Serif", Font.BOLD, 20));
               infobarber1.setBounds(150, 70, 300, 30);
               infobarber11.setBounds(150, 110, 300, 30);
               infobarber111.setBounds(150, 150, 300, 30);
               frame2.add(infobarber1);
               frame2.add(infobarber11);
               frame2.add(infobarber111);               
               
               JButton bar1 = new JButton("1 Barber");
               bar1.setBounds(0,0,133,40);  
               Color blue = new Color(63,182,216);
               bar1.setBackground(blue);
               bar1.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
              
              label1.setBounds(30, 80, 100, 100);
              label11.setBounds(3000, 8000, 100, 100);
              label111.setBounds(3000, 8000, 100, 100);
              frame2.add(label1);
              infobarber1.setText("Name: Uzumaki");
              infobarber11.setText("SurName: Naruto");
              infobarber111.setText("Age: 17 Sex: Men");
          }
        }
            );
               frame2.add(bar1);
               JButton bar2 = new JButton("2 Barber");
               bar2.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
              
              label1.setBounds(3000, 8000, 100, 100);
              label11.setBounds(30, 80, 100, 100);
              label111.setBounds(3000, 8000, 100, 100);
              infobarber1.setText("Name: Buzz");
              infobarber11.setText("SurName: Lightyear");
              infobarber111.setText("Age: 70 Sex: Men");
              
          }
        }
            );
               bar2.setBounds(133,0,133,40);  
               frame2.add(bar2);
               Color red = new Color(144,37,32);
               bar2.setBackground(red);
               JButton bar3 = new JButton("3 Barber");
               bar3.addActionListener ( new ActionListener ( )
        {
          @Override
          public void actionPerformed ( ActionEvent event )
          {
              label1.setBounds(3000, 8000, 100, 100);
              label11.setBounds(3000, 8000, 100, 100);
              label111.setBounds(30, 80, 100, 100);
              infobarber1.setText("Name: Green");
              infobarber11.setText("SurName: Man");
              infobarber111.setText("Age: 26 Sex: Men");
          }
        }
            );

               bar3.setBounds(266,0,133,40);  
               frame2.add(bar3);
               Color green = new Color(54,123,23);
               bar3.setBackground(green);
               
               
          }
        }
            );
        barberbutton.setBounds(200,170,150,50);  
        frame.add(barberbutton);
        Color yellow = new Color(192,204,42);
        barberbutton.setBackground(yellow);
        
        
        
        
        
        JPanel panel = new JPanel();
        JLabel tellabel = new JLabel("Tel 088-200-6353");
        tellabel.setFont(new Font("Serif", Font.BOLD, 30));
        panel.add(tellabel);
        
        JTextArea ta = new JTextArea();
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
        
    }
    
        
    
}

class member extends JFrame {

	int line = 0;
	private JTextField txtName;
	private JTextField txtEmail;
	private DefaultTableModel model;
	
	public member() {
		setBounds(100, 100, 490, 240);
		setTitle("Member");
		getContentPane().setLayout(null);
		
		// ScrollPane for Table
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 41, 370, 90);
		getContentPane().add(scrollPane);
		
		// Table
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblAdd = new JLabel("Add :");
		lblAdd.setBounds(48, 142, 46, 14);
		getContentPane().add(lblAdd);
		
		// Name
		txtName = new JTextField();
		txtName.setToolTipText("Name");
		txtName.setBounds(84, 142, 86, 20);
		getContentPane().add(txtName);
		
		// Email
		txtEmail = new JTextField();
		txtEmail.setToolTipText("Tell");
		txtEmail.setBounds(180, 142, 161, 20);
		getContentPane().add(txtEmail);
		
				
		// Model for Table
		model = (DefaultTableModel)table.getModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Tell");
		
		// Rows 1
		model.addRow(new Object[0]);
		model.setValueAt(line + 1, line, 0);
		model.setValueAt("Somchai", line, 1);
		model.setValueAt("0888888888", line, 2);
		line = line + 1;
		
		// Save
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// New Rows
				model.addRow(new Object[0]);
				model.setValueAt(line + 1, line, 0);
				model.setValueAt(txtName.getText(), line, 1);
				model.setValueAt(txtEmail.getText(), line, 2);
				line = line + 1;
				
				// Reset Text Field
				txtName.setText("");
				txtEmail.setText("");
			}
		});
		btnSave.setBounds(351, 142, 67, 23);
		getContentPane().add(btnSave);
		
	}
}


class booking extends JFrame
{
  private JPanel topPanel;
  private JTable table;
  private JScrollPane scrollPane;
  private String[] columns = new String[3];
  private String[][] data = new String[3][3];
  JButton button = new JButton();

  public booking()
  {
    setTitle("JButton in JTable");
    setSize(500,500);
    topPanel = new JPanel();
    topPanel.setLayout(new BorderLayout());
    getContentPane().add(topPanel);
    columns = new String[] {"Time", "Name", "Action"};

    data = new String[][]{
      {"9.00"," "},
      {"11.00"," "},
      {"13.00"," "},
      {"15.00"," "},
      {"17.00"," "}
    };

    DefaultTableModel model = new DefaultTableModel(data,columns);
    table = new JTable();
    table.setModel(model);
    table.getColumn("Action").setCellRenderer(new ButtonRenderer());
    table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox()));
    scrollPane = new JScrollPane(table);
    topPanel.add(scrollPane,BorderLayout.CENTER);  
    
    button.addActionListener(
      new ActionListener()
      {
        public void actionPerformed(ActionEvent event)
        {
          JOptionPane.showMessageDialog(null,"Do you want to edit this line?");
        }
      }
    );
  }

  class ButtonRenderer extends JButton implements TableCellRenderer 
  {
    public ButtonRenderer() {
      setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
    boolean isSelected, boolean hasFocus, int row, int column) {
      setText((value == null) ? "Edit" : value.toString());
      return this;
    }
  }

  class ButtonEditor extends DefaultCellEditor 
  {
    private String label;
    
    public ButtonEditor(JCheckBox checkBox)
    {
      super(checkBox);
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
    boolean isSelected, int row, int column) 
    {
      label = (value == null) ? "Modify" : value.toString();
      button.setText(label);
      return button;
    }

    public Object getCellEditorValue() 
    {
      return new String(label);
    }
  }

  public static void main(String args[])
  {
    booking f = new booking();
    f.setVisible(true);
  }
}
