package search;

public class Demo02 {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 25, 36, 47, 57, 68};
        int key = 22;
        //int index = search1(a, key);
        int index =search2(a,key,0,a.length-1);
        if (index == -1) {
            System.out.println("没有找到数据,返回数据="+index);
        } else {
            System.out.println("找到了，数组下标:" + index);
        }
    }
    public static int search2(int[] a, int key,int low,int high){
        int mid=0;
        if (low<high){
            mid=(low+high)/2;
            if (key==a[mid]){
                return mid;
            }else if (key<=a[mid]){
                search2(a,key,low,mid-1);
            }else {
             return    search2(a,key,mid+1,high);
            }
        }
        return -1;
    }
    public static int search1(int[] a, int key) {
        int mid = 0;
        int low = 0;
        int high = a.length;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("此时，mid=" + mid + ",low=" + low + ",high=" + high);
            if (key == a[mid]) {
                //System.out.println("找到了，数组下标:" + mid);
                return mid;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
