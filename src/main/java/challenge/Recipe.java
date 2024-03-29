package challenge;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Classe para mapear a receita no MongoDB
 *
 */

@Document(collection="recipe")
public class Recipe {

	@Id
	private String id;
	private String title;
	private String description;
	private List<String> likes;
	private List<String> ingredients;
	private List<RecipeComment> comments;
	
	public Recipe() {
		
	}
	
	public Recipe(String title, String description, List<String> likes, List<String> ingredients, List<RecipeComment> comments) {
		this.title = title;
		this.description = description;
		this.likes = likes;
		this.ingredients = ingredients;
		this.comments = comments;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getLikes() {
		return likes;
	}

	public void setLikes(List<String> likes) {
		this.likes = likes;
	}

	public List<String> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}

	public List<RecipeComment> getComments() {
		return comments;
	}

	public void setComments(List<RecipeComment> comments) {
		this.comments = comments;
	}
}
