package loanassistant;
import java.awt.desktop.*;
import java.net.URI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
public class LoanAssistant {
	Label Lloanbal, Lirate, Lnopay,Lmonpay,Lloanana;               
	JTextField Tbal,Tirate,Tnopay,Tmonthpay;
	boolean bComMonPay=true;
	JButton BComMonPay,BnewLoanA,Bexit,Bpayment,Bmonthly;
	JRadioButton JNo_of_payment,JMonthly_Payment;
	JTextArea Add_textArea;
	public LoanAssistant()
    {
    	JFrame f=new JFrame("Loan Assistant");
    	
    	Lloanbal=new Label("Loan Balance :");
    	Lloanbal.setBounds(30, 50, 100,25);
    	Lirate =new Label("Interest Rate :");
    	Lirate.setBounds(30, 90, 100,25);
    	Lnopay =new Label("Number of Payments :");
    	Lnopay.setBounds(30,130,130,25);
    	Lmonpay =new Label("Monthly Payments :");
    	Lmonpay.setBounds(30,170,130,25);
    	Lloanana=new Label("Loan Analysis :");
    	Lloanana.setBounds(400,30,100,25);
    	
    	Tbal =new JTextField();
    	Tbal.setBounds(200, 50, 100, 25);
    	Tirate =new JTextField();
    	Tirate.setBounds(200, 90, 100, 25);
    	Tnopay =new JTextField();
    	Tnopay.setBounds(200, 130, 100, 25);
    	Tmonthpay =new JTextField();
    	Tmonthpay.setBounds(200, 170, 100, 25);
	
    	BComMonPay = new JButton("Compute Monthly Payment");
    	BComMonPay.setBounds(90, 210, 230, 27);
    		
    	BnewLoanA = new JButton("New Loan Analysis");
    	BnewLoanA.setBounds(100, 250, 200, 27);
    	BnewLoanA.setEnabled(false);
    	
    	Bpayment = new JButton("X");
    	Bpayment.setBounds(320, 130, 50, 25);
    	
    	Bmonthly = new JButton("X");
    	Bmonthly.setBounds(320, 170, 50, 25);
    	
    	Bexit = new JButton("Exit");
    	Bexit.setBounds(500,250,60,27);
    	
    	
    	Add_textArea=new JTextArea();
    	Add_textArea.setBounds(400,60,250,150);
    	Add_textArea.setEditable(false);
    	Add_textArea.setBorder(BorderFactory.createLineBorder(Color.black));
    	
    	
    	new Cursor(Cursor.HAND_CURSOR);
    	
    	f.add(Lloanbal);
    	f.add(Lirate);
    	f.add(Lnopay);
    	f.add(Lloanana);
    	f.add(Tbal);
    	Tbal.addActionListener(new tbal());
    	Tbal.setHorizontalAlignment(SwingConstants.RIGHT);
    	
    	f.add(Tirate);
    	Tirate.addActionListener(new tirate());
    	Tirate.setHorizontalAlignment(SwingConstants.RIGHT);
    	
    	f.add(Tnopay);
    	Tnopay.addActionListener(new tnopay());
    	Tnopay.setHorizontalAlignment(SwingConstants.RIGHT);
    	
    	f.add(Tmonthpay);
    	Tmonthpay.addActionListener(new tmonthpay());
    	Tmonthpay.setHorizontalAlignment(SwingConstants.RIGHT);
    	
    	f.add(Add_textArea);
    	f.add(Lmonpay);
    	
    	f.add(BComMonPay);
    	BComMonPay.addActionListener(new bmon());
    	    	
    	f.add(Bmonthly);
    	Bmonthly.addActionListener(new bmth());
    	
    	f.add(Bpayment);
    	Bpayment.addActionListener(new bpay());
    	
    	f.add(BnewLoanA);
    	BnewLoanA.addActionListener(new bnew());
    	
    	f.add(Bexit);
    	Bexit.addActionListener(new bext());
    	
    	f.setSize(700,350);
    	f.setLayout(null);
    	f.setVisible(true);	    	
    	
    }
	
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Desktop d=Desktop.getDesktop();
		d.browse(new URI("http://LoanAssistant_megha.com"));
		
