
package tarea3_201513677;
  
    import java.util.Scanner;

public final  class Menu {
    public int Opciones;
    public String[] Usuarios;
    public String NoUsuario;
    
    public Menu(){
        Opciones = 0;
        NoUsuario = "";  
        Usuarios = new String[5];
        
        do {
            System.out.println("           Tarea3           ");
            System.out.println("         201513677          ");
            System.out.println(" 1. Usuarios                ");
            System.out.println(" 2. Palabras Palíndromas    ");
            System.out.println(" 3. Salir                   ");    
            Scanner leer = new Scanner(System.in);
            Opciones = leer.nextInt();
            switch(Opciones){
                case 1:
                    MenuUs();
                    break;
                case 2:
                    PalabrasPalindromas();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion Invalida");
                    break;

            }
        } while (Opciones != 3);
    }
    private void MenuUs(){
        System.out.println("            Menu de Usuarios             ");
        System.out.println(" 1. Ingresar Usuarios                    ");
        System.out.println(" 2. Mostrar todos los Usuarios           ");
        System.out.println(" 3. Mostrar un Usuario Personalizado     ");
        System.out.println(" 4. Menú Principal                       ");
        Scanner opcUs = new Scanner(System.in);
        Opciones = opcUs.nextInt();
        do {
            switch(Opciones){
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
                default:
                    System.out.println("Opcion Invalida");
                    break;
            }
            
        } while (Opciones != 4);
    }

    public void IngresarU(){
        for (int i = 0; i < Usuarios.length; i++) {
            System.out.println("Ingrese un usuario: ");
            Scanner us = new Scanner(System.in);
            NoUsuario = us.nextLine();
            Usuarios[i]= NoUsuario;
                
            }
        MenuUs();
    }
    
    
    public void MostrarU(){
         System.out.println("         Mostrar Usuarios           ");
        for (int i = 0; i < Usuarios.length; i++) {
           System.out.println((i+1)+".------------> "+Usuarios[i]);            
        }
        MenuUs();
    }
    
    
    public void UsuarioP(){
        System.out.println("     Mostrar un Usuario Personalizado     ");
        System.out.println("              Ingrese Usuario:            ");
        Scanner usper = new Scanner(System.in);
        NoUsuario = usper.nextLine();
        for (int i = 0; i < Usuarios.length; i++) {
            
            if (Usuarios[i].equals(NoUsuario)) {
                System.out.println("          Usuario            ");
                System.out.println(Usuarios[i]);

            } else if( i+1==5) {
                System.err.println("!!Error!! no existe ningun usuario con esa coincidencia");
                
            }    
        }
        
        
        MenuUs();
    }
        
    public void PalabrasPalindromas(){
    
        String palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************Palabras Palindromas***************");
        System.out.println("              Ingrese palabra                  ");
        palabra = sc.nextLine();
        
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

    
    

