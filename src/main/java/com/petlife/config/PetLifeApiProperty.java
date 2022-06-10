package com.petlife.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//Classe de configuração do protocolo HTTPS
@ConfigurationProperties("controlefinanceiro")
@Component
public class PetLifeApiProperty {

private final Seguranca seguranca = new Seguranca();
	
	private String origemPermitida = "http://localhost:4200";

	public String getOrigemPermitida() {
		return origemPermitida;
	}

	public void setOrigemPermitida(String origemPermitida) {
		this.origemPermitida = origemPermitida;
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
}
