package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Producto;

@Service
public class ProductoServiceImp {
	//como se hace la solucion del problema
			//guardar en Array		
			//guarde en una BD MySQL		
			//guarde en una DB Oracle

		@Autowired
		Producto unProducto;
		
		

		@Override
		public void guardarProducto(Producto unProducto) {
			// TODO Auto-generated method stub

		}

		@Override
		public void modificarProducto(Producto productoAModificar) {
			// TODO Auto-generated method stub

		}

		@Override
		public void eliminarProducto(Producto productoAEliminar) {
			// TODO Auto-generated method stub

		}

		@Override
		public Producto obtenerUnProducto(String nombreProducto) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ArrayList<Producto> obtenerTodosProductos() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Producto obtenerProductoNuevo() {
			// TODO Auto-generated method stub
			return unProducto;
		}


}
