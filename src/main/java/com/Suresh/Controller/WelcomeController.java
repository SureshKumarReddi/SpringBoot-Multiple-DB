package com.Suresh.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.Book.BookDb;
import com.Suresh.BookRepository.BookDbRepository;
import com.Suresh.User.UserDb;
import com.Suresh.UserRepository.UserDbRepository;

@RestController
public class WelcomeController {

	@Autowired
	private UserDbRepository userrepo;

	@Autowired
	private BookDbRepository bookrepo;

	@RequestMapping("/data")
	public String insertData() {

		List<UserDb> of1 = Arrays.asList(new UserDb(101, "Suresh", "male"), new UserDb(202, "Naresh", "male"));
		List<BookDb> of2 = Arrays.asList(new BookDb(501, "Java", 100), new BookDb(202, "Spring", 200));

		userrepo.saveAll(of1);
		bookrepo.saveAll(of2);

		return " Data got inserted .... ";
	}

	@RequestMapping("/allusers")
	public List<UserDb> getAllUsers() {
		Iterable<UserDb> findAll = userrepo.findAll();

		List<UserDb> collection = new ArrayList<UserDb>();
		for (UserDb e : findAll) {
			collection.add(e);
		}
		return collection;

	}

	@RequestMapping("/allbooks")
	public List<BookDb> getAllBooks() {
		Iterable<BookDb> findAll = bookrepo.findAll();

		List<BookDb> collection = new ArrayList<BookDb>();
		for (BookDb e : findAll) {
			collection.add(e);
		}
		return collection;

	}
}
