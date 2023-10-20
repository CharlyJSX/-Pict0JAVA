class JAVA {
    public static void main(String[] args) {
        // Variables
/* 
        String nombre = "Ana";
        double precio = 0.95; */
   /*      int edad = 16;
        boolean mayor = (edad >= 18);
        boolean menor = false;

        if (mayor) {
        System.out.println("Eres mayor, tienes " + edad + " años de edad");
        } else if ( edad == 17) {
            System.out.println("Te falta uno");
        } else {
            System.out.println("Eres menor de edad, tienes " + edad + " años");
        } */
        int[] edades = new int[4];
        edades[0] = 17;
        edades[1] = 21;
        edades[2] = 15;
        edades[3] = 44;
        sumar1(edades);

        // String[] nombres = new String[]{"Juan", "Ana", "Pepe", "Monica"};
        
        // Loops (Bucles)
        // For-Loop


            
        // System.out.println(edades[0]);
    }
    static void sumar1(int[] edades){
        for (int i = 0; i < edades.length; i++){
        edades[i]++;
        System.out.println(edades[i]);
        }
    }
}