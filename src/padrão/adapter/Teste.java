/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrão.adapter;

import padrão.adapter.Adapter.AdapterTomada;
import padrão.adapter.Adapter.TomadaDeTresPinos;

/**
 *
 * @author aluno
 */
public class Teste {
    
    
        public static void main(String args[]) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();
         
        AdapterTomada a = new AdapterTomada(t3);
        a.ligarNaTomadaDeDoisPinos();
    
    
}
