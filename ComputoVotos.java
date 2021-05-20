//Clase hija de la clase madre llamada 
package poo;
import poo.llamada;
     public class ComputoVotos extends Votaciones_ProfaYadira {
        public ComputoVotos (int Acuamarino, int Blanco, int Morado, String[] partidos){
            this.a = Acuamarino;
            this.b = Blanco;
            this.m = Morado;  
            this.part = partidos;
            String part[]= {"Partido MORADO","Partido ACUAMARINO","Partido BLANCO"};
        }
        
     public void PartidoGanador(){
         int votosTot = a+b+m;
            int porcentaje = 100 / votosTot;
            int porcentajeAcuamarino = porcentaje * a;
            int porcentajeBlanco = porcentaje * b;
            int porcentajeMorado = porcentaje * m;
            float porcentajes[] = {porcentajeAcuamarino, porcentajeBlanco, porcentajeMorado};	
             
                if ((m > a) && (m > b)){
                System.out.print("\nEl " + part[0] + " es el ganador" 
						+ "\nEl numero de votos para este partido es: " 
						+ m 
						+ "\nEl porcentaje correspondiente para este partido "
						+ "\ncorresponde al:" +  porcentajeMorado 
						+ "%\n_____________________________________________\n");
                }
                else if ((a > b) && (a > m)){
                System.out.print("\nEl " + part[1] + " es el ganador" 
						+ "\nEl numero de votos para este partido es: " 
						+ a 
						+ "\nEl porcentaje correspondiente para este partido "
						+ "\ncorresponde al:" + porcentajeAcuamarino 
						+ "%\n_____________________________________________\n");
                }
                else if ((b > a) && (b > m)){
                System.out.print("\nEl " + part[2] + " es el ganador" 
						+ "\nEl numero de votos para este partido es: " 
						+ b 
						+ "\nEl porcentaje correspondiente para este partido "
						+ "\ncorresponde al:" + porcentajeBlanco 
						+ "%\n_____________________________________________\n");
                }
                 else if((m == a) && (m > b)){
                System.out.print("\nEl " +  part[0] + " esta   en   un  empate   con" 
						 + "\nel partido " + part[1]  
						 + ", los resultados  son los siguientes :"
						 + "\nnumero de votos para " + part[0] + " :" 
						 + m + " que  equivalen al " + porcentajeMorado
						 + "%\nel porecentaje y numero de votos para " + part[1] 
						 + " es el mismo.\n"
						 + "\nNumero de votos para " + part[2] 
						 + " es " + b
						 + "\nEl porcentaje correspondiente para este partido es " 
						 +  porcentajeBlanco
						 + "%\n_____________________________________________________\n"); 
                        }
                else if((m == b) && (m > a)){
                System.out.print("\nEl " +  part[0] + " esta   en   un  empate   con" 
						 + "\nel partido " + part[2]  
						 + ", los resultados  son los siguientes :"
						 + "\nnumero de votos para " + part[0] + " :" 
						 + m + " que  equivalen al " + porcentajeMorado
						 + "%\nel porecentaje y numero de votos para " + part[2] 
						 + " es el mismo.\n"
						 + "\nNumero de votos para " + part[1] 
						 + " es " + a
						 + "\nEl porcentaje correspondiente para este partido es " 
						 +  porcentajeAcuamarino
						 + "%\n_____________________________________________________\n");
                }
                else if((b == a) && (b > m)){
                System.out.print("\nEl " +  part[2] + " esta   en   un  empate   con" 
						 + "\nel partido " + part[1]  
						 + ", los resultados  son los siguientes :"
						 + "\nnumero de votos para " + part[2] + " :" 
						 + b + " que  equivalen al " + porcentajeBlanco
						 + "%\nel porecentaje y numero de votos para " + part[1] 
						 + " es el mismo.\n"
						 + "\nNumero de votos para " + part[0] 
						 + " es " + m
						 + "\nEl porcentaje correspondiente para este partido es " 
						 +  porcentajeMorado
						 + "%\n_____________________________________________________\n");   
                }                               
                else if((b == m) && (b == a)){
                System.out.print("\nLos "+part[0]+", "+part[1]+" y "+part[2]+" estan en un empate"
                                        + ".\nCon un numero de votos"
                                        + " igual a: "+b+ " y un porcentaje de: \n"+porcentajeBlanco+"% cada uno"+
                                        "\n_____________________________________________________\n"); 
                }
                
            }
        }
     
     
                        
            
	    
     
         
 
     
    /* int votosTot = a+b+m;
         int porMorado= (m*100)/votosTot;
         System.out.print(porMorado + "%");
         System.out.print(m);
         if (m>b && a<m) {
             System.out.println("El partido ganador es: " + part[0] );
         
}
     




	
	