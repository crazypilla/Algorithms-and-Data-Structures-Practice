/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mergesortedlists;

/**
 *
 * @author Harshita V
 */
public class MERGESORTEDLISTS {

    /**
     * @param args the command line arguments
     */
    public static int[] merge(int[] first, int[] second, int[] result){
    
    int ifirst=0;
    int isec=0;
    int j=0;
    while(ifirst<first.length&&isec<second.length){
    if(first[ifirst]<second[isec]){
    result[j]=first[ifirst]; 
    ifirst++;
    
    }
    else{result[j]=second[isec];
    
    isec++;
    }
    j++;
    
    }
    
    System.arraycopy(first,ifirst,result,j,first.length-ifirst);
   System.arraycopy(second,isec,result,j,second.length-isec);
    return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] first={1,3,6,9};
        int[] second={2,5,7,8,10,11};
        int[] result=new int[first.length+second.length];
        result=merge(first,second,result);
        for(int i=0;i<result.length;i++)System.out.println(result[i]);
    }
    
}
