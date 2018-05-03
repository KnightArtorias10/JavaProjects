package ID_Generator;

import java.util.ArrayList;
import java.util.List;

public class ID_Generator {
	private List<StringBuilder> _ids; //Remembers the already generated IDs so that there are no multiple IDs
	private String _alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"; //62 characters
	/**
	 * Constructor
	 */
	public ID_Generator() {
		_ids = new ArrayList<StringBuilder>();
	}
	
	/**
	 * Generates a new ID by generating a random index-number for the alphabet and adding the char at the index 
	 * to the new ID. Adds it to the List and returns it if it does not exist already.
	 * @param length
	 * @return
	 */
	public StringBuilder generateID(int length) {
		StringBuilder newID = new StringBuilder();
		for(int i = 0; i < length; i++) {
			//Generate a random number from 0-61
			int num = (int) (Math.random()*61);
			char randomChar = _alphabet.charAt(num);
			newID.append(randomChar);
			}
		
		//Check and remember the ID
		if(!_ids.contains(newID)) {
			_ids.add(newID);
			return newID;
		}
		return null;
	}

}
