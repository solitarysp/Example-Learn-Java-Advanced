package com.higgsup.Annotation.UngDUngThucTe.entity;

import com.higgsup.Annotation.UngDUngThucTe.annotation.Colum;
import com.higgsup.Annotation.UngDUngThucTe.annotation.Table;

@Table(name = "clazz")
public class Clazz {
    @Colum(name = "id")
    private Integer id;

    @Colum(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
