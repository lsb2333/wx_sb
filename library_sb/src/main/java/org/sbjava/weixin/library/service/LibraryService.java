package org.sbjava.weixin.library.service;

import org.sbjava.weixin.library.domain.Book;
import org.sbjava.weixin.library.domain.DebitList;
import org.springframework.data.domain.Page;

public interface LibraryService {

	Page<Book> search(String keyword, int pageNumber);

	void add(String id, DebitList list);

	void remove(String id, DebitList list);

}
