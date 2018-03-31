package net.knightech.sdr.app.domain.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.knightech.sdr.app.domain.entities.Book;
import net.knightech.sdr.app.domain.entities.Category;

/**
 * Created by rodrigo.chaves on 12/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByCategory(Category category);
}