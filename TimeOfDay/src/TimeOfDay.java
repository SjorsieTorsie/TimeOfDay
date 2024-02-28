
public class TimeOfDay {
	
	/**
	 * @invar Hours moet tussen 0 en 23 zitten en Minutes moettussen 0 en 59 zitten ja
	 * | 0 <= getHours() && getHours() <= 23 &&
	 * | 0 <= getMinutes() && getMinutes() <= 59
	 */
	public int Hours;
	public int Minutes;
	
	public int getHours() {return Hours;}
	
	public int getMinutes() {return Minutes;}
	
	
	/** Constructor voor Hours en Minutes fields
	 * 
	 * @pre  | 0 <= hours && hours <= 23
	 * @pre  | 0 <= minutes && minutes <= 59
	 * 
	 *  
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	
	public TimeOfDay(int hours, int minutes) {
		Hours = hours;
		Minutes = minutes;
	}
	
	/** Stelt de uren van dit object in
	 * @pre | 0 <= hours && hours <= 23 
	 * 
	 * @mutates |this
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		this.Hours = hours;
	}
	
	/** Stelt de minuten van dit object in
	 * @pre | 0 <= minutes && minutes <= 23 
	 * 
	 * @mutates |this
	 * 
	 * @post | getHours() == minutes
	 * @post | getHours() == old(getHours())
	 */
	
	public void setMinutes(int minutes) {
		this.Minutes = minutes;
	}	
}
