package org.gumpframework.domain.sys;


import org.gumpframework.domain.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sys_user_t")
public class BackUser extends BaseEntity{

    @Column(name = "name_")
    private String anme;
    @Column(name = "password_")
    private String password;

    public String getAnme() {
        return anme;
    }

    public void setAnme(String anme) {
        this.anme = anme;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
