package ec2.kevinramirez.bodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec2.kevinramirez.bodega.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
