package br.edu.ifsc.padroesTestes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static br.edu.ifsc.padroesTestes.demo.Utilidade.*;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Utilidade utilidade = new Utilidade();

		String texto = "Exemplo de texto com acentuações.";

		String caixaAlta = transformaCaixaAlta(texto);
		System.out.println("Caixa alta: " + caixaAlta);

		String nomePessoal = transformaNomePessoal(texto);
		System.out.println("Nome pessoal: " + nomePessoal);

		String semAcentos = removerAcentos(texto);
		System.out.println("Sem acentos: " + semAcentos);

		String invertido = inverter(texto);
		System.out.println("Invertido: " + invertido);
	}

}
