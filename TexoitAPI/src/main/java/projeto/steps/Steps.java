package projeto.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Então;
import projeto.api.Actions;

public class Steps {

	@Dado("que tenho acesso a API {string}")
	public void que_tenho_acesso_a_api(String url) {
		Actions.urlAcesso(url);
	}

	@Quando("faço a consulta  com método GET")
	public void faço_a_consulta_com_método_get() {
		Actions.metodoGet();
	}

	@Então("valido  statuscode {int}")
	public void valido_statuscode(Integer str1) {
		
		Actions.validoStatusCode(str1);
		Actions.validaEmail("Lew@alysha.tv");

	}
}
