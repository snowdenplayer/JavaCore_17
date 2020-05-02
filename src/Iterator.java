public interface Iterator {
    public boolean hasNext();
    public Object next();
}

 class Collection{
    private static int[] number;

     public Collection(int[] number) {
         this.number = number;
     }

     public class Forward implements Iterator{
         private int i =0 ;

         @Override
         public boolean hasNext() {
             return i<number.length;
         }

         @Override
         public Object next() {
             if (i % 2 == 1)
                 number[i]=0;
             return number[i++];
         }
     }
     public Forward createForward(){
         return new Forward();
     }

     public class Backward implements Iterator{
         private int a = number.length-1;

         @Override
         public boolean hasNext() {
             return a>=0;
         }

         @Override
         public Object next() {
             int temp = a;
             a -= 2;
             return number[temp];
         }
     }
     public Backward createBackward(){
         return new Backward();
     }
     public static class staticIterator implements Iterator{
         private int count = 0;

         @Override
         public boolean hasNext() {
             return count < number.length;
         }

         @Override
         public Object next() {
             int tmp = count;
             count+=2;
             if(number[tmp]%2==0) {
                 return number[tmp]+1;
             }else
                 return number[tmp];
         }

     }

     public static staticIterator createStaticIterator() {
         return new staticIterator();
     }

     public Iterator createAnonymous(){
         return new Iterator() {
             int count = number.length-1;
             @Override
             public boolean hasNext() {
                 return count>=0;
             }

             @Override
             public Object next() {
                 int tmp = count;
                 count-=3;
                 if(number[tmp]%2==1){
                     return number[tmp];
                 }


                 return ' ';
             }
         };

     }


     public Iterator createLocal(){
         class Local implements Iterator{
             int i = 5;

             @Override
             public boolean hasNext() {
                 return i<number.length;
             }

             @Override
             public Object next() {
                 int k = i;
                 i+=5;
                 if(number[k]%2==0){
                     number[k]-=100;
                 }
                 return number[k];
             }
         }
         return new Local();
     }



 }
