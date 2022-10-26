package ec2.kevinramirez.bodega.service;

import java.util.List;

import ec2.kevinramirez.bodega.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
