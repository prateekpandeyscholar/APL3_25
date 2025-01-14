class Prob2{

    public static void main(String maxStars[]){
        int rows=Integer.parseInt(maxStars[0]);
        int rowSlots=rows+(rows-1);
        for(int i=1;i<=rows;i++){
           int l=1;
           for(int j=1;j<=rowSlots;j++){
              int count=0;
              for(int k=1;k<i;k++){
               System.out.print(" ");
               count++;
              }
              while( l<=rowSlots-count-count){
               System.out.print("*");
               l++;
               System.out.print(" ");
               l++;
              }
           }
            System.out.println("");

        }

    }
}