
package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener{
    
JTextField pan,aadhar;
JButton next;
JRadioButton eno,eyes,sno,syes;
JComboBox religion,category,occupation,education,income;
String formno;

   Signuptwo(String formno){
       this.formno = formno;       
       setLayout(null);
       
       setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
                
     JLabel additionalDetails = new JLabel("Page 2: Additional Details");
     additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
     additionalDetails.setBounds(290,80,400,30);
     add(additionalDetails);
     
     JLabel religionlabel = new JLabel("Religion");
     religionlabel.setFont(new Font("Raleway",Font.BOLD,20));
     religionlabel.setBounds(100,140,100,30);
     add(religionlabel);
     
     String valReligion[] = {"Sanatan","Muslim","Sikh","Christian", "Other"};
      religion = new JComboBox(valReligion);
     religion.setBounds(300,140,400,30);
     religion.setBackground(Color.WHITE);
     add(religion);
     
     
     JLabel categorylabel = new JLabel("Category:");
     categorylabel.setFont(new Font("Raleway",Font.BOLD,20));
     categorylabel.setBounds(100,190,200,30);
     add(categorylabel);
     
     String valCategory[] = {"General","OBC","SC","ST", "Other"};
      category = new JComboBox(valCategory);
     category.setBounds(300,190,400,30);
     category.setBackground(Color.WHITE);
     add(category);
     
     JLabel incomelabel = new JLabel("Income");
     incomelabel.setFont(new Font("Raleway",Font.BOLD,20));
     incomelabel.setBounds(100,240,200,30);
     add(incomelabel);
     
     String incomeCategory[] = {"Null","< 1,50,000","<2,50,000","<5,00,000", "Upto 10,00,000"};
      income = new JComboBox(incomeCategory);
     income.setBounds(300,240,400,30);
     income.setBackground(Color.WHITE);
     add(income);
     
     
      JLabel educationlabel = new JLabel("Educational:");
     educationlabel.setFont(new Font("Raleway",Font.BOLD,20));
     educationlabel.setBounds(100,290,200,30);
     add(educationlabel);
     
      JLabel qualificationlabel = new JLabel("Qualification:");
     qualificationlabel.setFont(new Font("Raleway",Font.BOLD,20));
     qualificationlabel.setBounds(100,315,200,30);
     add(qualificationlabel);
     
     String educationValue[] = {"Non-Graduation","Graduation","Post-Graduation","Doctrate", "Others"};
     education = new JComboBox(educationValue);
     education.setBounds(300,315,400,30);
     education.setBackground(Color.WHITE);
     add(education);
     
      JLabel occupationlabel = new JLabel("Occupation:");
     occupationlabel.setFont(new Font("Raleway",Font.BOLD,20));
     occupationlabel.setBounds(100,390,200,30);
     add(occupationlabel);
     
     
     String occupationValue[] = {"Salaried","Self-Employed","Buisnessman","Student", "Others"};
     occupation = new JComboBox(occupationValue);
     occupation.setBounds(300,390,400,30);
     occupation.setBackground(Color.WHITE);
     add(occupation);
     
      JLabel panno = new JLabel("PAN No.:");
     panno.setFont(new Font("Raleway",Font.BOLD,20));
     panno.setBounds(100,440,200,30);
     add(panno);
    
      pan = new JTextField();
     pan.setFont(new Font("Raleway",Font.BOLD,14));
     pan.setBounds(300,440,400,30);
     add(pan);
     
      JLabel aadharno = new JLabel("Aadhar Number:");
     aadharno.setFont(new Font("Raleway",Font.BOLD,20));
     aadharno.setBounds(100,490,200,30);
     add(aadharno);
     
      aadhar = new JTextField();
     aadhar.setFont(new Font("Raleway",Font.BOLD,14));
     aadhar.setBounds(300,490,400,30);
     add(aadhar);
     
      JLabel senior = new JLabel("Senior Citizen:");
     senior.setFont(new Font("Raleway",Font.BOLD,20));
     senior.setBounds(100,540,200,30);
     add(senior);
    
     
      syes = new JRadioButton("YES");
     syes.setBounds(300,540,100,30);
     syes.setBackground(Color.WHITE);
     add(syes);
     
      sno = new JRadioButton("NO");
     sno.setBounds(450,540,100,30);
     sno.setBackground(Color.WHITE);
     add(sno);
     
     ButtonGroup seniorgroup = new ButtonGroup();
     seniorgroup.add(syes);
     seniorgroup.add(sno);
     
     
     JLabel exisitng = new JLabel("Existing Account");
     exisitng.setFont(new Font("Raleway",Font.BOLD,20));
     exisitng.setBounds(100,590,200,30);
     add(exisitng);
     
     
      eyes = new JRadioButton("YES");
     eyes.setBounds(300,590,100,30);
     eyes.setBackground(Color.WHITE);
     add(eyes);
      
      eno = new JRadioButton("NO");
     eno.setBounds(450,590,100,30);
     eno.setBackground(Color.WHITE);
     add(eno);
     
     ButtonGroup existinggroup = new ButtonGroup();
     existinggroup.add(eyes);
     existinggroup.add(eno);
     
     
     next = new JButton("Next");
     next.setBackground(Color.BLACK);
     next.setForeground(Color.WHITE);
     next.setFont(new Font("Raleway",Font.BOLD,14));
     next.setBounds(620,660,80,30);
     next.addActionListener(this);
     add(next);
             
       getContentPane().setBackground(Color.white);
      
       setSize(850,800);
       setLocation(350,10);
       setVisible(true);
       
   }
    public void actionPerformed(ActionEvent ae){
        String sreligion = (String) religion.getSelectedItem();
        String scategory  = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
//        String sincome = (String) income.getSelectedItem();
        String exisitng = null;
        if(eyes.isSelected())
        {
            exisitng = "yes";
        }
        else if(eno.isSelected())
        {
            exisitng = "no";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        String senior =null;
        if(syes.isSelected())
        {
            senior = "yes";
        }
        else if(sno.isSelected())
        {
            senior= "no";
        }
        
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+senior+"','"+exisitng+"')";
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);
                 
        }catch(Exception e){
            System.out.println(e);
        }
    }
   
    public static void main(String args[]) {
        new Signuptwo(" ");
    }
}
