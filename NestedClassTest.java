




import java.time.LocalDate;

public class NestedClassTest {
	public static void main(String[] args) {
		
		Hostel h = new Hostel("Sarswati",0);
		
		Hostel.StudData s1 = new Hostel.StudData();
	
		
		h.allocateRooms(true);
		
		
		s1.setStudName("John");
		s1.setStudYear("Third");
		s1.setStudAddress("Pune");
		s1.setAllocationDate(LocalDate.now());
		s1.setAdvancedAmount(1200);
		s1.setRemaniningBalance(5000);
		
		h.roomAllocation();
	
		System.out.println(s1);
	}
}

class Hostel
{
	
	private String hostelName;
	private int room;
	
	private RoomsAvailable rooms = new RoomsAvailable (false,0,0);
	
	
	
	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	void allocateRooms(boolean activate)
	{
		System.out.println("room allocation started....");
		rooms.setRoomAvailable(activate);
	}
	
	
	

	public Hostel(String hostelName,int room) {
		super();
		this.hostelName = hostelName;
		this.room= room;
	}

	void roomAllocation() {
		if(rooms.isRoomAvailable()==false || room>=20) {
			throw new RuntimeException("No rooms are available...");
		}
		else {
			
			
			rooms.setAllocateRoom(room);
			
			
			
			System.out.println("allocated room is"+ rooms.getAllocateRoom());
			room++;
			
			System.out.println("Room allocation is done...");
		}
	}
	
	public static class StudData 
	{
		
		int roomNo ;
		LocalDate allocationDate;
		String studName;
		String studYear;
		String studAddress;
		double advancedAmount;
		double remaniningBalance;
		public int getRoomNo() {
			return roomNo;
		}
		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}
		public LocalDate getAllocationDate() {
			return allocationDate;
		}
		public void setAllocationDate(LocalDate allocationDate) {
			this.allocationDate = allocationDate;
		}
		public String getStudName() {
			return studName;
		}
		public void setStudName(String studName) {
			this.studName = studName;
		}
		public String getStudYear() {
			return studYear;
		}
		public void setStudYear(String studYear) {
			this.studYear = studYear;
		}
		public String getStudAddress() {
			return studAddress;
		}
		public void setStudAddress(String studAddress) {
			this.studAddress = studAddress;
		}
		public double getAdvancedAmount() {
			return advancedAmount;
		}
		public void setAdvancedAmount(double advancedAmount) {
			this.advancedAmount = advancedAmount;
		}
		public double getRemaniningBalance() {
			return remaniningBalance;
		}
		public void setRemaniningBalance(double remaniningBalance) {
			this.remaniningBalance = remaniningBalance;
		}
		@Override
		public String toString() {
			return "Statement [roomNo=" + roomNo + ", allocationDate=" + allocationDate + ", studName=" + studName
					+ ", studYear=" + studYear + ", studAddress=" + studAddress + ", advancedAmount=" + advancedAmount
					+ ", remaniningBalance=" + remaniningBalance + "]";
		}
		
		
		
	
		
	}
	
	private class RoomsAvailable 
	{
		boolean roomAvailable =true; 
		int allocateRoom  ;
	
		
		
		public RoomsAvailable(boolean roomAvailable, int allocateRoom, int deposit) {
			super();
			this.roomAvailable = roomAvailable;
			this.allocateRoom = allocateRoom;
			
		}



		public boolean isRoomAvailable() {
			return roomAvailable;
		}



		public void setRoomAvailable(boolean roomAvailable) {
			this.roomAvailable = roomAvailable;
		}

        

		public int getAllocateRoom() {
			return allocateRoom;
		}



		public void setAllocateRoom(int allocateRoom) {
			this.allocateRoom = allocateRoom;
		}



	


		


		
	}
}


