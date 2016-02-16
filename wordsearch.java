/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordsearch;

/**
 *
 * @author Harshita V
 */
public class WordSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            char[][] grid = { 
                                    { 'a', 'b', 'c', 'd' }, 
                                    { 'e', 'f', 'g', 'h' },
                                    { 'i', 'j', 'k', 'l' }, 
                                    { 'm', 'n', 'o', 'p' } };
            String str="fkp";
            findstring(grid,str);
    }
    public static void findstring(char[][] grid,String str)
    {
    
    
    if(grid==null){System.out.println("empty board");}
    for(int i=0;i<grid.length;i++)
    {for(int j=0;j<grid[i].length;j++)
    { for(int k=0;k<8;k++)
        
       {
            if((stringfound(grid,str,i,j,k)))
            {
            System.out.println("found at "+i+"  "+j);
            }
    
       }
    
    
    }
    }
    
   }

public static boolean stringfound(char[][] grid, String str, int i, int j, int k) 
{
        
        int xos=0,yos=0;
        switch(k){
        case 0:xos=1;
                 //yos=-1;
                 break;

        case 1:xos=-1;
                 //yos=-1;
                 break;
        case 2://xos=1;
                 yos=-1;
                 break;
        case 3:yos=1;
                 //yos=1;
                 break;
        case 4:xos=1;
                 yos=1;
                 break;
        case 5:xos=-1;
                yos=1;
                 break;
        case 6:xos=-1;
                 yos=-1;
                 break;
        case 7:xos=1;
                 yos=-1;
                 break;

        default: return false;
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

    
    int endx=i+(str.length()*xos);
    int endy=j+(str.length()*yos);
    if(endx<0||endy<0||endx>grid.length||endy>grid[0].length){
       // System.out.println("beyond capacity");
    return false;
    
    }
    for(int z=0;z<str.length();z++){
    if(grid[i+(z*xos)][j+(z*yos)]!=str.charAt(z))
        {return false;
       // break;
        }
    //return true;
    }
        return true;

    
}    
}
