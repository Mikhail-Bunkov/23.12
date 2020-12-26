package ru.geekbrains.ofless2;

import java.util.Arrays;

public class Main {
    // Сделал Буньков Михаил.
    public static void main(String[] args)
    {
        int[] a ={1,0,0,0,1,1,0,1,1,1,0,1};
        int[] b ={1,0,0,0,1,1,0,1,1,1,0,1};
        int[] c =new int[8];
        int[][] c1 =new int[9][9];
        int[] a1 ={1242,556,34,8,5334,7,9,0};
        int[] d ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] g = {6,2,1,4,5,1,2,2,3,4,14,4,12,2,1,4,3,3,21,2};
        int[] gg={3,2,6,2,1} ;
        int g1= 3;


        for (int i = 0; i< a.length; i++)
        {
            if (a[i] == 1)
            {
                a[i]=0;
            }

        }


        for (int i = 0; i< b.length; i++)
        {
            if (b[i] == 0)
            {
                b[i]=1;
            }
        }


        for (int i=0,f=0; i< c.length; i++,f+=3)
        {
            c[i] = f;
        }


        for (int i =0; i<d.length; i++)
        {
            if (d[i]<6)
            {
                d[i]*=2;
            }
        }


        for (int i =0; i< 9;i++)
        {
            for (int j = 0; j< 9;j++)
            {
                c1[i][j]=0;
                if(i==j || 8-j == i)
                {
                    c1[i][j]=1;

                }
            }
        }



        int maxi = a1[0];
        int mini = a1[0];
        for(int i = 0; i < a1.length; i++){
            if(a1[i] > maxi){
                maxi = a1[i];
            }
            if(a1[i] < mini){
                mini = a1[i];
            }
        }


        System.out.println("1"+Arrays.toString(a));
        System.out.println("1"+Arrays.toString(b));
        System.out.println("2"+Arrays.toString(c));
        System.out.println("3"+Arrays.toString(d));
        for (int i =0; i< 9;i++)
        {
            for (int j = 0; j< 9;j++)
            {
                System.out.print(c1[i][j]);


            }
            System.out.println();

        }
        System.out.println("5)"+mini + " " + maxi);
        System.out.println("6 "+Method6(g));
        Method7(gg, g1);


    }


    private static boolean Method6(int[] g)
    {
        int k=0;
        int summ = 0;
        int summing = 0;
        int summing2 = 0;
        for (int i = 0; i<g.length; i++) {
            summ +=g[i];
        }
        summ /=2;
        for (int i = 0; i< g.length; i++)
        {
            summing +=g[i];
            if (summing == summ)
            {
                for (int j = g.length-1; j>i; j--)
                {
                    summing2 +=g[j];
                    if (summing2 == summing)
                    {
                        k=1;
                        break;
                    }
                }

            }
            if (k==1)
            {
                break;
            }
        }
        if (summing2 !=summing) {
            return false;
        }else
        {
            return true;
        }
    }

    private static void Method7(int[] Hard, int n)
    {
        System.out.println("7 Не смог xD");
    }
}
