package com.cp;
import java.util.Objects;
import java.util.Scanner;

public class rook {
    public static void main(String[] args) {
        solve();
    }
    static void solve(){
        Scanner sc=new Scanner(System.in);
        String [][]a={{"a8","b8","c8","d8","e8","f8","g8","h8"},
        {"a7","b7","c7","d7","e7","f7","g7","h7"},
        {"a6","b6","c6","d6","e6","f6","g6","h6"},
        {"a5","b5","c5","d5","e5","f5","g5","h5"},
        {"a4","b4","c4","d4","e4","f4","g4","h4"},
        {"a3","b3","c3","d3","e3","f3","g3","h3"},
        {"a2","b2","c2","d2","e2","f2","g2","h2"},
        {"a1","b1","c1","d1","e1","f1","g1","h1"}};
        int t=sc.nextInt();
        while(t-->0){
            int k=0,k1=0;
            String s=sc.next();
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(Objects.equals(a[i][j], s)){
                        k=i;k1=j;
                        break;
                    }
                }
            }
            for(int i=0;i<8;i++){
                if(i!=k1){
                System.out.println(a[k][i]);
                }
            }
            for(int i=0;i<8;i++){
                if(i!=k){
                System.out.println(a[i][k1]);
                }
            }
        }
    }
}
