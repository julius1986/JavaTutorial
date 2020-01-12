package coretutorial.Lesson20_Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfUsers {
	List<User> users;

	public ListOfUsers() {
		users = new ArrayList<User>();
		users.add(new User("Igor", "Gorin", 33, 1000.00));
		users.add(new User("Boris", "Zubanov", 30, 1800.00));
		users.add(new User("Grisha", "Zelenskiy", 14, 2800.00));
		users.add(new User("Lena", "Yanukovich", 26, 300.00));
		users.add(new User("Vasya", "Yushenko", 28, 200.00));
		users.add(new User("Abrasha", "Kolomoiskiy", 33, 225.00));
		users.add(new User("Nadya", "Vandam", 30, 2400.00));
		users.add(new User("Kira", "Stalone", 18, 1700.00));
		users.add(new User("Iza", "Bondarenko", 63, 1300.00));
		users.add(new User("Senya", "Tereshkov", 15, 1700.00));
		users.add(new User("Vitala", "Rabin", 14, 1100.00));
		users.add(new User("Pasha", "Zinger", 22, 1600.00));
	}

	public List<User> getUsers() {
		return users;
	}

}
