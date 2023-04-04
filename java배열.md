# 배열
같은 종류의 데이터를 저장하기 위한 자료구조 (float랑 int를 같이 넣을수 없음)
크기가 고정되어 있음(한번 생성된 배열은 크기를 바꿀 수 없음)
배열을 객체로 취급(참조형)
배열의 요소를 참조하려면 배열이름과 색인(index)이라고 하는 음이 아닌 정수 값을 조합하여사용
index 번호를 가지고 각 요소에 접근
index 번호는 0부터 시작
배열이름 .length를 통해 배열의 길이 조회 가능  ( . 을 사용하여 사용  (멤버연산자))
배열의 길이는 임의로 변경 불가함
길이 변경 필요시 새로운 배열을 생성 후 배용을 옮긴다.

# 배열의 선언
타임[]변수
타임 변수[]
둘다 만들어지지만  위에 형식을 주로 사용

타입     배열이름      선언
int      iArr      int[] iArr;
char     cArr      char[] cArr;
boolean  bArr      boolean[] bArr;
String   strArr    String[] strArr;
Date     dateArr   Date[] dateArr;

# 배열의 생성과 초기화

자료형[] 배열이름 = new 자료형[길이];               //배열생성(자료형의 초기값으로 초기화)
자료형[] 배열이름 = new 자료형[]{값1,값2,값3,값4};  //배열생성 및 값 초기화
자료형[] 배열이름 = {값1, 값2, 값3, 값4};          //선언과 동시에 초기화

자료형             기본값           비고
boolean           false
char             '\u0000'        공백문자
byte,short,int      0
long                0L
float               0,0f
double              0.0
참조형 변수         null     아무것도 참조하지 않음


# for-each
가독성이 개선된 반복문으로, 배열 및 Collections 에서 사용
index 대신 직접 요소(elements) 에 접근하는 변수를 제공
naturally ready only (copied value)

새로운방법 (for-each)
int intArray [] = {1,3,5,7,9}
for(int x : intArray){
    System.out.println(x);
}

전통적인 방법
for(int i=0; i < intArry.length; i++){
    int x = intArray[i];
    System.out.println(x);
}

 # 배열의 복사
 

