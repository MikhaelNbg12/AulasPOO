package Quadrado;

public class Quadrado {

    double lado,area,perimetro;

    Quadrado (double lado){
        this.lado = lado;
    }
    void calculoArea(){
    if (lado > 0){
        area = lado * lado;
        System.out.println("A área é: "+area);
    } else{
        System.out.println("Não é possível fazer cálculo com esse valor");
        }
    }

    void calculoPerimetro(){
    if (lado > 0 ){
        perimetro = lado * 4;
        System.out.println("O perimetro é: "+perimetro);
    }
        else{
        System.out.println("Não é possível fazer cálculo com esse valor");
        }
    }
    }

