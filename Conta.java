package estudoJava;

public class Conta {
	// atributos:
	int numero;
	String nome_titular;
	double saldo;
	double limite;
	//métodos:
	void depositar(double valor) {
		this.saldo=this.saldo+valor;
	}
	boolean sacar(double valor) {
		if(this.saldo+this.limite >= valor) { 
			saldo-=valor;
			return true;
		}
		else
			return false;
	}
}
