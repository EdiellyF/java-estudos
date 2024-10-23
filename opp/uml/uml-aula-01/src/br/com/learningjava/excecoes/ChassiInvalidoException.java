package br.com.learningjava.excecoes;

 public class ChassiInvalidoException  extends Exception{
	private static final long serialVersionUID = -2511035602188225880L;

	public  ChassiInvalidoException(String chassi) {
		 super(String.format("Este chassi é inválido [%s]", chassi));
		 
		 
	 }
	 
 }
