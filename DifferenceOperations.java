package com.cp;

import java.util.Scanner;

public class DifferenceOperations
{

    public static void main (String[]args)
    {

        Scanner sc = new Scanner (System.in);

        int t, n;

        t = sc.nextInt ();

        for (int i = 0; i < t; i++)
        {

            n=sc.nextInt();

            int a[] = new int[n];

            for(int u=0;u<n;u++){

                a[u]=sc.nextInt();

            }


            for (int v = 0; v < (n - 1); v++)
            {

                for (int j = 0; j < (n - v - 1); j++){

                    if (a[j] > a[j + 1])
                    {

                        int temp = a[j];

                        a[j] = a[j + 1];

                        a[j + 1] = temp;

                    }

                }

            }

            int k = 1, c = 0, m = 0;

            while (k > 0)
            {

                for (int p = n - 1; p > 0; p--)
                {

                    if (a[p] != 0)
                    {

                        int temp = a[p];

                        a[p] = temp - a[p - 1];

                    }

                }

                for (int l = 1; l < n; l++)
                {

                    if (a[l] == 0)
                    {

                        c++;

                    }

                    else if (a[l] < 0)
                    {

                        m++;

                        break;

                    }

                    else
                    {

                        continue;

                    }

                }

                if (c == (n - 1))
                {

                    System.out.println ("YES");

                    break;

                }

                else if (m == 1)
                {

                    System.out.println ("NO");

                    break;

                }

                k++;

            }

            k = 1;c = 0;m = 0;

        }

    }

}

