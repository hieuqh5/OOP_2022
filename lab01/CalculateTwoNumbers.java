package lab01;

import javax.swing.JOptionPane;


public class CalculateTwoNumbers {
   public static void main(String[] args) {
	   String strNum1, strNum2;
	   String strNotification = "You've just entered: ";
		  
	   strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
	   strNotification += strNum1 + " and ";
		  
	   strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
	   strNotification += strNum2;
	   JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
	   
	   double num1 = Double.parseDouble(strNum1);
	   double num2 = Double.parseDouble(strNum2);
	   double sum = num1 + num2;
	   double difference = Math.abs(num1 - num2);
       double product = num1*num2;
       double quotient;
       if(num1 > num2) {
    	   quotient = num1 / num2;
       }
       else quotient = num2 / num1;
       String option;
       while(true) {
          option = JOptionPane.showInputDialog(null, "Select between 4 options: \n1. Calculate sum. \n2. Calculate difference. "
       		+ "\n3. Calculate product. \n4. Calculate quotient \n0. Exit ", "Calculate between 2 numbers " , JOptionPane.INFORMATION_MESSAGE);
          int x = Integer.parseInt(option);
          switch(x) {
             case 1:
        	    JOptionPane.showMessageDialog(null, sum, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        	    break;
             case 2:
        	    JOptionPane.showMessageDialog(null, difference, "Difference between two numbers", JOptionPane.INFORMATION_MESSAGE);
        	    break;
             case 3:
        	    JOptionPane.showMessageDialog(null, product, "Product of two numbers", JOptionPane.INFORMATION_MESSAGE);
        	    break;
             case 4:
        	    JOptionPane.showMessageDialog(null, quotient, "Quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
        	    break;
             case 0:
        	    System.exit(0);
        	    break;
           }
       }
   }
}
