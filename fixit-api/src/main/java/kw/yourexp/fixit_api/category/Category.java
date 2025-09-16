package kw.yourexp.fixit_api.category;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

public class Category {
    private Integer id;
    private String nameAr;
    private String nameEn;
//    private Integer parentId;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
