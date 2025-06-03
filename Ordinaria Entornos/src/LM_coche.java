
public class LM_coche {


    public LM_coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String matricula;
    private String modelo;
    private int numeroPlazas;
    private double velocidadMedia;
    private String tipoCombustible;
    private double consumo;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroPlazas() {
		return numeroPlazas;
	}
	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	}
	public double getVelocidadMedia() {
		return velocidadMedia;
	}
	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}
	public String getTipoCombustible() {
		return tipoCombustible;
	}
	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	@Override
	public String toString() {
		return "LM_coche [matricula=" + matricula + ", modelo=" + modelo + ", numeroPlazas=" + numeroPlazas
				+ ", velocidadMedia=" + velocidadMedia + ", tipoCombustible=" + tipoCombustible + ", consumo=" + consumo
				+ ", getMatricula()=" + getMatricula() + ", getModelo()=" + getModelo() + ", getNumeroPlazas()="
				+ getNumeroPlazas() + ", getVelocidadMedia()=" + getVelocidadMedia() + ", getTipoCombustible()="
				+ getTipoCombustible() + ", getConsumo()=" + getConsumo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
