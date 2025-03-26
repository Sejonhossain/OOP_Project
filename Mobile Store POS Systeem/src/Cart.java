import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Cart extends MobileStore implements DiscountProvider,CustomerRegistration{

	ArrayList<Device> items = new ArrayList<>();
	Customer customer[]=new Customer[1000]; 
	ArrayList<Customer> CustomerList=new ArrayList<>();
	private  int n,n2;
	public Cart() {
		this.n=0;
		this.n2=-1;
	}
	
	@Override
	public void registerCustomer() throws InvalidNumberException{
		
		try {
			
		    int c=0;
		    n++;
	
			int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Customer ID : " ) );
			

        	String name=JOptionPane.showInputDialog("Enter Customer Name : "  );
    
        	String number=JOptionPane.showInputDialog("Enter Customer Number : " ) ;
        	
        	if(number.length()<11||number.length()>11) { 
        		
        		throw new InvalidNumberException(number);
        		
        	}
        	else {
        		
        	customer[n]=new Customer(id,name,number);
        	
            for(int i = 1;i<n;i++) {
            	try {
            	if(customer[i].getCustomerId()==customer[n].getCustomerId()) {
            		c++;	
            	}
                 }catch(NullPointerException e){
            	
            }
            	}
            }
        	{
            
            if(c==0) {
            	CustomerList.add(customer[n]);
            	JOptionPane.showMessageDialog(null,"(Customer registration done!)\n");
            	
            	n2++;
            	JOptionPane.showMessageDialog(null,CustomerList.get(n2));
            }
            else {
            	JOptionPane.showMessageDialog(null,"(Customer account already exists.)");
                 }
        	}
		}
		catch(NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");
		
		}
	
	}
	
	public void getCustomerDetails() {
	
    	for(int i=0;i<CustomerList.size();i++) {
    		JOptionPane.showMessageDialog(null,"Customer : "+(i+1));
    		JOptionPane.showMessageDialog(null, CustomerList.get(i));
    	
    }
    	if(CustomerList.size()==0) {
    		JOptionPane.showMessageDialog(null,"(Customer List Is Empty!)");
    	}
   }
	
		
	public void addItem(){
		try {
			
		   int c=0;

		   int deviceid=Integer.parseInt(JOptionPane.showInputDialog("Enter The Device Id : " ) );
		   for(int i=0;i<AvailableDevice.size();i++) {
			
		   if(deviceid==AvailableDevice.get(i).deviceId) {
			
			 Device device=new Device(AvailableDevice.get(i).deviceId,AvailableDevice.get(i).deviceName, AvailableDevice.get(i).devicePrice);
			 items.add(device);
			 JOptionPane.showMessageDialog(null,"(Add Device Successfully In The Cart!)");
			 c++;
			
		    }
		
		  }
		  if(c==0) {			
			  JOptionPane.showMessageDialog(null,"(Device Not Available In Stock.)");
		    }
		  }
		catch(NumberFormatException e) {
    		JOptionPane.showMessageDialog(null, "Wrong Input. Please Try Again");

		   }
    }
	
	public void removieItem(int deviceId) {
		int c=0;
		for(int i=0;i<items.size();i++) {
			   if(deviceId==items.get(i).deviceId) {   
			   items.remove(i);
			   JOptionPane.showMessageDialog(null,"(Remove Device Successfully From The Cart!)");
			   c++;
			   }
	   }
		if(c==0) {
			JOptionPane.showMessageDialog(null,"(Device Not Found In The Cart.)");
		}
		
	}
	
	public void clearCart() {
        items.clear();
	}
	
	public void getCartItems() {
    	for(int i=0;i<items.size();i++) {
    		//JOptionPane.showMessageDialog(null,"\nProduct : "+(i+1));
    		JOptionPane.showMessageDialog(null,items.get(i));
    }
   }
	
	public double getTotalPrice() {
    	double totalPrice=0;
    	for(int i=0;i<items.size();i++) {	
    	    totalPrice=totalPrice+items.get(i).devicePrice;
    	} 
    	return  totalPrice; 	
    }
	

	@Override
	public double applyDiscount(double discount) {
		double price =getTotalPrice();
		double AfterDiscount=price-(price*(discount/100));
		
		return AfterDiscount;
	}
	
	
 
   
	

}
