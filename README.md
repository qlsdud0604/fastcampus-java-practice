# fastcampus-java-practice

## 정렬 알고리즘을 사용하는 애플리케이션의 제작
### 클래스 정보
* BubbleSort
``` java
public class BubbleSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
```

* JavaSort
``` java
public class JavaSort <T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
```

* Main
``` java
public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
```

### 문제점
ㆍ BubbleSort와 JavaSort 클래스를 별도로 만들고 Main 클래스에서 new 키워드를 사용해 인스턴스를 생성하는 구조이다.   
ㆍ Main 클래스를 보면, 변수 클래스를 BubbleSort로 선언하고 BubbleSort의 정렬 알고리즘을 사용하는 것을 알 수 있다.

### 개선점


## 구조 변경

### 클래스 정보
* Sort
``` java
public interface Sort <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
```

* BubbleSort
``` java
public class BubbleSort <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
```

* JavaSort
``` java
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    @Override
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);

        return output;
    }
}
```

* Main
``` java
public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result] : " + sort.sort(Arrays.asList(args)));
    }
}
```

### 개선사항

### 문제점
