package com.kjspo.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String origFilename;    //업로드된 실제 파일명

    @Column(nullable = false)
    private String filename;    //서버에 저장된 파일명

    @Column(nullable = false)
    private String filePath;    //파일이 서버에 저장된 위치

    @Builder
    public File(Long id, String origFilename, String filename, String filePath){
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
