package ec2.kevinramirez.bodega.service;

import java.util.List;

import ec2.kevinramirez.bodega.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
	
}
