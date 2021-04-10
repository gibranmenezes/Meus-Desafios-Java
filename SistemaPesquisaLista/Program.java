package SistemaPesquisaLista;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Path: ");
        ListFactoring lf = new ListFactoring(sc.nextLine());

        SearchLanguage sl = new SearchLanguage(lf.makeList());

        //System.out.println(lf.getList());
        System.out.println();

        System.out.print("Enter the Language: ");
        sl.lang = new Language(sc.nextLine());

        System.out.println("O item " + sl.lang + " apareceu " + sl.times() + " vezes.");

        sc.close();
    }
}
