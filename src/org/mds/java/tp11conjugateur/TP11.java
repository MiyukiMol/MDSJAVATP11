package org.mds.java.tp11conjugateur;

import java.util.ArrayList;

import org.mds.java.tp11conjugateur.utils.Conjugateur;
import java.util.Scanner;

public class TP11 {
    public static void main(String[] args) {

    	String verbeEr ;		
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir le verbe 1er groupe ");
		verbeEr = sc.next(); 
		
        ArrayList<String> listVerbes = new ArrayList<String>();
            //listVerbes.add("parler");
            //listVerbes.add("aimer");
            //listVerbes.add("ajouter");
        	listVerbes.add(verbeEr);

        System.out.println(listVerbes);

        Conjugateur.conjugue(listVerbes);
      
        
		
		
    }
}