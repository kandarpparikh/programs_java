/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defiee_helman;

import java.math.*;

/**
 *
 * @author kandarp
 */
public class Defiee_helman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigInteger p,g,a ,b,mi,x,n,k,q,pow,ans,ac,bc,j;
        p=new BigInteger("23");
        a=new BigInteger("3");
        g=new BigInteger("7");
        b=new BigInteger("6");
         x=new BigInteger("71");
          n=new BigInteger("100");
          k=new BigInteger("17");
          q=new BigInteger("21");
          pow=new BigInteger("22");
           ac=new BigInteger("37");
          bc=new BigInteger("60");
          //q=new BigInteger("21");
          
          
         BigInteger alice,bob,finalkey,finalkey2;
        alice=g.modPow(a,p);
        System.out.println("Alice generated :"+alice);
        
        bob=g.modPow(b, p);
        System.out.println("bob generated :"+bob);
        finalkey=alice.modPow(b, p);
        finalkey2=bob.modPow(a, p);
        System.out.println("finalkey generated :"+finalkey);
        System.out.println("finalkey2 generated :"+finalkey2);
        mi=x.modInverse(n);
        ans=k.modPow(pow, q);
        j= ac.modInverse(bc);
        System.out.println("inverse is :"+mi);
        System.out.println("ans is :"+j);
        
        
    }
    
}
