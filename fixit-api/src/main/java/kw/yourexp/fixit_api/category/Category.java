package kw.yourexp.fixit_api.category;

import jakarta.persistence.*;
import kw.yourexp.fixit_api.center.Center;
import kw.yourexp.fixit_api.common.BaseEntity;
import kw.yourexp.fixit_api.post.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Category extends BaseEntity {
    private String nameAr;

    private String nameEn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private List<Category> subCategories = new ArrayList<>();

    @ManyToMany(mappedBy = "categories")
    private List<Post> posts = new ArrayList<>();

    @ManyToMany(mappedBy = "specialties")
    private List<Center> centers = new ArrayList<>();
}
