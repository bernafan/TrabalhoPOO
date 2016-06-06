/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mercado;
import Mercado.Funcionario.Funcionario;
/**
 *
 * @author bfmel
 */
public class demo {
    public static void main(String[] args) {
        //AddGerente.main(args);
        Produto p1 = new Produto("laranja", (float) 1.53);
        Gerente g1 = new Gerente("Berna", 01);
        g1.setValorProduto(p1, (float) 1.0);
        System.out.println(p1);
        Funcionario f1 = new Funcionario("Luiz", 01);
        f1.setValorProduto(p1, (float) 2.0);
        System.out.println(p1);
    }
}
