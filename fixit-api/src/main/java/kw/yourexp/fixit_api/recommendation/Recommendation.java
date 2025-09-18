package kw.yourexp.fixit_api.recommendation;

import jakarta.persistence.*;
import kw.yourexp.fixit_api.center.Center;
import kw.yourexp.fixit_api.common.BaseEntity;
import kw.yourexp.fixit_api.post.Post;
import kw.yourexp.fixit_api.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Recommendation extends BaseEntity {
    private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String comment;

    private boolean isVerified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "center_id", nullable = false)
    private Center center;
}
