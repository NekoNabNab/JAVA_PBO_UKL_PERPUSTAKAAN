/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL_PBO_JAVA_PERPUS;

/**
 *
 * @author nabil
 */
public class menu extends book{
    public static void main (String [] args){
        menu print = new menu();
        print.linePage();
        print.book1();
    }
    void menu1 (){
        System.out.println("Menu ");
        System.out.println("1. Borrow");
        System.out.println("2. Return");
        System.out.println("3. Exit");
        super.linePage();
        System.out.print("Choose Menu = ");
    }
    
}
//kelas extends merupakan penerapan dari pewarisan (inheritance)
//keyword this untuk memanggil object saat ini, supaya menghindari kesalahan mengaggil pada method yang sama
//keyword super untuk memanggil pada kelas parent