		new LoanAssistant();
	}
	




public class tbal implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
		  
	       TbalActionPerformed(e);  
     }  

}
private void TbalActionPerformed(ActionEvent e)
{
	Tbal.transferFocus();
}

public class tirate implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       TirateActionPerformed(e);  
     }  

}
private void TirateActionPerformed(ActionEvent e)
{
	Tirate.transferFocus();
}

public class tnopay implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       TnopayActionPerformed(e);  
     }  

}
private void TnopayActionPerformed(ActionEvent e)
{
	Tnopay.transferFocus();
}

public class tmonthpay implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       TmonthpayActionPerformed(e);  
     }  

}
private void TmonthpayActionPerformed(ActionEvent e)
{
	Tmonthpay.transferFocus();
}

//compute monthly payment
public class bmon implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       BComMonPayActionPerformed(e);  
     }  

}
public class deciNum
{
 private boolean validateDecimalNumber(JTextField tf)
 {
	//checks to see if text field contains valid decimal no. with only digits and a single decimal point
	String s =tf.getText().trim();
	boolean hasDecimal=false;
	boolean valid = true;
	if(s.length()==0)
	{
		valid=false;
	}
	else
	{
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c>='0'&& c<='9')
			{
				continue;
			}
			
			else if(c=='.'&& !hasDecimal)
			{
				hasDecimal=true;
			}
			else
			{
				//invalid character found
				valid=false;
			}
		}
	}
	tf.setText(s);
	if(!valid)
	{
		tf.requestFocus();
	}
	return (valid);
  }
}
private void BComMonPayActionPerformed(ActionEvent e)
    {
		double balance, interest, payment,monthlyInterest, multiplier,loanBalance, finalPayment;
		int months;
 		
 		deciNum d=new deciNum();
        if(d.validateDecimalNumber(Tbal))
 		{         	
 			balance =Double.valueOf(Tbal.getText()).doubleValue();    			
 		}
 		else
 		{
 			JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.","Balance Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
 			return;
 		}
 		if(d.validateDecimalNumber(Tirate))
 		{
 			interest = Double.valueOf(Tirate.getText()).doubleValue();
 		}
 		else
 		{
 			JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.","Interest Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
 			return; 
 		}
		monthlyInterest = (interest/12)/100 ;
		
		if (bComMonPay)
		{
			// Compute number of payments
			if(d.validateDecimalNumber(Tmonthpay))
			{
				 payment =Double.valueOf(Tmonthpay.getText()).doubleValue();
			     if(payment<=(balance*monthlyInterest+1.0))	
                 {
                	if(JOptionPane.showConfirmDialog(null, "Minimun payment must be $"+new DecimalFormat("0.00").format((int)(balance*monthlyInterest+(1.0)))+"\n"+"Do you want to use the minimum payment?","Input Error",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==(JOptionPane.YES_OPTION))
                	{
                		        Tmonthpay.setText(new DecimalFormat("0.00").format((int)(balance*monthlyInterest+1.0)));
                		        payment=Double.valueOf(Tmonthpay.getText()).doubleValue();
                	}
                 
                	else
                	{
                			Tmonthpay.requestFocus();
                			return;
                	}
                 }
			}	
			else
			{
				JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.","Payment Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if(interest==0)
			{
				months=(int)(balance/payment);
			}
			else
			{
				months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest))/ Math.log(1 + monthlyInterest));
			}
			Tnopay.setText(String.valueOf(months));
			
		
		}
		else 
		{		
				// Compute monthly payment
			if(d.validateDecimalNumber(Tnopay))
			{
				months = Integer.valueOf(Tnopay.getText()).intValue();
			}
			else
			{ 
				JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.","Number of Payments Input Error",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			
			if(interest==0)
			{
				payment= balance / months;
			}					
			else
			{
				multiplier = Math.pow(1 + monthlyInterest, months);         //(1+r)^n
				
				payment = balance * (monthlyInterest) * multiplier / (multiplier - 1);  //A = P.r.(1+r)^n / ((1+r)^n)-1
			}
     			Tmonthpay.setText(new DecimalFormat("0.00").format(payment)); 
        }
		
     	   //reset payment prior to analysis to fix at two decimals
		payment= Double.valueOf(Tmonthpay.getText()).doubleValue();
		
		//show analysis
		Add_textArea.setText(" Loan Balance:   $"+new DecimalFormat("0.00").format(balance));
		Add_textArea.append("\n"+" Interest Rate:  "+new DecimalFormat("0.00").format(interest)+"%");
		
		//process all but last payment
		loanBalance = balance;
	
		for(int paymentNumber=1; paymentNumber<= months - 1; paymentNumber++)
		{
			loanBalance +=loanBalance*monthlyInterest-payment;
		}
	
		//find final payment
		finalPayment = loanBalance;
	
		if(finalPayment>payment)
		{
			//apply one more payment
			loanBalance +=loanBalance*monthlyInterest-payment;
            if(loanBalance<0)
            {
            	finalPayment=payment-loanBalance;
            }
			
		
			months++;
			Tnopay.setText(String.valueOf(months));
	
			   
		}
		Add_textArea.append("\n\n "+String.valueOf(months)+" Payments of:   $"+new DecimalFormat("0.00").format(payment));
		Add_textArea.append("\n"+" Final Payment of:   $"+new DecimalFormat("0.00").format(finalPayment));
		Add_textArea.append("\n"+" Total Payments:   $"+new DecimalFormat("0.00").format((months)* payment));
		Add_textArea.append("\n"+" Interest Paid:   $"+ new DecimalFormat("0.00").format((months)*payment - balance));
        BComMonPay.setEnabled(false);
        BnewLoanA.setEnabled(true);
        BnewLoanA.requestFocus();
    }

