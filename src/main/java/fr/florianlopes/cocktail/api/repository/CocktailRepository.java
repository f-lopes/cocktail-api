package fr.florianlopes.cocktail.api.repository;

import fr.florianlopes.cocktail.api.model.Cocktail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * Created by lopes_f on 12/17/2014.
 * <florian.lopes@outlook.com>
 */
@RepositoryRestResource
public interface CocktailRepository extends PagingAndSortingRepository<Cocktail, UUID> {
}