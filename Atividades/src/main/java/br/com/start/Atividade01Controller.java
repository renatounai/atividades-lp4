package br.com.start;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade-01")
public class Atividade01Controller {
	
	
	/***
	 * Quando usamos @PathVariable informamos ao Spring que as varíaveis estão no
	 * caminho da URL.
	 * 
	 * @param numero1
	 * @param numero2
	 * @return
	 */
	@GetMapping(value = "/somar/{numero1}/{numero2}")
	public int somarNumeros(@PathVariable int numero1, @PathVariable  int numero2) {
		return numero1 + numero2;
	}
	
	@GetMapping(value = "/somar")
	public int somarNumerosMetodo2(@RequestParam int numero1, @RequestParam int numero2) {
		return numero1 + numero2;
	}
	
	@PostMapping(value = "/verificar-idade")
	public String verificarIdade(@RequestBody Pessoa pessoa) {
		if (pessoa.getIdade() >= 18) {
			return pessoa.getNome() + " é maior de idade";
		} else {
			return pessoa.getNome() + " é menor de idade";
		}
	}
}
