module app.financeiro {
	//Estou requerendo o pacote do app-calculo
	//requires java.base;// modulo padrão
	requires app.api;
	uses br.com.cod3r.app.Calculadora;//Serviço que foi definido pela calculadora
}