//new loan analysis

public class bnew implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       BnewLoanAActionPerformed(e);  
     }

}
private void BnewLoanAActionPerformed(ActionEvent e)
    {
	     //clear computed value and analysis
	    if (BComMonPay.isSelected()==true)
	    {
	    	Tnopay.setText("");
	    }
	    else
	    {
	    	Tmonthpay.setText("");
	    }
	    Add_textArea.setText("");
	    BComMonPay.setEnabled(true);
	    BnewLoanA.setEnabled(false);
	    Tbal.requestFocus();
    }

//exit 
public class bext implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       BextActionPerformed(e);  
     }

}
private void BextActionPerformed(ActionEvent e)
    {
	    System.exit(0);
    }

//payment button X
public class bpay implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       BpActionPerformed(e);  
     }

}
private void BpActionPerformed(ActionEvent e)
    {
	     //will compute payment
	     bComMonPay = true;
	     Add_textArea.setEditable(false);
	     Bpayment.setVisible(false);
	     Bmonthly.setVisible(true);
	     Tmonthpay.setEditable(true);
	     Tmonthpay.setBackground(Color.WHITE);
	     Tmonthpay.setFocusable(true);
	     Tnopay.setText("");
	     Tnopay.setEditable(false);
	     Tnopay.setBackground(Color.yellow);
	     Tnopay.setFocusable(false);
	     Tbal.requestFocus();
         BComMonPay.setText("Compute Number of Payments");
        
	     
    }

//monthly button x
public class bmth implements ActionListener
{
	public void actionPerformed(ActionEvent e)
     {
	       BmActionPerformed(e);  
     }

}
private void BmActionPerformed(ActionEvent e)
    {
	    bComMonPay = false;
	    Add_textArea.setEditable(false);
		Bpayment.setVisible(true);
		Bmonthly.setVisible(false);
		Tmonthpay.setEditable(false);
		Tmonthpay.setBackground(Color.yellow);
		Tnopay.setText("");
		Tnopay.setEditable(true);
		Tmonthpay.setText("");
		Tnopay.setEditable(true);
		Tnopay.setBackground(Color.WHITE);
		Tbal.requestFocus();
		Tmonthpay.setFocusable(false);
		Tnopay.setFocusable(true);	
		BComMonPay.setText("Compute Monthly Payment");
    }
}

	


