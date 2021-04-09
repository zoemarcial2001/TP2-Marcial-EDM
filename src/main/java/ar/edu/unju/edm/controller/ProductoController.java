package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	ProductoService iProductoService;

	@GetMapping("/producto")
	public String cargarProducto(Model model) {
		model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
		return("producto");
	}


	@PostMapping("/nuevoProducto")
	public String guardarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model) {
		iProductoService.guardarProducto(nuevoProducto);
		return "producto";
	}
	}
