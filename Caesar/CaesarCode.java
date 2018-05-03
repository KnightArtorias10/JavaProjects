package ID_Generator;

public class CaesarCode {
	static final int ALPHABET_SIZE = 26;
	
	/**
	 * Constructor
	 */
	public CaesarCode() {
		
	}
	
	/**
	 * Encode a string by moving each character by a certain position
	 * @param str
	 * @param shift - Describes how many positions a char should be moved
	 * @return
	 */
	public StringBuilder encode(String str, int shift) {
		StringBuilder encodedStr = new StringBuilder();
		int c;
		
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			
			//Upper case
			if(Character.isUpperCase(c)) {
				if(c + shift < ALPHABET_SIZE) {
					c = c + shift;
				} else {
					c = c + (shift % ALPHABET_SIZE);
				}
			} else {
				//Lower case
				if(Character.isLowerCase(c)) {
					if(c + shift < ALPHABET_SIZE) {
						c = c + shift;
					} else {
						c = c + (shift % ALPHABET_SIZE);
					}
				}
			}
			encodedStr.append((char) c);
		}
		return encodedStr;
	}
	
	public StringBuilder decode(String str, int shift) {
		StringBuilder decodedStr = new StringBuilder();
		int c;
		
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				if(c - shift < 'A') {
					c = c -  (shift % ALPHABET_SIZE);
				} else {
					c = c - shift;
				}
			} else if (Character.isLowerCase(c)) {
				if(c - shift < 'a') {
					c = c - (shift % ALPHABET_SIZE);
				} else {
					c = c - shift;
				}
			}
			decodedStr.append((char) c);
		}
		return decodedStr;
	}
}
