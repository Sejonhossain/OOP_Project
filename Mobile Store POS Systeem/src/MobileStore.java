
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MobileStore {
	
	public static ArrayList<Device>AvailableDevice=new ArrayList<>();
	
	
	public void addDevice(Device device){		
			AvailableDevice.add(device);	   			
	}
	
	public void removeDevice(int id) {
		   int c=0;
				  
		   for(int i=0;i<AvailableDevice.size();i++) {
		   if(id==AvailableDevice.get(i).deviceId) {	   
		   AvailableDevice.remove(i);
		   JOptionPane.showMessageDialog(null,"(Remove Device From Mobile Store Successfully!)");
		   c++;
		   }
		   }
		   if(c==0) {
			   JOptionPane.showMessageDialog(null,"(Device Not Found In Store.)");
		   }
	}
        
    public void getMobileStoreItems() {
    	for(int i=0;i<AvailableDevice.size();i++) {
    		JOptionPane.showMessageDialog(null,"Device : "+(i+1) + AvailableDevice.get(i));
           }
    	
    }
    public void viewMobileList() {
    	JOptionPane.showMessageDialog(null,"....Available Device Lists....");
    		getMobileStoreItems();
    		if(AvailableDevice.size()==0) {
    			JOptionPane.showMessageDialog(null,"\n(No Device Available In Store!)");
    		}
    	}
    }

