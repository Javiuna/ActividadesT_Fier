package unidad4;
    //UNIDAD 4 
	//EJERCICIO 4.18
	//INTEGRANTES DEL EQUIPO:
	//Conde Orozco María Fernanda
	//De la Cruz Luna Javier
	//Tobon Cahum Marco David

public class Ejercicio4_18 {
	
    private int numC;
    private double saldoIM;
    private double totalACM;
    private double totalCM;
    private double limiteCP;
    private double saldo;
    private double a;
    
    public Ejercicio4_18 (int numC , double saldoIM, double totalACM, double totalCM, double limiteCP)
    {
       this.numC = numC;
		this.saldoIM  = saldoIM;
		this.totalCM = totalCM;
		this.totalACM = totalACM;
		this.limiteCP = limiteCP;

    }	
		public void asignarNombreC(int numC) {
		   	  this.numC = numC;
		}
		public double obtenerNombreC() {
			return this.numC;
       }
		
		public void asignarSaldoIM(double saldoIM) {
		   	  this.saldoIM = saldoIM;
		}
		public double obtenerSaldoIM() {
			return this.saldoIM;
     }
		
		public void asignarTotalACM(double totalACM) {
		   	  this.totalACM = totalACM;
		}
		public double obtenerTotalACM() {
			return this.totalACM;
     }
		
		public void asignarTotalCM(double totalCM) {
		   	  this.totalCM = totalCM;
		}
		public double obtenerTotalCM() {
			return this.totalCM;
     }
		
		public void asignarLimiteCP(double limiteCP) {
		   	  this.limiteCP = limiteCP;
		}
		public double obtenerLimiteCP() {
			return this.limiteCP;
      }
		
		public double obtenerSaldo() {
			saldo = saldoIM + totalACM - totalCM;
			a = saldo - limiteCP;
			if (saldo > limiteCP) {
				
				System.out.println("Credito excedido  por " + a );}
				else {
					if (saldo == limiteCP) {
						System.out.println("Cuenta al limite");
					}
					else
						System.out.println("Limite normal");
					}
			
		
			return this.saldo;
			
			
}
}