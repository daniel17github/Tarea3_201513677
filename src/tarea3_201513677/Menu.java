
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
        //Menu principal 
        do {
            System.out.println("               TAREA.3               ");
            System.out.println(" -----------> 201513677 <----------- ");
            System.out.println(" 1. Usuarios                         ");
            System.out.println(" 2. Palabras Palíndromas             ");
            System.out.println(" 3. Salir                            ");    
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
    //Menu secundario
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
    
    //Buscar un usuario para el menu personalizado 
    
        public String buscar(String us) {
        for (int i = 0; i < Usuarios.length; i++) {
            if(Usuarios[i].equals(us)){
                return "v";
            }
           
        }
        return "f";
    }
     //Mostrar el usuario encontrado de la busqueda        
    public void UsuarioP(){
        System.out.println("  Mostrar un Usuario Personalizado  ");
        System.out.println("       Ingrese un Usuario:          ");
        Scanner usper = new Scanner(System.in);
        NoUsuario = usper.nextLine();
        if(!buscar(NoUsuario).equals("f")){
            System.out.println("          Usuario:           ");
            System.out.println(NoUsuario);
        } else{
            System.err.println("  ERROR!!!! no existe ningun usuario con esa coincidencia  ");
        }
       
        MenuUs();
    }
    
    //Opcion de palabras palindromas busqueda y mostrar las palbras        
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

    
    

