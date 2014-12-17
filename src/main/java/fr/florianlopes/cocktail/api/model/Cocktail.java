package fr.florianlopes.cocktail.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Created by flopes on 16/12/2014.
 */
@Entity
@Table(name = "cocktail")
public class Cocktail {

	@Id
	private UUID id;

	private String cocktailId;

	private String name;

	private String description;

	private String price;

	public Cocktail() {
		this.id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getCocktailId() {
		return cocktailId;
	}

	public void setCocktailId(String cocktailId) {
		this.cocktailId = cocktailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}