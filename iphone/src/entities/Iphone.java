package entities;

public class Iphone extends AparelhoTelefonico{
	private ReprodutorMusical rm;
	private NavegadorInternet ni;
	public Iphone() {
		
	}
	public Iphone(ReprodutorMusical rm, NavegadorInternet ni) {
		this.rm = rm;
		this.ni = ni;
	}
	public ReprodutorMusical getRm() {
		return rm;
	}
	public void setRm(ReprodutorMusical rm) {
		this.rm = rm;
	}
	public NavegadorInternet getNi() {
		return ni;
	}
	public void setNi(NavegadorInternet ni) {
		this.ni = ni;
	}
}
