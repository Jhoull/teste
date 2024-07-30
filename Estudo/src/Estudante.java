
public class Estudante extends Pessoa {

	
		private String matricula;
		private String curso;
		
	public Estudante(String Nome, int Idade, String Sexo, String matricula, String curso) {
		super(Nome, Idade, Sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
		
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return super.toStrin	g() + ", Matricula: " + matricula + ", Curso : " + curso;
	}
	

}
