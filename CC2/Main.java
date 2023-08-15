class Main {
  public static void main(String[] args) {
    int a=100;
    int[ ] arreglo = new int[a];
    int[ ] pasosite = new int[2];
    pasosite[0]=1;
    pasosite[1]=0;
    
    System.out.println("Arreglo sin ordenar"); 
    for(int i=0;i<a;i++){
      arreglo[i]=(int)(Math.random()*100+1); 
      System.out.println(arreglo[i]);
    }
    
    
    long tinicial= System.currentTimeMillis();
    burbuja.realizarBurbuja(arreglo,pasosite);
    long tfinal= System.currentTimeMillis();

    System.out.println("Arreglo ordenado"); 
    for(int i=0;i<a;i++){
      System.out.println(arreglo[i]); 
    }

    System.out.println("Pasos"); 
    System.out.println(pasosite[0]);
    System.out.println("Iteraciones"); 
    System.out.println(pasosite[1]);

    System.out.println("Tiempo inicial"); 
    System.out.println(tinicial);
    System.out.println("Tiempo final"); 
    System.out.println(tfinal);
  }
}