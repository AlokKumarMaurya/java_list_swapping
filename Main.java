class Main{
        public static void main(String[]  asdd){
                int []old={1,2,3,4,5};
                int temp;
                for(int i=old.length-1,  j=0;   i>= old.length/2;   i--,  j++){
                        temp=old[i];  //last i==9   ,,temp==10
                        old[i]=old[j];  //j==0  ,,old[9]==old[0]====10||||1
                        old[j]=temp;
                        for(int eleemt:old){
                                System.out.print(eleemt );
                        System.out.print(" ");
                        }
                        System.out.println(" ");
                }

        }
}