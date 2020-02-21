
import java.util.Scanner; //Importar modulo scaner

public class Code
{

  //Cambio 2

  //Otro cambio
  static String [][] vic = 
  {{
    "Victoria Usuario",           //Array 0
    "Victoria Usuari",
    "User Wins"
  }, 
  {
    "Victoria Máquina",           //Array 1
    "Victoria de la Màquina",
    "Machine Wins"
  },
  {
    "Empate",                     //Array 2
    "Empat",
    "Tie"
  },
  {
    "Has ganado a la máquina.",   //Array 3
    "Has guanyat a la màquina.",
    "You win vs the IA"
  },
  {
    "La máquina te ha ganado",    //Array 4
    "La màquina te ha guanyat",
    "The IA wins you"
  }
};
  static String [][] tir =
  {{
    "Tirada Usuario",
    "Tirada Usuari",
    "User roll"
  },
  {
    "Tirada Máquina",
    "Tirada de la Màquina",
    "Machine roll"
  }
  };
  static String [] error =
  {
    "Introduzca un valor entre 1, 2 ó 3.",
    "Introdueix un valor entre 1, 2 o 3.",
    "Introduce a value between 1, 2 or 3."
  };
  static String [] ingles = 
  {
    "1 - Rock", 
    "2 - Paper", 
    "3 - Scissors"
  };

  static String [] catala = 
  {
    "1 - Pedra", 
    "2 - Paper", 
    "3 - Estisores"
  };

  static String [] castellano = 
  {
    "1 - Piedra", 
    "2 - Papel", 
    "3 - Tijeras"
  };

  static String [] instesp = /* instrucciones castellano */
  {
    "Instrucciones: Bienvenido/a a Piedra Papel Tijeras", 
    " - El objetivo es vencer al oponente seleccionando la herramienta que gana, segun las siguientes reglas:", 
    " - La piedra aplasta la tijera", 
    " - La tijera corta el papel", 
    " - El papel envuelve la piedra", 
    " - En caso de empate se juega otra vez. Y se jugara al mejor de 3 partidas, el que gane dos, sera el campeon/a. En caso de empate se jugara el desempate hasta que salga un vencedor/a."
  };
        
  static  String [] instcat = /* instrucciones catalan */
  {
    "Instruccions: Benvingut/a a Pedra Paper Tisores", 
    " - L'objectiu és vèncer a l'oponent seleccionant l'eina que gana, segons les següents regles:", 
    " - La pedra aixafa la tisora", 
    " - La tisora talla el paper", 
    " - El paper embolica la pedra", 
    " - En cas d'empat es juga una altra vegada. I es jugués al millor de 3 partides, el que guanyi dues, sàrria el campió/a. En cas d'empat es jugués el desempat fins que surti un vencedor/a."
  };
        
  static  String [] insteng = /* instrucciones ingles */
  {
    "Instructions: Welcome Stone Paper Scissors", 
    " - The objective is to defeat the opponent by selecting the tool that wins, according to the following rules:", 
    " - The stone crushes the scissors", 
    " - The scissors cuts the paper", 
    " - The paper envelops the stone", 
    " - In case of a tie, it is played again. And the best of 3 games will be played, whoever wins two will be the champion. In case of a tie, the tiebreaker will be played until a winner comes out."
  };

  public static int vm = 0;     //Valor default
  public static int vu = 0;     //Valor default
  public static int emp = 0;    //Valor default
  public static int empate = 0; //Valor default


//-----------------------------------------------------------------------------------------------------------------------------------------------------------
    static void Tiradas(int tu, int opcion) //Funcion para clacular el ganador de la tirada
    {
        int tm = (int) (3 * Math.random()); //valor random para tirada maquina

      /*La variable "resto" se encarga de mirar si ha ocurrido un empate en la ronda*/
      int resto = (tu - 1) - tm;
      empate = 0;

      System.out.println(tir[1][opcion - 1] + " " + (tm + 1)); //Mostramos el valor de la máquina 
                                                               //Sumamos uno para la equivalencia con el valor de usuario.

      System.out.println(tir[0][opcion - 1] + " " + tu);       //Mostramos el valor del usuario
      
      /*Estos switch se encargan de averiguar cuál es el resultado.
      El primero se encarga únicamente del caso de empate utilizando la variable resto.*/
      switch (resto)
      {
        case 0:
          emp++;
          System.out.println(vic[2][opcion - 1]);
          break;

        default:
          break;
      }

      /*El segundo se encarga de comprobar los casos posibles según la tirada del usuario,
      mirando para cada valor de "tu" el valor de "tm" sacado y la acción pertinente.*/      
      switch (tu - 1)
      {
        case 0:
          if (tm == 1)
          {
            vm++;
            System.out.println(vic[1][opcion - 1]);
          }
          if (tm == 2)
          {
            vu++; 
            System.out.println(vic[0][opcion - 1]);
          }
          break;

        case 1:
          if (tm == 2)
          {
            vm++;
            System.out.println(vic[1][opcion - 1]);
          }
          if (tm == 0)
          {
            vu++;
            System.out.println(vic[0][opcion - 1]);
          }
          break;

        case 2:
          if (tm == 0)
          {
            vm++;
            System.out.println(vic[1][opcion - 1]);
          }
          if (tm == 1)
          {
            vu++;
            System.out.println(vic[0][opcion - 1]);
          }
          break;
        default:
            System.out.println(error[opcion - 1]);
        break;
      }    
    }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------
                    
