//Criar  um  programa  que  leia  3  valores  A,  B  e  C  para  um  possível  triângulo  e  informe  o  tipo  de triângulo lido. Verificar ainda se as medidas formam um triângulo segundo a lei: -Para que se possa formar um triângulo é necessário que a medida de qualquer um dos lados seja menor que a soma das medidas dos outros dois. 
//Triângulo Eqüilátero: Três lados iguais;
//Triângulo Escaleno: Três lados diferentes;
//Triângulos Isósceles: Dois lados iguais e um lado diferente.


package seSenao;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        double x, y, z;
        
        System.out.println("Digite o tamanho do primeiro lado:");
        x = in.nextDouble();
        System.out.println("Digite o tamanho do segundo lado:");
        y = in.nextDouble();
        System.out.println("Digite o tamanho do terceiro lado:");
        z = in.nextDouble();
        

        
        if (x < (y + z) || y < (x + z) || z < (x + y)) {
            
            if (x == y && y == z) {
                System.out.println("Essas medidas formam um triângulo Equilátero.");
            } else if (x != y && y != z && z != x) {
                System.out.println("Essas medidas formam um triângulo Escaleno.");
            } else {
                System.out.println("Essas medidas formam um triângulo Isósceles.");
            }

        } else {
            System.out.println("Essas medidas não são capazes de formar um triângulo.");
        }
        in.close();
	}

}
