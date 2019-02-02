
// Saila Kivela

public class Pankkitili{
	private String tilinumero;
	private String tilinOmistaja;
	private double saldo;
	
	public Pankkitili(){
		this.tilinumero = null;
		this.tilinOmistaja = null;
		this.saldo = 0;
	}
	
	public Pankkitili(String tilinumero, String tilinOmistaja, double saldo){
		this.tilinumero = tilinumero;
		this.tilinOmistaja = tilinOmistaja;
		this.saldo = saldo;
	}
	
	public String getTilinumero(){
		return this.tilinumero;
	}
	
	public void setTilinumero(String tilinumero){
		this.tilinumero = tilinumero;
	}
	
	public String getTilinOmistaja(){
		return this.tilinOmistaja;
	}
	
	public void setTilinOmistaja(String tilinOmistaja){
		this.tilinOmistaja = tilinOmistaja;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void otto(double otto){
		if (otto >= 0 && otto <= getSaldo()){
			this.saldo = this.saldo - otto;
		}
	}
	
	public void talletus(double talletus){
		if (talletus >=0){
			this.saldo = this.saldo + talletus;
		}
	}
	
	public void tulostaTili(){
		System.out.println("tilinumero: " + getTilinumero() + "\ntilinomistaja: " + getTilinOmistaja() + "\nsaldo: " + getSaldo());
	}
	
	/* vaihtoehtoinen tapa saada tulostus tilistä:
	public String toString(){
		return "tilinumero: " + getTilinumero() + "\ntilinomistaja: " + getTilinOmistaja() + "\nsaldo: " + getSaldo();
	}
	*/

}	