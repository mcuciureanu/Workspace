/*
 5. Se da un sir de numere ordonate crescator.
 Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
 Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
 sirul va fi definit asa, numerele sunt de exemplu.
 int[] a = {1,3,4,6,7,8,10,12,14,23};
 */

import java.util.Scanner;

public class Problema5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Hom many elements should the array have?");
        int n = in.nextInt();
        int element;
        int[] a = new int[n];

        //this for - assignment
        for(int i = 0; i < n; i++){
            System.out.print("position [" + i + "] = ");
            element = in.nextInt();

            if(i != 0){
                if(element < a[i-1]){
                    while(element < a[i-1]) {
                        System.out.print("Your number can't be less than " + a[i - 1] + "! Type again!" +
                                "\nposition [" + i + "] = ");
                        element = in.nextInt();
                    }
                }
            }

            a[i] = element;
        }

        System.out.print("Number you're searching: ");
        int searchedNum = in.nextInt();
        boolean founded = false;

        for(int i = 0; i < n; i++) {
            if(searchedNum < a[i]){
                break;
            }
            if(a[i] == searchedNum){
                founded = true;
                break;
            }
        }

        if(founded == true){
            System.out.println("\nThe number " + searchedNum + " EXISTS in the array!");
        }else{
            System.out.println("\nThe number " + searchedNum + " does NOT EXIST in the array!");
        }
    }
}
