package com.sdtest.frwks.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "catalog")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ct_id;

    @Column(name = "ct_item_name")
    private String ct_item_name;

    @Column(name = "ct_model")
    private String ct_model;

    @Column(name = "ct_g2b")
    private String ct_g2b;

    @Column(name = "ct_width")
    private String ct_width;

    @Column(name = "ct_depth")
    private String ct_depth;

    @Column(name = "ct_height")
    private String ct_height;

    @Column(name = "ct_price")
    private String ct_price;

    @Builder  // alt insert   맨위에거 누르기
    public Catalog(Integer ct_id, String ct_item_name, String ct_model, String ct_g2b, String ct_width, String ct_depth, String ct_height, String ct_price) {
        this.ct_id = ct_id;
        this.ct_item_name = ct_item_name;
        this.ct_model = ct_model;
        this.ct_g2b = ct_g2b;
        this.ct_width = ct_width;
        this.ct_depth = ct_depth;
        this.ct_height = ct_height;
        this.ct_price = ct_price;
    }
}
