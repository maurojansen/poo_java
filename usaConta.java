package estudoJava;

public class usaConta {

	public static void main(String[] args) {
		Conta c;
		c=new Conta();
		c.numero=12345;
		c.nome_titular="Zé";
		c.limite=200;
		c.depositar(100);
		System.out.println("Titular: "+c.nome_titular);
		System.out.println("Saldo atual: "+c.saldo);
		c.sacar(50);
		System.out.println("Saldo atual: "+c.saldo);
		if(c.sacar(70))
			System.out.println("Saque efetuado");
		else
			System.out.println("Saldo insuficiente");
		System.out.println("Saldo atual: "+c.saldo);
		if(c.sacar(190))
			System.out.println("Saque efetuado");
		else
			System.out.println("Saldo insuficiente");
		System.out.println("Saldo atual: "+c.saldo);
	}

}
