//Genna Barge- U1L07 Calender 
import javax.swing.JOptionPane;

public class U1L07Calender {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i = 0;
		String [] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String [] daysOfWeek = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 		
		
		String input = JOptionPane.showInputDialog("Enter a number day from 1-360");
		int numberDay = Integer.parseInt(input);
		int initialNumber = numberDay; 
		
		int weekDay = numberDay % 7;
		//enter that as the index for the loop
		String finalWeekDay = daysOfWeek[weekDay];
		
		while (numberDay > daysInMonth[i]) {
			numberDay -= daysInMonth[i];
			i ++;
			
		}
		String finalMonth = months[i];
		int finalDay = numberDay + 1;
		System.out.println(initialNumber + " days from January first is: " + finalMonth + " " + finalDay + " which is a " + finalWeekDay);
				
		
			

	}

}
