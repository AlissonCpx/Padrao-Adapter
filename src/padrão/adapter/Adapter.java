/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrão.adapter;

/**
 *
 * @author aluno
 */
public class Adapter {

public class TomadaDeDoisPinos {
    public void ligarNaTomadaDeDoisPinos() {
        System.out.println("Ligado na Tomada de Dois Pinos");
    }
}
 
public class TomadaDeTresPinos {
    public void ligarNaTomadaDeTresPinos() {
        System.out.println("Ligado na Tomada de Tres Pinos");
    }
}
 
public class AdapterTomada extends TomadaDeDoisPinos {
    private final TomadaDeTresPinos tomadaDeTresPinos;
 
    public AdapterTomada(TomadaDeTresPinos tomadaDeTresPinos) {
        this.tomadaDeTresPinos = tomadaDeTresPinos;
    }
 
    @Override
    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
}
