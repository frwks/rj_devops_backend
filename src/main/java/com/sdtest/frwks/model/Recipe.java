package com.sdtest.frwks.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "recipe")
@DynamicInsert  // insert ㅅㅣ null 인 필드 제외하기위해 사용
@DynamicUpdate // update ㅅㅣ null 인 필드 제외하기위해 사용
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rc_id;

    @Column(name = "rc_item")
    private String rc_item;
    @Column(name = "rc_fullsize")
    private String rc_fullsize;
    @Column(name = "rc_width")
    private String rc_width;
    @Column(name = "rc_depth")
    private String rc_depth;
    @Column(name = "rc_height")
    private String rc_height;
    @Column(name = "rc_upd1")
    private String rc_upd1;
    @Column(name = "rc_upd2")
    private String rc_upd2;
    @Column(name = "rc_upd3")
    private String rc_upd3;
    @Column(name = "rc_upd4")
    private String rc_upd4;
    @Column(name = "rc_upplane")
    private String rc_upplane;
    @Column(name = "rc_midd1")
    private String rc_midd1;

    @Column(name = "rc_midd2")
    private String rc_midd2;

    @Column(name = "rc_midd3")
    private String rc_midd3;

    @Column(name = "rc_midd4")
    private String rc_midd4;

    @Column(name = "rc_midplane")
    private String rc_midplane;

    @Column(name = "rc_dwd2")
    private String rc_dwd2;

    @Column(name = "rc_dwd1")
    private String rc_dwd1;

    @Column(name = "rc_dwd3")
    private String rc_dwd3;

    @Column(name = "rc_dwd4")
    private String rc_dwd4;

    @Column(name = "rc_downplane")
    private String rc_downplane;

    @Column(name = "rc_backplane")
    private String rc_backplane;

    @Column(name = "rc_sideplane")
    private String rc_sideplane;

    @Column(name = "rc_doornum")
    private String rc_doornum;

    @Column(name = "rc_door_dwd")
    private String rc_door_dwd;

    @Column(name = "rc_door_upd")
    private String rc_door_upd;

    @Column(name = "rc_door_cend")
    private String rc_door_cend;

    @Column(name = "rc_door_leftd")
    private String rc_door_leftd;

    @Column(name = "rc_door_rightd")
    private String rc_door_rightd;

    @Column(name = "rc_size_chg")
    private String rc_size_chg;


    @Builder  // alt insert   맨위에거 누르기
    public Recipe(Integer rc_id,String rc_item,String rc_fullsize,String rc_width,String rc_depth,String rc_height,String rc_upd1,String rc_upd2,
                  String rc_upd3,String rc_upd4,String rc_upplane,String rc_midd1,String rc_midd2,String rc_midd3,String rc_midd4,String rc_midplane,
                  String rc_dwd1,String rc_dwd2,String rc_dwd3,String rc_dwd4,String rc_downplane,String rc_backplane,String rc_sideplane,String rc_doornum,
                  String rc_door_dwd,String rc_door_upd,String rc_door_cend,String rc_door_leftd,String rc_door_rightd,String rc_size_chg){
        this.rc_id = rc_id;
        this.rc_item = rc_item;
        this.rc_fullsize = rc_fullsize;
        this.rc_width = rc_width;
        this.rc_depth = rc_depth;
        this.rc_height = rc_height;
        this.rc_upd1 = rc_upd1;
        this.rc_upd2 = rc_upd2;
        this.rc_upd3 = rc_upd3;
        this.rc_upd4 = rc_upd4;
        this.rc_upplane = rc_upplane;
        this.rc_midd1 = rc_midd1;
        this.rc_midd2 = rc_midd2;
        this.rc_midd3 = rc_midd3;
        this.rc_midd4 = rc_midd4;
        this.rc_midplane = rc_midplane;
        this.rc_dwd2 = rc_dwd2;
        this.rc_dwd1 = rc_dwd1;
        this.rc_dwd3 = rc_dwd3;
        this.rc_dwd4 = rc_dwd4;
        this.rc_downplane = rc_downplane;
        this.rc_backplane = rc_backplane;
        this.rc_sideplane = rc_sideplane;
        this.rc_doornum = rc_doornum;
        this.rc_door_dwd = rc_door_dwd;
        this.rc_door_upd = rc_door_upd;
        this.rc_door_cend = rc_door_cend;
        this.rc_door_leftd = rc_door_leftd;
        this.rc_door_rightd = rc_door_rightd;
        this.rc_size_chg = rc_size_chg;

    }
}
