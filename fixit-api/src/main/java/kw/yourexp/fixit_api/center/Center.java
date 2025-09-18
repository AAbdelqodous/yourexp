package kw.yourexp.fixit_api.center;

import jakarta.persistence.*;
import kw.yourexp.fixit_api.category.Category;
import kw.yourexp.fixit_api.common.BaseEntity;
import kw.yourexp.fixit_api.recommendation.Recommendation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Center extends BaseEntity {
    private String nameAr;

    private String nameEn;

    private String address;

    private String phone;

    private String map;

    private BigDecimal latitude;

    private BigDecimal longitude;

    @OneToMany(mappedBy = "center", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Recommendation> recommendations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "center_specialties",
            joinColumns = @JoinColumn(name = "center_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> specialties = new ArrayList<>();
}
