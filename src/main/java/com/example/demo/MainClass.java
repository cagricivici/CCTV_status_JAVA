package com.example.demo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;

@Entity
@Table(name = "StatusINFO_CameraTable")

public class MainClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(
            name = "GradeTable_generator",
            sequenceName = "GradeTable_seq"
    )
    private long id;

    @Column(columnDefinition = "character varying(250)", name = "camera_REV", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String camereREV; //camera revision

    @Column(columnDefinition = "character varying(250)", name = "camera_SN", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String camereSN; //camera sn

    @Column(columnDefinition = "character varying(250)", name = "camera_TYPE", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String camereTYPE; //camera type

    @Column(columnDefinition = "character varying(250)", name = "camera_name", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String camereName; //camera full name

    @Column(columnDefinition = "character varying(250)", name = "camera_IP", nullable = false)
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PUBLIC)
    private String camereIP; //camera IP

    @Column(columnDefinition = "character varying(250)",name = "camera_status",nullable = false)
    @Getter
    @Setter
    private boolean cameraStatus; //camera status

}
