/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cutrod_dp;

/**
 *
 * @author Harshita V
 */
public class CutRod_DP {

    /**
     * @param args the command line arguments
     */
     public static int cut_rod(int[] p,int n)
     {
    int[] r=new int[n];
    for(int i=0;i<n;i++)
       { r[i]=Integer.MIN_VALUE;}
    r[0]=0; 
    int q;
    
    //int q=Integer.MIN_VALUE;
    for(int i=1;i<n;i++)
    {
        q=Integer.MIN_VALUE;
        for(int j=0;j<i;j++)
        { q=Math.max(q,p[j]+r[i-j-1]);
        }
        r[i]=q;
    
    }
    return r[n];
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int len=10;
        int[] weights={1,5,8,9,10,17,17,20,24,30};
        System.out.println(cut_rod(weights,len));
    }
    
}
