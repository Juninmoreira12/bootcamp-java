public class Usuario {
    public static void main(String[] args) throws Exception {
     
        SmartTv  smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("A TV está no canal: " +smartTv.canal); 

        smartTv.mudarCanal(13);

        System.out.println("A TV está no canal: " +smartTv.canal); 

        System.out.println("A TV está no volume: " +smartTv.volume);
        
        System.out.println("A TV está ligada? " + smartTv.ligada); 
        System.out.println("A TV está no volume: " +smartTv.volume);   

        smartTv.ligar ();
        System.out.println("Novo status ->  " + smartTv.ligada);   

        smartTv.desligar ();
        System.out.println("Novo status ->  " + smartTv.ligada);   


    }
}
