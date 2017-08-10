
package tarea3_201513677;
  
    import java.util.Scanner;

public  class Menu {
    public int opciones;
    public String[] Usuarios;
    public String NUsuario;
    
    public Menu(){
        opciones = 0;
        NUsuario = "";  
        Usuarios = new String[5];
        
        do {
            System.out.println("           Tarea3           ");
            System.out.println("         201513677          ");
            System.out.println(" 1. Usuarios                ");
            System.out.println(" 2. Palabras Palíndromas    ");
            System.out.println(" 3. Salir                   ");            
            Scanner leer = new Scanner(System.in);
            opciones = leer.nextInt();
            switch(opciones){
                case 1:
                    MenuUs();
                    break;
                case 2:
                    PalbrasPalindromas();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        } while (opciones != 3);
    }
    private void MenuUs(){
        System.out.println("            Menu de Usuarios             ");
        System.out.println(" 1. Ingresar Usuarios                    ");
        System.out.println(" 2. Mostrar todos los Usuarios           ");
        System.out.println(" 3. Mostrar un Usuario Personalizado     ");
        System.out.println(" 4. Menú Principal                       ");
        System.out.println(" 5. Salir                                ");
        Scanner opcUs = new Scanner(System.in);
        opciones = opcUs.nextInt();
        do {
            switch(opciones){
                case 1:
                    IngresarU();
                    break;
                case 2:
                    MostrarU();
                    break;
                case 3:
                    UsuarioP();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            
        } while (opciones != 4);
    }

    public void IngresarU(){
        for (int i = 0; i < Usuarios.length; i++) {
            System.out.println("Ingrese un nuevo usuario: ");
            Scanner us = new Scanner(System.in);
            NUsuario = us.nextLine();
            Usuarios[i]= NUsuario;
                
            }
        MenuUs();
    }
    public void MostrarU(){
        for (int i = 0; i < Usuarios.length; i++) {
            System.out.println((i+1)+". "+Usuarios[i]);            
        }
        MenuUs();
    }
    public void UsuarioP(){
  
        System.out.println("Ingrese un Usuario: ");
        Scanner usper = new Scanner(System.in);
        NUsuario = usper.nextLine();
        for (int i = 0; i < Usuarios.length; i++) {
            
            if (Usuarios[i].equals(NUsuario)) {
                System.out.println("Usuario");
                System.out.println(Usuarios[i]);

            } else {
                System.err.println("!!Error!! no existes el Usuario");
                
            }    
        }
        
        
        MenuUs();
    }
    public void PalbrasPalindromas(){
    
        String palabra;
            
        Scanner sc = new Scanner(System.in);
        System.out.println("*************Palabras Palindromas***************");
        System.out.println("              Ingrese palabra                  ");
        palabra = sc.nextLine();
        System.out.println("");
        if(comparacionpalindroma(palabra)){
            System.out.println(" ''''''''' SI ES PALINDROMA '''''''''   ");   
        }else{
            System.out.println(" ''''''''' NO ES PALINDROMA '''''''''   ");
        }

     }
    
    public static boolean comparacionpalindroma(String palab){
        
         String aux="";
        int n = palab.length();
        for(int i = 0; i < n; i++){
            if(!(palab.substring(i,i + 1).equals(" ")
                    ||palab.substring(i,i + 1).equals(" ,"))){
              aux +=palab.substring(i,i + 1);
            
            }
        }
        
        n = aux.length();
        for(int i = 0; i < n /2; i++){
            if(!aux.substring(i, i + 1).equals(aux.substring(n - i - 1,n -  i))){
                return false;
            }
        }
        return true;
    }
    
}

    
    

