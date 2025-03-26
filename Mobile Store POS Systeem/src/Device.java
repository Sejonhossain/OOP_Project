
public class Device {
	public int deviceId;
	public String deviceName;
	public double devicePrice;
	
    public Device (int deviceId, String deviceName, double devicePrice) {
		
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.devicePrice = devicePrice;
	
	}
    
    @Override
    public String toString() {
    	return "\nDevice ID :" + deviceId + "\nDevice Name :" + deviceName + "\nDevice Price :" + devicePrice +" Taka";
    }
    
    
}