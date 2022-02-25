package com.somosBooking.somosBack.productos;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public class productoService {
public ArrayList<producto> lista = new ArrayList<producto>();
	
	public productoService () {
		lista.add(
				new producto(
						"Hoodie Sage Skylight",
						"Sudadera Oficial de Sage Skylight",
						"https://res.cloudinary.com/duymgcfax/image/upload/v1645323135/zh4cahedpx3refi5n0in.png",
						25.99,
						3,
						"Mediana",
						3)
				);
		lista.add( new producto(
					"Camisa Sage Skylight",
					"Camisa Oficial de Sage Skylight",
					"https://res.cloudinary.com/duymgcfax/image/upload/v1645323120/rasm1ydy8krndizc682n.png",
					25.99,
					3,
					"Mediana",
					3)
				);
		lista.add( new producto(
					"CD The Black Hardies",
					"CD Oficial The Black Hardies",
					"https://res.cloudinary.com/duymgcfax/image/upload/v1645323129/jlcdnkjux4kps48hzi0l.png",
					55.99,
					3,
					"N/A",
					3)
				);
		lista.add( new producto(
				"Bucket Hat The Black Hardies",
				"Gorra Oficial The Black Hardies",
				"https://res.cloudinary.com/duymgcfax/image/upload/v1645323118/bhwghikxg518bxfeucbw.png",
				45.99,
				3,
				"N/A",
				3)
				);
		lista.add( new producto(
				"Hoodie The Black Hardies",
				"Sudadera Oficial The Black Hardies",
				"https://res.cloudinary.com/duymgcfax/image/upload/v1645323129/lqltzfgaeg0yzqmuun82.png",
				15.99,
				3,
				"Grande",
				3)
				);
		lista.add( new producto(
				"Beanie Hat Warhol",
				"Gorra Oficial de Hat Warhol",
				"https://res.cloudinary.com/duymgcfax/image/upload/v1645323138/ztlzznpqw1o5z97xwc0y.png",
				65.99,
				3,
				"N/A",
				3)
				);
		
	}
	
	public ArrayList<producto> getItems(){
		return lista;
	}

	//public void deleteProducto(Long prodId) {
	//	producto p = getProducto(prodId);
	//	lista.remove(p);
	//}

	public producto getItem(Long prodId) {
        producto tmpItem = null;
		for(producto item : lista){
            if(item.getId() == prodId){
                tmpItem = item;
            }
        }
        return tmpItem;
	}

	public void publishItem(producto prod) {
        lista.add(prod);
	}

	public void deleteItem(Long prodId) {
		producto p = getItem(prodId);
		lista.remove(p);
	}

	public void updateItem(Long prodId, String nombre, String descripcion, String uRL_imagen, double price, int stock,
			String size, int idColor) {
		producto p = getItem(prodId);
		if(nombre!=null) p.setNombre(nombre);
		if(descripcion!=null) p.setDescripcion(descripcion);
		if(uRL_imagen!=null) p.setURL_imagen(uRL_imagen);
		if(price!=0) p.setPrice(price);
		if(stock!=0) p.setStock(stock);
		if(size!=null) p.setSize(size);
		if(idColor!=0) p.setIdColor(idColor);
		
	}
	
	
}
