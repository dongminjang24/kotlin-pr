## 코틀린에서 함수를 다루는 방법

### 1) 함수 선언
- body가 하나의 값으로 간주되는 경우 block을 없앨 수도 있고, block이 없다면 반환 타입을 없앨 수도 있다. 
- 

```
접근지시어 fun 함수이름(파라미터): 반환타입{

}
```

### 2) default parameter
- 함수의 파라미터에 기본값을 지정할 수 있다.

### 3) Named argument
- 함수를 호출할때 특정 파라미터를 지정해 넣어줄 수 있다/


### 4) 같은 타입의 여러 파라미터 받기(가변인자)
- 가변인자에는 vararg키워드를 사용하며, 가변인자 함수를 배열과 호출할 때는 *를 붙여주어야 한다.