package com.vikshen.bookshopservice.repository;

import com.vikshen.bookshopservice.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select b.* from book b join category c on c.id_category=b.id_category where c.url=:url", nativeQuery = true)
    Page<Book> findByCategory(@Param("url") String url, Pageable pageable);

}
