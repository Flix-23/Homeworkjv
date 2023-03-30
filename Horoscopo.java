/*Determinar el signo zodiacal de la persona segun su mes y dia*/
import java.util.Scanner;

public class Horoscopo{
	public static void main(String[] args){
		String nombre;
		int edad;
		int mes;
		int dia;
		Scanner entradaInt = new Scanner(System.in);
		Scanner entradaString = new Scanner(System.in);
		System.out.println("Cual es tu nombre?");
			nombre = entradaString.nextLine();
			
		System.out.println("Usted es: " + nombre);

		System.out.println("Cual es su edad?");
			edad = entradaInt.nextInt();

		System.out.println("Su edad es: " + edad);

		System.out.println("Cual es tu mes?");
			mes = entradaInt.nextInt();
		System.out.println("Cual es tu dia?");
			dia = entradaInt.nextInt();


			
			if(mes==11){
			    if(dia>=23){
				System.out.println("Su signo Zodiacal es Sagitario");
			}
			else{
			    System.out.println("Su signo Zodiacal no es Sagitario");
	    }
	}
	if(mes==12){
		if(dia>=23){
			System.out.println("Su signo Zodiacal es Capricornio");
		}
		else{
		     System.out.println("Su signo Zodiacal no es Capricornio");
			}
	}
	if(mes==10){
		if(dia>=28){
			System.out.println("Su signo Zodiacal es Libra");
		      	
	     }
		else{
		     System.out.println("Su signo Zodiacal no es Libra");
	      }
	}
	if(mes==9){
		if(dia>=15){
			System.out.println("Su signo Zodiacal es Virgo");
		}
		else{
		     System.out.println("Su signo Zodiacal no es Virgo");
	    }
	}
	if(mes==8){
		if(dia>=24){
			System.out.println("Su signo Zodiacal es Leo");
	     }
	     else{
		  System.out.println("Su signo Zodiacal no es Leo");
		}
	}
	if(mes==7){
		if(dia>=7){
			System.out.println("Su signo Zodiacal es Cancer");
	     }
	     else{
		  System.out.println("Su signo Zodiacal no es Cancer");
	     }
	}
	if(mes==6){
		if(dia>=20){
			System.out.println("Su signo Zodiacal es Geminis");
	    }
	    else{
		 System.out.println("Su signo Zodiacal no es Geminis");
	    }
	}
	if(mes==5){
		if(dia>=13){
			System.out.println("Su signo Zodiacal es Tauro");
	      }
	       else{
		    System.out.println("Su signo Zodiacal no es Tauro");
		}
	}
	if(mes==4){
		if(dia>=20){
			System.out.println("Su signo Zodiacal Aries");
	    }
	     else{
		  System.out.println("Su signo Zodiacal no es Aries");
	    }
	}
	if(mes==3){
		if(dia>=25){
			System.out.println("Su signo Zodiacal es Aries");
	     }
	     else{
		  System.out.println("Su signo Zodiacal no es Aries");
	     }
	}
	if(mes==2){
		if(dia>=27){
			System.out.println("Su signo Zodiacal es Piscis");
	    }
	    else{
		System.out.println("Su signo Zodiacal no es Piscis");
	    }
	}
	if(mes==1){
		if(dia>=29){
			System.out.println("Su signo Zodiacal es Acuario");
	      }
	      else{
		   System.out.println("Su signo Zodiacal no es Acuario");
	      }
	}
}
}