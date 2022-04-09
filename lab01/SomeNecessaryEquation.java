package lab01;

import javax.swing.JOptionPane;

public class SomeNecessaryEquation {
   public static void main(String[] args) {
	   String opt = JOptionPane.showInputDialog(null, "Please select the problem you want to solve: \n1. First-degree equation. \n2. System of first-degree equation. \n3. Second-degree equation with one variable. \n0. Exit. ", "Problems", JOptionPane.INFORMATION_MESSAGE);
	   
	   int o = Integer.parseInt(opt);
	   switch(o) {
	     case 1:
	       String strNum1, strNum2;
		  
	       strNum1 = JOptionPane.showInputDialog(null, "Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
		   strNum2 = JOptionPane.showInputDialog(null, "Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
		  
	       double a = Double.parseDouble(strNum1);
	       double b = Double.parseDouble(strNum2);
	       
	       if(a == 0) {
		      JOptionPane.showMessageDialog(null, "There are infinite roots of equation! ");
	       }
	       double x = -b/a;
	       if(a != 0) {
		      JOptionPane.showMessageDialog(null, x, "Root of equation", JOptionPane.INFORMATION_MESSAGE);;
	       }
	       break;
	     case 2:
	       String aone1, aone2, atwo1, atwo2, bone, btwo;
	       aone1 = JOptionPane.showInputDialog(null, "Please input a11: ", "Input a11", JOptionPane.INFORMATION_MESSAGE);
	       aone2 = JOptionPane.showInputDialog(null, "Please input a12: ", "Input a12", JOptionPane.INFORMATION_MESSAGE);
	       atwo1 = JOptionPane.showInputDialog(null, "Please input a21: ", "Input a21", JOptionPane.INFORMATION_MESSAGE);
	       atwo2 = JOptionPane.showInputDialog(null, "Please input a22: ", "Input a22", JOptionPane.INFORMATION_MESSAGE);
	       bone = JOptionPane.showInputDialog(null, "Please input b1: ", "Input b1", JOptionPane.INFORMATION_MESSAGE);
	       btwo = JOptionPane.showInputDialog(null, "Please input b2: ", "Input b2", JOptionPane.INFORMATION_MESSAGE);
           
	       double a11 = Double.parseDouble(aone1);
	       double a12 = Double.parseDouble(aone2);
	       double a21 = Double.parseDouble(atwo1);
	       double a22 = Double.parseDouble(atwo2); 
	       double b1 = Double.parseDouble(bone);
	       double b2 = Double.parseDouble(btwo);
	       
	       double D = a11*a22 - a21*a12;
	       double D1 = b1*a22 - b2*a12;
	       double D2 = a11*b2 - a21*b1;
	       
	       if(D != 0) {
	    	   double x1 = D1/D;
	    	   double x2 = D2/D;
	    	   JOptionPane.showMessageDialog(null, "The system has unique solution \nx1: " + x1 + "\nx2: " + x2 , "The solution", JOptionPane.INFORMATION_MESSAGE);
	    	   
	       }
	       else if(D == 0 && D == D1 && D == D2) {
	    	   JOptionPane.showMessageDialog(null, "The system has infinite soulutions", "The solution", JOptionPane.INFORMATION_MESSAGE);
	       }
	       else {
	    	   JOptionPane.showMessageDialog(null, "The system has no solution", "The solution", JOptionPane.INFORMATION_MESSAGE);
	       }
	       break;
	     case 3:
	       String A, B, C;
	       
	       A = JOptionPane.showInputDialog(null, "Please input a: ", "Input a", JOptionPane.INFORMATION_MESSAGE);
	       B = JOptionPane.showInputDialog(null, "Please input b: ", "Input b", JOptionPane.INFORMATION_MESSAGE);
	       C = JOptionPane.showInputDialog(null, "Please input c: ", "Input c", JOptionPane.INFORMATION_MESSAGE);
	       
	       double i = Double.parseDouble(A); 
	       double j = Double.parseDouble(B);
	       double k = Double.parseDouble(C);
	       
	       double delta = j*j - 4*i*k;
	       
	       if(delta > 0) {
	    	   double s = Math.sqrt(delta);
	    	   double X1 = (-j + s)/(2*i);
	    	   double X2 = (-j - s)/(2*i);
	    	   JOptionPane.showMessageDialog(null, "The system has solutions \nx1: " + X1 + "\nx2: " + X2 , "The solution", JOptionPane.INFORMATION_MESSAGE);
	       }
	       else if(delta == 0) {
	    	   double X = -j/2*i;
	    	   JOptionPane.showMessageDialog(null, "The system has solutions: " + X , "The solution", JOptionPane.INFORMATION_MESSAGE);
	       }
	       else {
	    	   JOptionPane.showMessageDialog(null, "The system has no solutions ", "The solution", JOptionPane.INFORMATION_MESSAGE);

	       }
	       break;
	     case 0:
	       System.exit(0);
	       break;
	   }
	   
	   
   }
}
