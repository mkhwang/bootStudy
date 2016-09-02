package com.mkhwang.command;

import com.mkhwang.domain.Book;
import com.mkhwang.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mkhwang on 2016-08-31.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long>{
    List<Book> findByReader(Reader reader);

}
