import java.util.Arrays;
class maxHeap {
    int[] heap;
    int size;
    int capacity;

    public maxHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    //i is the root INDEX

    void Heapify(int i){
        int l = 2*i+1; //left INDEX
        int r = 2*i+2; //right ALL INDEX
        int largest = i; //largest ka INDEX

        //agar left child is greater than the root yaani its parent

        if(l<size && heap[l]>heap[i]){
            largest=l; //largest wala i nahi l ho jayega to dono ko swap
        }

        //right child is greater than whichever one is bigger left child ya the root orignial parent

        if(r<size && heap[r]>heap[largest]){
            largest = r;
        }

        //koi change aaya hai yaani, i.e. heap function has done worked

        if(largest!=i){
            int temp = heap[i];
            heap[i]=heap[largest];
            heap[largest]=temp;
            Heapify(largest);
        }


    }

    int parent(int i){
        return (i-1)/2;

    }

    void add(int value){
        if(size==capacity){
            System.out.println("no, full");
            return;
        }
        size++;
        int a = size -1;
        heap[a]=value;

        // while(a!=0){
        //     Heapify(a);
        // }

        while (a != 0 && heap[parent(a)] < heap[a]) {
            int temp = heap[a];
            heap[a] = heap[parent(a)];
            heap[parent(a)] = temp;
            a = parent(a);
        }

    }

    void removeIndex(int i) {
        if (i < 0 || i >= size) {
            System.out.println("no");
            return;
        }
    
        int lastElement = heap[size - 1];
        heap[i] = lastElement;
        size--;
    
        if (i == size)
            return;
            if (heap[i] > heap[parent(i)]) { 
                heapifyUp(i);
            } else { 
                Heapify(i);
            }
    }
    

    void heapifyUp(int i) {
        while (i > 0 && heap[(i-1)/2] < heap[i]) {
            int temp = heap[i];
            heap[i] = heap[(i-1)/2];
            heap[(i-1)/2] = temp;
            i = (i-1)/2;
        }
    }
    
    // void Heapify(int i) {
    //     int largest = i;
    //     int left = 2*i+1;
    //     int right = 2*i+2;   
    //     if (left < size && heap[left] > heap[largest]) {
    //         largest = left;
    //     }
    //     if (right < size && heap[right] > heap[largest]) {
    //         largest = right;
    //     }
    //     if (largest != i) {
    //         int temp = heap[i];
    //         heap[i] = heap[largest];
    //         heap[largest] = temp;
    //         Heapify(largest);
    //     }
    // }
    
    void extractMax(){

        //ADD EXCEPTIONS

        int max = heap[0];
        heap[0]=heap[size-1];
        size--;
        System.out.println(max);

        Heapify(0);
        
    }

    void size(){
        System.out.println(heap.length);
    }

    void print(){
        System.out.println(Arrays.toString(heap));
    }

}

class heap_col {
    public static void main(String[] args) {
        maxHeap heap = new maxHeap(10);

        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);
        heap.add(10);
        heap.add(30);
        heap.add(50);

        heap.print();
        System.out.println();

        // heap.removeIndex(4);
        // heap.print();
        // System.out.println();

        heap.extractMax();
        heap.print();

    }
}
