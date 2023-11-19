package entities;

public class Empregado {

	private int id;
	private String name;
	private String nascimento;
	private String função;
	private double salario;
	
	public Empregado() {
		
	}
	
	public Empregado(int id, String name, String nascimento, String função, double salario) {
		super();
		this.id = id;
		this.name = name;
		this.nascimento = nascimento;
		this.função = função;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getFunção() {
		return função;
	}

	public void setFunção(String função) {
		this.função = função;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void exibirFuncionario() {
		System.out.println("ID :"+ id + " - NOME:" + name + " - FUNÇÃO:" + função);
	}
	
	public void salarioFuncionario() {
		System.out.printf("NOME: %s - SALÁRIO: R$%.2f Reais%n ",name,salario);
	}
}
