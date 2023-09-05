import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int escolha=0;

    do{
    System.out.println("Qual operação quer fazer?\n1- Soma\n2- Subtração\n3-Multiplicação\n4-Divisão\n5-exponenciação");
    escolha=scanner.nextInt();
      }while(escolha!=1&&escolha!=2&&escolha!=3&&escolha!=4&&escolha!=5);
    escolher(escolha);
    }
  

public static void escolher(int escolha){
  Scanner scanner = new Scanner(System.in);
  contas contas = new contas();
  int a=0;
  int b=1;
  
    System.out.println("valor de A");
    a=scanner.nextInt();
    System.out.println("Valor de B");
    b=scanner.nextInt();
      if(escolha==1){
        contas.soma(a,b);
      }
      else if(escolha==2){
        contas.subtracao(a,b);
      }
      else if(escolha==3){
        contas.multiplicacao(a,b);
      }
      if(escolha==4){
        contas.divisao(a,b);
      }
      if(escolha==5){
        contas.exponenciacao(a,b);
      }
      
    
  
}}
