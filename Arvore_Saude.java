import java.util.Scanner;
public class Arvore_Saude
{   
    //code by Gustavo Zirger
    public static String classificar(double temperatura,int idade,String fumante,double peso,String tosse){
          if(temperatura>=37){
              if(fumante.equalsIgnoreCase("sim")){
                  return "Doente";
              }
              else if(tosse.equalsIgnoreCase("sim")){
                  return "Doente";
              }
              else {
                  return "Saudável";
              }
          }
          else if(idade<18){
              return "Saudável";
          }
          else if(peso>=180.78){
              return "Doente";
          }
          else if(tosse.equalsIgnoreCase("sim")){
              return "Doente";
          }
          else{
              return "Saudável";
          }
    }
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
            
            System.out.println("Bem vindo ao Hospital Causas Perdidas.");
            System.out.println("Preencha os campos seguintes:");
            
                System.out.println("Sua idade:");
                 int idade = ler.nextInt();
                     if(idade<0){
                         System.out.println("Idade inválida, insira um valor válido.");
                          idade = ler.nextInt();
                     }
                System.out.println("Sua temperatura:");
                 double temp = ler.nextDouble();
                     if(temp<0){
                         System.out.println("Temperatura inválida, insira um valor válido.");
                          temp = ler.nextDouble();
                     }
                System.out.println("Seu peso:");
                 double peso = ler.nextDouble();
                     if(peso<0){
                         System.out.println("Peso inválido, insira um valor válido.");
                          peso = ler.nextDouble();
                     }
                 ler.nextLine(); //limpeza de buffer
                System.out.println("Fumante?");
                 String smoker = ler.nextLine();
                System.out.println("Tosses?");
                 String tosse = ler.nextLine();
                 
                 String saude = classificar(temp,idade,smoker,peso,tosse);//passar pela classificação
                
                System.out.println("Você esta: "+saude);       
    }
}
