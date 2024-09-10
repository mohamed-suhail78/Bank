package BUS;

public class Busdetails {
	private int busno;
	private boolean AC;
    private	int capacity;
    
    Busdetails(int no,boolean ac,int cap){
    this.busno=no;
    this.AC=ac;
    this.capacity=cap; 
    }
    
    
	public int getBusno() {
		return busno;
	}
	public void setBusno(int busno) {
		this.busno = busno;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public void displayinfo() {
		System.out.println("bus no : "+busno  +"  Ac: "  +AC + "  capacity: "+capacity );
		
	}

}
