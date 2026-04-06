package Lista3.ex07;

public class Livro {
	private String titulo;
	private String autor;
	private boolean emprestado;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public boolean getEmprestado() {
		return emprestado;
	}
}
