/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa_f;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author kandarp
 */
public class RSA_f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        BigInteger m,n,p,q,phi_n,e,ct,pt,d;
        Random rnd= new Random();
        System.out.println("Enter message m :");
        m=new BigInteger(bf.readLine());
        p=BigInteger.probablePrime(495, rnd);
        q=BigInteger.probablePrime(495, rnd);
        e=BigInteger.probablePrime(495, rnd);
        n=p.multiply(q);
        System.out.println("value of p"+p);
         System.out.println("value of p"+q);
          System.out.println("value of p"+e);
          phi_n=(p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
          d=e.modInverse(phi_n);
          ct=m.modPow(e, n);
           System.out.println("value of ct"+ct);
           pt=ct.modPow(d, n);
            System.out.println("value of pt"+pt);
          
    }
    
}
