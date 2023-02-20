package com.mycompany.eva1_6_automovil;

public class carro {
     private String marca;
     private String placas;
     private String modelo;
     private String dueno;
     private int ano;
     
     public carro (){
         marca = "";
         placas = "";
         dueno = "";
         ano = 0;
     }
     public String getmarca(){
        return marca;
    }
          public void setmarca(String valor){//SET
        marca = valor;
    }
      public String getmodelo(){
        return modelo;
    }
       public void setmodelo(String valor){//SET
        modelo = valor;
    }
     public String getplacas(){
        return placas;
    }
       public void setplacas(String valor){//SET
        placas = valor;
    }
     public String getdueno(){
        return dueno;
    }
       public void setdueno(String valor){//SET
        dueno = valor;
    }
       public int getano(){
           return ano;
           
       }
       public void setano(int valor){//SET
        ano = valor;
}
       public void imprimirdatos(){
        System.out.println("marca:    "+ marca  );
        System.out.println("modelo:     " + modelo);
        System.out.println("placas:    " + placas );
        System.out.println("dueno:    " + dueno );
        System.out.println("ano:    " + ano );
}
              public void Adeudo(){
           if (ano<2000){
               System.out.println("adeudo de 1500$");
               
            }else {
               if ((ano>=2001)&&(ano<=2005)){
                    System.out.println("adeudo de 2000$");
                }else{
                        if((ano>=2006)&&(ano<=2010)){
                                System.out.println("adeudo de 2500");
                        }else{
                                if ((ano>=2011)&&(ano<=2015)){
                                    System.out.println("adeudo de 3000");
                                }else{
                                    if ((ano>=2016)&&(ano<=2023)){
                                        System.out.println("adeudo de 4000");
                                    }
                                }
                                        
                                }
       }
}
}
}
