package it.epicode.the_plant_based_hub_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="recipe_ingredients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")

public class RecipeIngredient extends BaseEntity {

    @Column(nullable = false)
    private int quantity;
    @Column(nullable = false)
    private String measurementUnit;

    @ManyToOne
    @JoinColumn(name ="recipe_id", nullable = false)
    @JsonIgnoreProperties("ingredients")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name="ingredient_id", nullable = false)
    private Ingredient ingredient;
}
