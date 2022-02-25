package com.somosBooking.somosBack.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/productos/")
public class productoController {
private productoService prodService;
	
	@Autowired
	public productoController(productoService prodService) {
		this.prodService = prodService;
	}
	
	@GetMapping
	public List<producto> getProductos(){
		return prodService.getItems();
	}

    @GetMapping(path = "{prodId}")
    public producto getProducto(@PathVariable("prodId") Long prodId){
       return prodService.getItem(prodId);
    }

    @PostMapping
	public void addProducto(@RequestBody producto prod) {
		prodService.publishItem(prod);
    }
	
    @DeleteMapping(path="{prodId}")
	public void deleteProducto(@PathVariable("prodId") Long prodId) {
		prodService.deleteItem(prodId);
	}
	
	@PutMapping(path="{prodId}")
	public void updateProducto(@PathVariable("prodId") Long prodId, @RequestParam(required=false) String nombre, @RequestParam(required=false) String descripcion, @RequestParam(required=false) String URL_imagen, @RequestParam(required=false) double price, @RequestParam(required=false) int stock, @RequestParam(required=false) String size, @RequestParam(required=false) int idColor) {
		prodService.updateItem(prodId, nombre, descripcion, URL_imagen, price, stock, size, idColor);
	}
}
