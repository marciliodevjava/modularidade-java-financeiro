module app.financeiro {
	//Estou requerendo o pacote do app-calculo
	//requires java.base;// modulo padr�o
	requires app.api;
	uses br.com.cod3r.app.Calculadora;//Servi�o que foi definido pela calculadora
}