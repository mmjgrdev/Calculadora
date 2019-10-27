package di.xml.main;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.xml.interfaces.ICalculadora;

public class AppCalculadora {
	
	public static void menu() {
		System.out.println("\nCALCULADORA\n");
		System.out.println("Sumar - s");
		System.out.println("Restar - r");
		System.out.println("Multiplicar - m");
		System.out.println("Dividir - d");
		System.out.println("Finalizar - f");
	}

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("di/xml/application-context/applicationContext.xml");
		
		//ICalculadora icalculadora = context.getBean("mmcalculadora", ICalculadora.class);
		ICalculadora icalculadora;
		boolean continuar = true;
		char opcion=' ';
		double n1=0.0, n2=0.0;
		Scanner sc = new Scanner(System.in);
		double res = 0.0;
		while(continuar) {
			do {
				menu();
				opcion = sc.next().charAt(0);
			}while(opcion!='s' && opcion!='r' && opcion!='m' && opcion!='d' && opcion!='f');
			if(opcion!='f') {
				System.out.println("n1?");
				n1=sc.nextDouble();			
				System.out.println("n2?");
				n2=sc.nextDouble();			
				icalculadora = context.getBean("mmcalculadora", ICalculadora.class);			
				switch(opcion) {
					case 's': res = icalculadora.sumar(n1, n2); break;
					case 'r': res = icalculadora.restar(n1, n2); break;
					case 'm': res = icalculadora.multiplicar(n1, n2); break;
					case 'd': res = icalculadora.dividir(n1, n2); break;
				}
				System.out.println("Resultado: "+res);			
			}
			else {
				continuar=false;
			}
		}
		/*
		System.out.println(icalculadora.toString());
		
		System.out.println(icalculadora.sumar(5,7));
		System.out.println(icalculadora.restar(5, 7));
		System.out.println(icalculadora.multiplicar(5,7));
		System.out.println(icalculadora.dividir(5, 7));
		System.out.println(icalculadora.dividir(1, 0.0));
		*/
		
	}

}
