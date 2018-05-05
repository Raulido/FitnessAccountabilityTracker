//whatever we need to import

class userAccount {
        private String fullName;
        private String userName;
	private String email;
        private int level = 0;
        private int experience = 0;
        private String bio = "Say something about yourself!";
	private String password;
	private String[] friends_list = new String[20];
	private String[] mail_box = new String[10];
        //variable for picture???
	
	public userAccount(String f, String u, String p) {
		fullName = f;
		userName = u;
		if (check_password_eligible(p)) {
			password = p;
		}
	}
	
	public String get_fullName() {
		return fullName;
	}

	public void change_fullName(String new_fullName) {
		fullName = new_fullName;
	}
	
	public String get_userName() {
		return userName;
	}

	public void edit_bio(String b) {
		if (b > 100) {
			//notify user that the bio is too long
		else {
			bio = b;
		}
	}

	public int get_rank() {
		return rank;
	}

	public boolean check_password_eligible(String p) {
		if ((p.length() < 8) && (password != p)) {
			//notify user that the password is ineligible
			return false;
		}
		else {
			return true;
		}
	}

	public void change_password(String new_p) {
		if (check_password_eligible(new_p)) {
			password = p;
			//notify that password was changed
		}
	}

	public void add_friend(String new_user) {
		for (int i = 0; i < friends_list.length(); i++) {
			if (friends_list[i].equals(friend)) {
				//notify that you are already friends
				return;
			}
		}
		//send the user a friend request
	}
	
	public void receive_friend_request(String new_request_from_user) {
		if (check_mail_box_space()) {			
			for (int i = 0; i < friends_list.length(); i++) {
				if (friends_list[i] == null) {
						
				}
			}
		}			
	}
	public boolean check_mail_box_space() {
		for (int i = 0; i < mail_box.length(); i++) {
                        if (mail_box[i] == null) {
                                return true;
                        }
                }
		//notify the user that there is not enough mail space
		return false;
	}
}

