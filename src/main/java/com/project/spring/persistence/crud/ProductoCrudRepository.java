package com.project.spring.persistence.crud;

import com.project.spring.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    /* otra manera de generar consultas es atraves de @query
    @Query(value ="SELECT * FROM productos WHERE id_categoria =?", nativeQuery = true)
    List<Producto> getByCategoria(int idCategoria);
    */

    // consultar lista de productos que pertenecen a una categoria mediante un queryMethod
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);


}
