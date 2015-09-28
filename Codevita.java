package tcs;

import java.io.*;
import java.lang.*;
import java.util.*;

public class Codevita {
    public static void main(String[] args) throws IOException {
        String ele[] = null;
        int i=0,min=0,j=0;
        BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
	
        int t=Integer.parseInt(br.readLine());
		for(int yy=0;yy<t;yy++)
        {
			String s1=br.readLine();
			StringTokenizer st=new StringTokenizer(s1,"");
	        while(st.hasMoreTokens())
	        {
	            ele[i]=st.nextToken();
	            ele[i]=ele[i].toLowerCase();
	            i++;
	        }
        int k=Integer.parseInt(br.readLine());
        int size= ele.length;
        int var=0;
        for(i=0;i<k;i++)
        {
            if(var%2==0)
            {
                 for(t=i;t<size;)
                    {
                        if(ele[t].compareTo(ele[i])<0)
                           min=t;
                        t=t+2;
                    }
                   
                   String temp=ele[min];
                   ele[min]=ele[i];
                   ele[i]=temp;
                   var++;
                  
                
             }
            else
            {
                for(j=i;j<size;)
                {
                    if(Integer.parseInt(ele[j])<Integer.parseInt(ele[i]))
                       min=i;
                    j=j+2;
                }
                    String temp=ele[min];
                    ele[min]=ele[j];
                    ele[j]=temp;
                    var++;
                                 
            }
        }
	    for(int a=0;a<size;a++)
	    System.out.print(ele[a]);
	  }
    }
}

