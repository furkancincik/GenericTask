public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + list.size());
        System.out.println("Dizinin Kapasitesi : " + list.getCapacity());
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(210);
        list.add(999);
        System.out.println("Listedeki eleman sayısı : "+ list.size());
        System.out.println("Dizinin kapasitesi : "+ list.getCapacity());

        System.out.println();
        System.out.println();
        MyList<Integer> subList = list.sublist(1, 4);
        System.out.println();
        System.out.println();

        System.out.println("999 verisini sil");
        list.indexOf(999);
        System.out.println();
        list.remove(20);

        System.out.println();
        System.out.println();
        list.contains(50);
        System.out.println();
        System.out.println();

        list.lastIndexOf(999);

        list.isEmpty();

        list.lastIndexOf(90);

        list.clear();





    }





}