import java.util.Scanner;
import javax.swing.JOptionPane;

public class MB_Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("--------------BIENVENIDO!!----------------------");
        System.out.println("-Este es el programa de METODOS DE BUSQUEDA!!!!-");
        System.out.println("------------------------------------------------");
        System.out.println("1.- Búsqueda Secuencial");
        System.out.println("------------------------------------------------");
        System.out.println("2.- Búsqueda Binaria");
        System.out.println("3.- Salir :/ ");
        int Chosse = sc.nextInt();
        
        do {
            switch(Chosse) {
                case 1: 
                    int ArraySecuencial [] = new int [5];
                    ArraySecuencial[0] = (int)(Math.random() * 10);
                    ArraySecuencial[1] = (int)(Math.random() * 10);
                    ArraySecuencial[2] = (int)(Math.random() * 10);
                    ArraySecuencial[3] = (int)(Math.random() * 10);
                    ArraySecuencial[4] = (int)(Math.random() * 10);   

                    System.out.println("");
                    System.out.println("----------------------------");
                    System.out.println("--Los datos son:--");
                    System.out.println("----------------------------");
                    PrintArragement(ArraySecuencial);

                    int SearchData = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el dato que deseas buscar! "));
                    int JustSearch = SecuentialSearch(ArraySecuencial, SearchData);

                    if (JustSearch != -1) {
                        JOptionPane.showMessageDialog(null, "El dato ingresado esta en la pocision: " + JustSearch);
                    } else {
                        JOptionPane.showMessageDialog(null, "DATO NO ENCONTRADO :/ ");
                    }
                    break;

                case 2: 
                    int BinaryEnglish [] = new int [5];
                    BinaryEnglish[0] = (int)(Math.random() * 10);
                    BinaryEnglish[1] = (int)(Math.random() * 10);
                    BinaryEnglish[2] = (int)(Math.random() * 10);
                    BinaryEnglish[3] = (int)(Math.random() * 10);
                    BinaryEnglish[4] = (int)(Math.random() * 10);

                    System.out.println("");
                    System.out.println("----------------------------");
                    System.out.println("--Los datos son:--");
                    System.out.println("----------------------------");
                    PrintArragement(BinaryEnglish); 
                    System.out.println("QuickSort Method");
                    QuickMethod(BinaryEnglish, 0, 9); 
                    System.out.println("Impresión");
                    PrintArragement(BinaryEnglish); 

                    int SearchData1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el dato que deseas buscar! "));
                    int JustSearch1 = BinarySearch(BinaryEnglish, SearchData1);

                    if (JustSearch1 != -1) {
                        JOptionPane.showMessageDialog(null, "El dato ingresado esta en la pocision: " + JustSearch1);
                    } else {
                        JOptionPane.showMessageDialog(null, "DATO NO ENCONTRADO :/ ");
                    }

                    break;
            }
            
        } while (Chosse == 3);
    }
    private static int SecuentialSearch(int Array[], int Data) { 
        System.out.println("");
        for (int i = 0; i < 10; i++){
            if(Data == Array[i]) {
                return i;
            }
        }
        return -1;
    }
    
    private static int BinarySearch(int Array[], int Data) {
        int Mid, FirstOne, LastOne, Mid1;
        FirstOne = 0;
        LastOne = Array.length-1;       
        System.out.println("");
        
        while (FirstOne <= LastOne) {
            Mid = (FirstOne + LastOne) / 2;
            Mid1 = Array[Mid];
               
            if (Data == Mid1) {
                return Mid;
            } else if (Data < Mid1) {
                LastOne = Mid -1;
            } else {
                FirstOne = Mid +1; 
            }       
         }
        return -1;
    }
   
    public static void PrintArragement(int Array[]){
        System.out.println("");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i] + " ");
        }
        System.out.println("");
    }
    
    public static void QuickMethod(int Array[], int Right, int Left) {
        int Pivot = Array[Left];
        int i = Left;
        int j = Right;
        int swap;
                      
        while (i < j) {
            while (Array[i] <= Pivot && i < j) {
                i++;
            }
            while (Array[j] > Pivot) {
                j--;
            }
            
            if (i < j) {
                swap = Array[i];
                Array[i] = Array[j];
                Array[j] = swap;            
                PrintArragement(Array);
            } 
        }
        Array[Left] = Array[j];
        Array[j] = Pivot;
        
        if (Left < j -1) {
            QuickMethod(Array, Left, j -1);
        }
        if (j + 1 < Right) {
            QuickMethod(Array, j + 1, Right);
        }      
    }
}