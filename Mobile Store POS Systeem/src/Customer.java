
public class Customer {
	  private int customerId;
	    private String customerName;
	    private String customerNumber;
	       
	   
		public Customer(int customerId, String customerName, String customerNumber) {
		
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerNumber = customerNumber;
		}
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		
		public String getCustomerNumber() {
			return customerNumber;
		}
		public void setCustomerNumber(String customerNumber) {
			this.customerNumber = customerNumber;
		}
		
		
		@Override
		public String toString() {
			return "Customer ID : " + customerId + "\nCustomer Name : " + customerName +"\nCustomer Number : "+customerNumber;
		}


}