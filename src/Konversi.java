/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Temperatur;

public class Konversi {

    double celcius;
    double fahrenheit;
    double reamur;
    double kelvin;
    String kondisiAir;

    Konversi(double suhu){
        celcius = suhu;
        fahrenheit = ((9 * celcius) / 5) + 32;
        reamur = (4 * celcius/5);
        kelvin = (celcius + 273.15);
        if(suhu < 0){
            kondisiAir = "*Kondisi Air Beku*";
        }else if(suhu>0 && suhu<100){
            kondisiAir = "*Kondisi Air Normal*";
        }else{
            kondisiAir = "*Kondisi Air Mendidih*";
        }
    }


}
