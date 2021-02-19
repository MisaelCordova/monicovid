package saude.monitoramento.covid.model;

import java.util.Date;

public class Notificacoes {
	int id_notificacao;
	Date datanotificacao;
	String tp_teste;
	String resultado; //Botar Enum
	Date dt_notificacao;
	Date dt_teste;
	String laudo; //trocar tipo para receber arquivo imagem e pdf
	String laboratorio;
	Date Ini_sintomas;
	
	
	
}
