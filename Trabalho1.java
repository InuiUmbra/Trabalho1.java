import javax.swing.JOptionPane;
public class Trabalho1{
	public static void main(String[] args) {
		int operaçao;
	
		//- Uma 3x3 que armazene os nomes dos correntistas
		String A[][]=new String[3][3];
		A[0][0] = "Tibúrcio";
		A[0][1] = "Ricardo";
		A[0][2] = "João";
		A[1][0] = "Felisbino";
		A[1][1] = "Seu Zé";
		A[1][2] = "Dona Maria";
		A[2][0] = "Gedonstrôncio";
		A[2][1] = "Batman";
		A[2][2] = "Homem de Ferro";
	
		//Uma 3x3 que armazene os números das contas
		int B[][]=new int[3][3];
		B[0][0] = 111;
		B[0][1] = 222;
		B[0][2] = 333;
		B[1][0] = 444;
		B[1][1] = 555;
		B[1][2] = 666;
		B[2][0] = 777;
		B[2][1] = 888;
		B[2][2] = 999;

		//Uma 3x3 que armazene os saldos respectivos
		double C[][]=new double[3][3];
		C[0][0]=0.0;
		C[0][1]=0.0;
		C[0][2]=0.0;
		C[1][0]=0.0;
		C[1][1]=0.0;
		C[1][2]=0.0;
		C[2][0]=0.0;
		C[2][1]=0.0;
		C[2][2]=0.0;
		
		//operações
		operaçao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das operações abaixo: \n"
			+"1 - Inserir Recebimento \n"
			+"2 - Inserir Pagamento \n"
			+"3 - Todos os Números de Conta, Correntistas e Saldos respectivos \n"
			+"4 - O Número da Conta, o Nome do Correntista e o saldo do correntista mais RICO \n"
			+"5 - Os saldos ordenados do menor para o maior \n"
			+"6 - Sair"));
		
		// Menu(usando while e switch)
		while(operaçao<=5){
			switch(operaçao){
				case 1:
					
				break;
			
				case 2:
				
				break;
			
				case 3:
				
				break;
	
				case 4:
				
				break;
			
				case 5:
				
				break;	
			}
		}
	}
}
