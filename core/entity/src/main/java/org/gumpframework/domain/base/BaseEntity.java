package org.gumpframework.domain.base;

import org.gumpframework.util.UniqueUtil;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import java.io.Serializable;

/**
 *  create by GumpDai
 */
public class BaseEntity implements Serializable{

    @Id
    @Column(name = "id_",nullable = false)
    private String id;

    @PrePersist
    public void prePersist(){
        this.id = UniqueUtil.uuid();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
