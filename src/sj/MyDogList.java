package sj;

public class MyDogList {
    private int DefaultSize = 5;
    private int size = 0;
    private Dog[] dogs;

    public MyDogList() {
        dogs = new Dog[DefaultSize];
    }

    public int length() {
        return dogs.length;
    }

    public void add(int index, Dog dog) throws Exception {
        if (index < 0 || index > size) {
            System.out.println("添加范围有误，应在0-" + size + "之间");
            throw new Exception("抛出异常");
        }
        if (size == dogs.length) {
            grow();
        }
        if (index == size) {
            dogs[size] = dog;
        }
        for (int i = size - 1; i >= index; i--) {
            dogs[i + 1] = dogs[i];
        }
        dogs[index] = dog;
        size++;
    }

    public void add(Dog dog) {
        if (size == dogs.length) {
            grow();
        }
        dogs[size] = dog;
        size++;
        System.out.println("添加成功，当前size=" + size);
    }

    public void grow() {
        System.out.println("开始扩容");
        Dog[] newDogs = new Dog[dogs.length * 2];
        for (int i = 0; i < dogs.length; i++) {
            newDogs[i] = dogs[i];
        }

        for (int i = 0; i < dogs.length; i++) {
            Dog dog = dogs[i];
            System.out.println("第" + i + "个元素" + dog);

        }
        dogs = newDogs;
    }

    public void remove(int index) throws Exception {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            dogs[i] = dogs[i + 1];
        }
        dogs[size - 1] = null;
        size--;
    }

    public boolean checkIndex(int index) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("index必须大于0小于" + size);
        }
        System.out.println("数据共：" + size + "条狗,下标：" + index + "在范围内");
    return true;
    }
public void remove(Dog dog){
        for (int i=0;i<size;i++){
            /*if (Object.equals(dog[i],dog)){
                for (int j=i;j<size;j++){
                    dog[j]=dogs[j+1];
                }*/
                size--;

            }
        }
}

