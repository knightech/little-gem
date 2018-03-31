package net.knightech.sdr.app.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.knightech.sdr.app.domain.entities.Category;

/**
 * Created by rodrigo.chaves on 12/06/2017.
 */
@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategoryRepository extends MongoRepository<Category, String> {
}