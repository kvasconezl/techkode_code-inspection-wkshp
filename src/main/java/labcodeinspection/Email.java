package labcodeinspection;

public class Email {

	private String m_firstName; //NOPMD This file will be manipulated later.
	private String m_lastName;
	private String password;
	private String department;
	/**
	 * @return
	 */
	public String getM_firstName() {
		return m_firstName;
	}
	/**
	 * @param m_firstName
	 */
	public void setM_firstName(String m_firstName) {
		this.m_firstName = m_firstName;
	}

	/**
	 * @return
	 */
	public String getM_lastName() {
		return m_lastName;
	}	
	/**
	 * @param m_lastName
	 */
	public void setM_lastName(String m_lastName) {
		this.m_lastName = m_lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getDefaultpasswordLength() {
		return defaultpasswordLength;
	}

	public void setDefaultpasswordLength(int defaultpasswordLength) {
		this.defaultpasswordLength = defaultpasswordLength;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int defaultpasswordLength = 8;
	private String email; 
	/**
	 * @param firstName
	 * @param lastName
	 */
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	 * 
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * @param depChoice
	 */
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;	
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	 * 
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase() + this.m_lastName.toLowerCase() + "@" + this.department
				+ ".espol.edu.ec";
	}
}