    public static void main(String[] args) 
    {
        int tu = 0; //valor default para tirada usuario

       Scanner sn = new Scanner(System.in); //Nuevo Scanner
       
         
           System.out.println("1. Castellano");
           System.out.println("2. Catala");
           System.out.println("3. English");
           System.out.println("4. Salir/Sortir/Exit");
           System.out.println(); //Imprimir linea en blanco

           System.out.println("Escoge una / Escull una / Choose one");
           System.out.println("----------------------------------------------------------------"); //Imprimir separador

           int opcion = sn.nextInt(); //Scanner para elegir idioma
        
        switch(opcion - 1)
        {
//--------------------------------------------------------------------------------------------------------------------------------------------------            
            case 0:  
            for (int i = 0; i < instesp.length; i++)
            {
              System.out.println("\n");
              System.out.println(instesp[i]);
            }

            System.out.println("----------------------------------------------------------------"); //Imprimir separador   

               while (vm < 3 && vu < 3) //Bucle mientras usuario y maquina no supere los puntos
               {
                    for (int i = 0; i < castellano.length; i++)
                    {
                      System.out.println("\n");
                      System.out.println(castellano[i]);
                    }

                    System.out.println();

                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu default"); //debug de codigo
                   //System.out.println("----------------------------------------------------------------");

                   tu = sn.nextInt(); //Scaner usuario introduce valor 
                   System.out.println();
                   //System.out.println(tu + " " + "valor tu guardado"); //debug de codigo
                   System.out.println("----------------------------------------------------------------");

                   Tiradas(tu, opcion); //Llama a funcion Tiradas, pasando la variable tu
                   System.out.println();
                   System.out.println(vm + " " + vic[1][opcion - 1] + " | " + vu + " " + vic[0][opcion - 1] + " | " + emp + " " + vic[2][opcion - 1]); //resultado
                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu despues de invocar Tiradas"); //debug de codigo
               }
            break;
//--------------------------------------------------------------------------------------------------------------------------------------------------
            case 1:  
            for (int i = 0; i < instcat.length; i++)
            {
              System.out.println("\n");
              System.out.println(instcat[i]);
            }

            System.out.println("----------------------------------------------------------------"); //Imprimir separador   

               while (vm < 3 && vu < 3) //Bucle mientras usuario y maquina no supere los puntos
               {
                    for (int i = 0; i < catala.length; i++)
                    {
                      System.out.println("\n");
                      System.out.println(catala[i]);
                    }

                    System.out.println();

                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu default"); //debug de codigo
                   //System.out.println("----------------------------------------------------------------");

                   tu = sn.nextInt();//Scaner usuario introduce valor 
                   System.out.println();
                   //System.out.println(tu + " " + "valor tu guardado"); //debug de codigo
                   System.out.println("----------------------------------------------------------------");

                   Tiradas(tu, opcion);//Llama a funcion Tiradas, pasando la variable tu
                   System.out.println();
                   System.out.println(vm + " " + "Victoria maquina" + " | " + vu + " " + "Victoria usuari" + " | " + emp + " " + "Empat"); //resultado
                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu despues de invocar Tiradas"); //debug de codigo
               }
            break;
//--------------------------------------------------------------------------------------------------------------------------------------------------
            case 2:

            for (int i = 0; i < insteng.length; i++)
            {
              System.out.println("\n");
              System.out.println(insteng[i]);}

            System.out.println("----------------------------------------------------------------"); //Imprimir separador   

               while (vm < 3 && vu < 3) //Bucle mientras usuario y maquina no supere los puntos
               {
                    for (int i = 0; i < ingles.length; i++)
                    {
                      System.out.println("\n");
                      System.out.println(ingles[i]);
                    }

                    System.out.println();

                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu default"); //debug de codigo
                   //System.out.println("----------------------------------------------------------------");

                   tu = sn.nextInt();//Scaner usuario introduce valor 
                   System.out.println();
                   //System.out.println(tu + " " + "valor tu guardado"); //debug de codigo
                   System.out.println("----------------------------------------------------------------");

                   Tiradas(tu, opcion);//Llama a funcion Tiradas, pasando la variable tu
                   System.out.println();
                   System.out.println(vm + " " + "The machine wins" + " | " + vu + " " + "The user wins" + " | " + emp + " " + "Tie"); //resultado
                   System.out.println("----------------------------------------------------------------");
                   //System.out.println(tu + " " + "valor tu despues de invocar Tiradas"); //debug de codigo
                }
              
            break;
//--------------------------------------------------------------------------------------------------------------------------------------------------
            case 3: 
                System.out.println("Exit");
                System.exit(0);
            break;
          
    }
      if (vm == 3)
      {
        System.out.println("\n");
        System.out.println(vic[4][opcion - 1]);
        System.out.println("\n");
      }
      else
      {
        System.out.println("\n");
        System.out.println(vic[3][opcion - 1]);
        System.out.println("\n");
      }       
  }
}
