package com.project.spring.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name="id_compra")
    private Integer idComra;

    @Column(name="id_producto")
    private Integer idProducto;

    public Integer getIdComra() {
        return idComra;
    }

    public void setIdComra(Integer idComra) {
        this.idComra = idComra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
