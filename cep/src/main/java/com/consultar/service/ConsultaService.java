package com.consultar.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.consultar.Cep;

@Service
public class ConsultaService {
	
	public Cep consultaCep(String cep) {
		return new RestTemplate().getForEntity("https://viacep.com.br/ws/" +cep+ "/json/", Cep.class).getBody();
	}
}
