package model;

import java.io.Serializable;

public class coche implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String sMarca;
	private String sModelo;
	private int iPotencia;
	
	
	public coche() {
		this.sMarca = "";
		this.sModelo = "";
		this.iPotencia = 0;
	}
	
	public coche(String sMarca, String sModelo, int iPotencia) {
		this.sMarca = sMarca;
		this.sModelo = sModelo;
		this.iPotencia = iPotencia;
	}
	public String getsMarca() {
		return sMarca;
	}
	public void setsMarca(String sMarca) {
		this.sMarca = sMarca;
	}
	public String getsModelo() {
		return sModelo;
	}
	public void setsModelo(String sModelo) {
		this.sModelo = sModelo;
	}
	public int getiPotencia() {
		return iPotencia;
	}
	public void setiPotencia(int iPotencia) {
		this.iPotencia = iPotencia;
	}
	
	@Override
	public String toString() {
		return "coche [sMarca=" + sMarca + ", sModelo=" + sModelo + ", iPotencia=" + iPotencia + "]";
	}
	
	
	
	
	
}
