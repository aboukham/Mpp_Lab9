package lab9.part1.prob1.dataaccess;

import lab9.part1.prob1.business.Book;
import lab9.part1.prob1.business.LibraryMember;

import java.util.HashMap;

//import lesson9.labs.prob1.business.Book;
//import lesson9.labs.prob1.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String, Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
}
