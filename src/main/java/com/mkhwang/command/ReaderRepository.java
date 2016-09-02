package com.mkhwang.command;

import com.mkhwang.domain.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mkhwang on 2016-09-02.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {

}
