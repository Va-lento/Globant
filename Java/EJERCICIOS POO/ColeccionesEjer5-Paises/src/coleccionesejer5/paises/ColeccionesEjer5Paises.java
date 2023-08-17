    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejer5.paises;

/**
 *
 * @author Valentin
 */
public class ColeccionesEjer5Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PaisService paiService = new PaisService();
       
       paiService.cargarPaises();
        System.out.println("------------------");
        paiService.mostrarPaises();
        System.out.println("------------------");
        paiService.mostrarPaisesOrdenados();
        System.out.println("------------------");
        
        
        
        
        
        
    }
    
}
