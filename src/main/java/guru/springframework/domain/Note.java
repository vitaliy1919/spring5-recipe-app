package guru.springframework.domain;

import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String notes;

    public Note(Recipe recipe, String notes) {
        this.recipe = recipe;
        this.notes = notes;
    }
}
