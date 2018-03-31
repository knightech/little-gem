package net.knightech.sdr.app.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.knightech.sdr.app.domain.entities.Author;
import net.knightech.sdr.app.domain.entities.Book;

/**
 * Created by rodrigo.chaves on 12/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface AuthorRepository extends MongoRepository<Author, String> {
    Author findOneByBooks(Book book);
}