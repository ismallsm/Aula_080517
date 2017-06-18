import javax.swing.JOptionPane;


public class Calculadora implements CalculadoraBasica {

	public static void main (String args[]) throws CalculadoraException{ 
        
    	Calculadora c = new Calculadora();  
        
        int opcao = 5;  
        float num1;  
        float num2;  
		
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma operação: \n1. Soma \n2. Subtrair \n3. Multiplicar \n4. Dividir \n0. Sair","Pergunta",JOptionPane.PLAIN_MESSAGE));  
        
        while (opcao != 0) {
			try{
	        	num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro numero:","Pergunta",JOptionPane.PLAIN_MESSAGE));
				if(num1 == 0){
					throw new CalculadoraException("Favor digitar um número maior que 0!");
				}
				num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo numero:","Pergunta",JOptionPane.PLAIN_MESSAGE));
			}catch(NumberFormatException e){
				throw new CalculadoraException("Favor digitar apenas números!");
			}
			
			if ( opcao == 1 ) {
				float operacao = c.somar(num1, num2);
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + operacao);
                break;  
            }  
            else if (opcao == 2) { 
            	float operacao = c.subtrair(num1, num2);
				JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + operacao);
				break;  
			}  
			else if (opcao == 3) {
				float operacao = c.multiplicar(num1, num2); 
				JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + operacao);
				break;  
			}  
			else if (opcao == 4) {  
				float operacao = c.dividir(num1, num2);  
				JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + operacao);
				break;  
			}      
        } 
    }
	
	@Override
	public float somar(float op1, float op2){
		// TODO Auto-generated method stub
		return op1 + op2;
	}

	@Override
	public float subtrair(float op1, float op2){
		// TODO Auto-generated method stub
		return op1 - op2;
	}

	@Override
	public float dividir(float op1, float op2){
		// TODO Auto-generated method stub
		return op1 / op2;
	}

	@Override
	public float multiplicar(float op1, float op2){
		// TODO Auto-generated method stub
		return op1 * op2;
	}

}
