class Main {
    public static void main(String[] args) {
     for(int i=0; i<5; i++ ){
       System.out.println("for döngüsü" + (i+1) + ".tur nurcan çek");
     }
  
      int sayac=0;
      while(sayac<5){
        System.out.println("while döngüsü" + (sayac+1) + ".tur nurcan çek");
      sayac++;
    }    
      int sayac2=0;
      do{
        System.out.println("do while döngüsü: " + (sayac2+1) + ".tur nurcan çek");
       sayac2++;
      }while(sayac2<5);
    }
  }