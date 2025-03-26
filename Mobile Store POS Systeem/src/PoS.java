
import javax.swing.JOptionPane;

public class PoS {

	public static void main(String[] args) {
		Cart cart=new Cart();
		 Device device;
		 int choice=0;
		 
		while(true) 
		{
		         String input = JOptionPane.showInputDialog(null,
		        		 
	                          "\n*****Menu For Employee*****\n\n"
		    		 
	                       	 +"1. Add Device In Mobile Store\n"
	                         +"2. Remove Device From The Mobile Store\n"
	                         +"3. Providing Discount For The Customer\n"
	                   	     +"4. Customer Registration\n"
	                         +"5. Registered Customer List\n" 
	                   	     
	                   	     + "\n*** Device Lists Accessible by Both Employee and Customer***\n\n"
	                   	     +"6.To View Whole Device Lists In Store \n"
	                          
	                         +"\n*****Menu For Customer*****\n\n"	
	                         
	                       	 +"7. Add Device In Cart\n"
	                       	 +"8. Remove Device From Cart\n"
	                         +"9. Clear All Device From Cart\n"
	                         +"10. View Cart Details\n"       
	                         +"11. Exit\n"
		                     + "\nEnter your option: ","Menu", JOptionPane.PLAIN_MESSAGE);
		      
		     try {
		     choice = Integer.parseInt(input);
	        
            }
		     catch(NumberFormatException e) {
		    		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");
               
            }
	        
            
            if(choice==1) {	
            	
            	try {

            	   int quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter How Many Device You Want To Add : ") );
            	
            	   for(int i=0;i<quantity;i++)
            	    {

 				      int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Device ID : " ) ); 
 				  
 		
 	        	      String name=JOptionPane.showInputDialog("Enter Device Name : " );
 	        	
 	        	      double price=Double.parseDouble(JOptionPane.showInputDialog("Enter Device Price : " ) );
 	        	
            	      device= new Device(id,name,price);
                      cart.addDevice(device);
                
                      JOptionPane.showMessageDialog(null,"(Add Device Successfully In Mobile Store!)");

                      
                    }
            	}
            	catch(NumberFormatException e) {
            		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");
            		
            	}
                
                
            	
            }else if(choice==2) {
            	
            	try {
            		
 				    int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Device ID : " ) ); 				
            	    cart.removeDevice(id);
            	
            	}catch(NumberFormatException e) {
            		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");

            	}
            	
            }else if(choice==3) {
            	 	
            	double price =cart.getTotalPrice();
            	
       		     JOptionPane.showMessageDialog(null, "Total Price : "+price+" Taka");
            	
            	try {
            		
 				    double discountPercentage=Double.parseDouble(JOptionPane.showInputDialog("Enter Discount Percentage : " ) ); 
 				    
                    double price2 =cart.applyDiscount(discountPercentage);
                    JOptionPane.showMessageDialog(null,"After Discount New Price : "+price2+" Taka" );
                	

                                       
            	}
            	catch(NumberFormatException e) {
            		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");
            		
            	}
            }else if(choice==4) {
            	
            	try {
            	cart.registerCustomer();
            	}
            	catch(InvalidNumberException e) {
            		
            		 JOptionPane.showMessageDialog(null, e.getMessage());
            	}
            	
            }else if(choice==5) {
            	 JOptionPane.showMessageDialog(null,".....Registrated Customer List....."); 
            	cart.getCustomerDetails();
            }else if(choice==6) {
            	
            	cart.viewMobileList();
            	
            }else if(choice==7) {
            	
            	cart.addItem();
            	
            }else if(choice==8) {
            	
            	
            	try {
            	
 				      int id=Integer.parseInt(JOptionPane.showInputDialog(null,".....Remove Device From The Cart.....\n"+
            	                              "Enter Device ID : " ) );
            	      cart.removieItem(id);
            	    }
            	catch(NumberFormatException e) {
            		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");
         		
            	    }
            }else if(choice==9) {
            	
            	cart.clearCart();
           	     JOptionPane.showMessageDialog(null,"All Product Cleared From The Cart.");
            	
            }else if(choice==10) {
            	
                 JOptionPane.showMessageDialog(null,".....Selected Devices In The Cart.....");
            	 
            	 if(cart.getTotalPrice()!=0.0) {
                 cart.getCartItems();
                 JOptionPane.showMessageDialog(null,"Total Price: " + cart.getTotalPrice() +" Taka");
            	 }
            	 else {
            		 JOptionPane.showMessageDialog(null,"....Cart is empty....");
            	 }
            	
            }else if(choice==11) {
            	JOptionPane.showMessageDialog(null, "Exiting..."+"\nThank You For Visiting Your Store ");
            	break;
            	
            }else {
            	
            	if(choice!=0) {
            	try {
            		
            		throw new InvalidChoiceException(choice);
            	}
            	catch(InvalidChoiceException e) {
            		
            		 JOptionPane.showMessageDialog(null, e.getMessage());
            	}
            }
           }
            
		}
	}

}
