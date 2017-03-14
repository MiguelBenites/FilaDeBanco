package fila.banco;
import java.util.ArrayList;

public class Caixa {
	int numero;
	Cliente cliente;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	/**
	 * Retorna o cliente do caixa...
	 * @return
	 */
	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Atende um cliente
	 * @param cliente
	 * @return
	 */
	public String atendeCliente(Cliente cliente) {
		if (this.getCliente()==null){
			this.cliente = cliente;
			return "True";
		}
		return "False";
	}
	/**
	 * Retorna se o caixa está livre
	 * @return
	 */
	public String isEmpty(){
		if (this.getCliente()==null){
			return "True";
		}
		return "False";
	}
	
	/**
	 * Retorna o número do caixa
	 * @param numero
	 */
	public Caixa(int numero) {
		this.numero = numero;
	}
	
	/**
	 * Retira um cliente do caixa...
	 * @return
	 */
	public Cliente retira(){
		Cliente cli;
		cli = cliente;
		cliente = null;
		return cli;
	}
	
	
}
