package lab9.part1.prob1.business;

import java.util.List;

//import lesson9.labs.prob1.business.Book;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
