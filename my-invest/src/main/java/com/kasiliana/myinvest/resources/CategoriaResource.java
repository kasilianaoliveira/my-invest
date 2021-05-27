package com.kasiliana.myinvest.resources;

import com.kasiliana.myinvest.domain.Categoria;
import com.kasiliana.myinvest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@GetMapping
	public List<Categoria> listarTodos(){
		return categoriaRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public Categoria buscarCodigo(@PathVariable Long codigo){
		return categoriaRepository.findById(codigo).orElse(null);
	}

	@DeleteMapping
	public void deletar(@PathVariable Long codigo){
		categoriaRepository.deleteById(codigo);
	}

	@PostMapping
	public Categoria categoria(@RequestBody Categoria categoria){
		return categoriaRepository.save(categoria);
	}
}
