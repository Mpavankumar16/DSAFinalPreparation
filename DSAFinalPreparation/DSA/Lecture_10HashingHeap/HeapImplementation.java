package DSA.Lecture_10HashingHeap;

public class HeapImplementation {

    public static class Heap{
        int size;
        int[] arr;
        public Heap(){
            arr = new int[100];
            size = 0;
        }

        public void insert(int i){
            size++;
            arr[size] = i;
            int ind = size;
            while(ind>1){
                int parent = ind/2;
                if(arr[parent]<arr[ind]){
                    swap(arr, parent, ind);
                }
                else{
                    return;
                }
            }
        }
        private int swap(int[] arr, int parent, int ind){
            int temp = arr[parent];
            arr[parent] = arr[ind];
            arr[ind] = temp;
            return temp;
        }
        public int delete(){
            int val = swap(arr, 1, size);
            size--;

            int i = 1;
            int leftIndex ;
            int rightIndex;
            while(i<size){
                leftIndex = 2*i;
                rightIndex = 2*i+1;

                if(leftIndex<size && arr[i]<arr[leftIndex]){
                    swap(arr, i, leftIndex);
                    i = leftIndex;
                }
                else if(rightIndex<size && arr[i]<arr[rightIndex]){
                    swap(arr, i, rightIndex);
                    i = rightIndex;
                }
                else{
                    break;
                }
            }
            return val;
        }
    }
    public static void main(String[] args) {
        Heap p = new Heap();
        p.insert(1);
        p.insert(4);
        p.insert(3);
        p.insert(2);

        System.out.println(p.delete());
        System.out.println(p.delete());
        System.out.println(p.delete());
        System.out.println(p.delete());
        System.out.println(p.delete());
    }

}
