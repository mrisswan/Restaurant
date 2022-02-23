/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;
import java.util.Scanner;
public class Restaurant {

    public static void main(String[] args) {
        
        String[] menu = {"Nasi goreng","Nasi mawut","Mie goreng","Mie Rebus"};
        int[] harga = {9000,10000,8000,8500};
        
        System.out.println("Selamat Datang");
        
        for (int i = 0; i<harga.length; i++){
            System.out.println(i +"."+menu[i]+" = "+ harga[i]);
        }
        
        System.out.print("Masukkan nnomor menu ");
        Scanner Input = new Scanner(System.in);
        int pilihan = Input.nextInt();
        
        System.out.println("input pilihan = "+menu[pilihan]);
        
        System.out.print("Masukkan uang anda ");
        int uang = Input.nextInt();
        
        if (uang >harga[pilihan]){
            System.out.println("Kembalian = "+ (uang-harga[pilihan])+" Terima Kasih Silahkan Menikmati");
        }else if(uang == harga[pilihan]){
            System.out.println("Uang anda pas, silahkan menikmati");
        }else{
            System.out.println("Mohon maaf uang anda kurang "+(harga[pilihan]-uang));
        }
        
    }
    
}
