public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 35, 78, 5, 69, 12, 78, 57};
        Collection col = new Collection(arr);

        Iterator iterator = col.createForward();


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        int arr1[] = {1, 35, 78, 5, 68, 12, 78, 57};
        Collection col1 = new Collection(arr1);
        Iterator iterator2 = col1.createBackward();


        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        Iterator iterator3 = col1.createAnonymous();

        System.out.println();

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }


        Iterator iterator4 = col1.createLocal();

        System.out.println();

        while (iterator4.hasNext()) {
            System.out.println(iterator4.next());
        }





        int arr2[] = {1, 35, 78, 5, 68, 12, 78, 57};
        Collection col2 = new Collection(arr2);

        Iterator iterator5 = col2.createStaticIterator();

        System.out.println();

        while (iterator5.hasNext()) {
            System.out.println(iterator5.next());
        }
    }

}

