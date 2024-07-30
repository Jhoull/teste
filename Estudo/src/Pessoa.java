
public class Pessoa {
	public String nome;
	public int idade;
	public String sexo;
	
	public Pessoa() {
		nome = "Sem nome";
		idade = 0;
		sexo = "Sem sexo";
	}
	
	public Pessoa(String pNome, int pIdade, String pSexo) {
		this.nome = pNome;
		this.idade = pIdade;
		this.sexo = pSexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo;

	}
	
}
