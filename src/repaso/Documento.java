package repaso;

public class Documento implements Validacion {

	private String titulo;

	public Documento(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void validar() {
		// TODO Auto-generated method stub
		
		
	}

}
