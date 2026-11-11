package logica;


public class Parcial {
	
	public String calcularRaices(double a, double b, double c) throws Exception {

			        if (a == 0) {
			            throw new Exception("A no puede ser 0.");
			        }

			        double discriminante = b * b - 4 * a * c;

			        if (discriminante < 0) {
			            throw new Exception("La ecuacion tiene raices complejas.");
			        }

			        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

			        return "x1= " + x1 + " - x2= " + x2;
			    }
			
			
		
		
		
		
		
	}


