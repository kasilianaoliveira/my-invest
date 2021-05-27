package com.kasiliana.myinvest.resources;

import com.kasiliana.myinvest.domain.Investimento;
import com.kasiliana.myinvest.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoResource {

	@Autowired
	private InvestimentoRepository investimentoRepository;

	@GetMapping
	public List<Investimento> listarTodos(){
		return investimentoRepository.findAll();
	}

	@GetMapping("/{codigo}")
	public Investimento buscarCodigo(@PathVariable Long codigo){
		return investimentoRepository.findById(codigo).orElse(null);
	}

	@DeleteMapping
	public void remover(@PathVariable Long codigo) {
		investimentoRepository.deleteById(codigo);
	}

	@PostMapping
	public Investimento cadastrar(@RequestBody Investimento investimento){
		return investimentoRepository.save(investimento);
	}
}
