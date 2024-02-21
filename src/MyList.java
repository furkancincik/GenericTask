import java.util.Arrays;

public class MyList<T> {
    private static final int defaultCapacity = 10;
    private T[] array;
    private int size;

    public MyList() {
        this(defaultCapacity);
    }


    public MyList(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }


    public void add(T data) {
        if (size == array.length) {
            ensureCapacity(); // Kapasiteyi artırmak için çağrılıyor
        }
        array[size++] = data;
    }


    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        array = Arrays.copyOf(array, newCapacity);
    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            T removedElement = get(index);
            deleteValue(index);
            System.out.println("Veri Silindi !");
            return removedElement;
        }
    }

    private void deleteValue(int index) {
        // Verilen indeksten sonraki tüm elemanları sola kaydır
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        // Son elemanı null yap
        array[size - 1] = null;
        // Boyutu azalt
        size--;
    }

    //verilen indekste yenisiyle eskisini degistirir.
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return;
        }
        array[index] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) { // Elemanlar karşılaştırılıyor
                System.out.println();
                System.out.print("Aradıgınız eleman indeksi:" + i);
                return i; // Eleman bulundu, indeks döndürülüyor
            }
        }
        return -1; // Eleman bulunamadı
    }

    public T lastIndexOf(T data) {
        if (isEmpty()) {
            System.out.println("Liste Boş !");
            return null;
        } else {
            return array[size - 1];
        }
    }



    public boolean isEmpty() {
        if (size == 0) {
            System.out.println("Liste Boş !!");
            return true;
        }
        return false;
    }


    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
        System.out.println("Listedeki Tüm Veriler Silindi !");
        System.out.println("Yeni Liste Boyutu : " + size());
        if (isEmpty()) {
            System.out.println("Liste Boş !");
        } else {
            System.out.println("Listenin İlk Elemanı: " + array[0]);
        }
    }




    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size || start > finish) {
            return null;
        }

        MyList<T> subList = new MyList<>();
        for (int i = start; i < finish; i++) {
            System.out.println(array[i]);
        }
        return subList;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(array[i])) {
                System.out.println(data+" verisi Listede vardır !");
                return true;
            }
        }
        System.out.println("Bu veri Listede yoktur !");
        return false;
    }



}

