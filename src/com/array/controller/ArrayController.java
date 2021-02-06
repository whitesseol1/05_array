package com.array.controller;

import java.util.Scanner;
import java.util.Random;

public class ArrayController {
      
	public void basicArray() {
		//배열은 동일한 자료형의 변수 여러개를 관리하는 것
		//배열의 선언 -> 변수와 비슷함   자료형 뒤에 [] 또는 변수명 뒤에 []
		//배열은 선언을 한다고 바로 사용할 수는 없다! -> 선언 후 반드시 할당을 해줘야 함.
		//배열의 할당 -> new 연산자로 할당을 함.
		//자료형[] 변수명=new 자료형[생성할 변수의 갯수];
		int num;
		num=10;
		
		//배열선언하기
		int[] nums;
		//System.out.println(nums[0]); nums에 할당 먼저 해야함!
		//배열할당하기
		nums=new int[5];//nums[0], nums[1], nums[2], nums[3], nums[4], 
		for(int i=0;i<5;i++) {
			System.out.println(nums [i]);
		}
		int[] nums2=new int[3];
		
		//int age,age1,age2;
		
		//배열의 저장공간에 접근하기
		//배열 할당시 부여된 인덱스번호로 저장공간에 접근함
		//배열명[인덱스번호];== int a; a
		//nums[0];//->nums배열 저장공간의 첫번째 저장공간(변수) 가져온것.
		System.out.println("nums[0] : "+nums[0]);
		//배열은 할당을 통해 저장공간을 만들면 default값으로 초기화됨.
		//int -> 0, char -> ' ', double -> 0.0, String -> null
		
		//배열의 저장공간에 값 대입하기
		nums[0]=100;
		System.out.println("nums[0]대입 후 : "+nums[0]);
		
		//index번호의 최대값을 넘어서 접근을 하면
		//System.out.println(nums[5]); //범위 밖이라 에러남
		
		//배열의 각 변수에 대입을 해보자.
		String[] names=new String[3]; // ->? 문자열 변수 3개 만들고 이름 names
		names[0]="유병승";
		names[1]="정유정";
		names[2]="권설영";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for(int i=0;i<3;i++) {     //배열의 유용한 방법
			//System.out.println(i);
			System.out.println(names[i]);    
		}
		
		//대입에 for문 적용하기
		for(int i=0;i<3;i++) { //i<=3으로 하면 오류.. 
			names[i]="힘내요! 잠깨고!";
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(names[i]);
		}
		
		//배열로 생성된 저장공간(변수) 자료형이 고정됨.
		 int[] ages=new int[5]; //int형
		ages[0]=100;
		//ages[1]="유병승"; //강제형변환하지 않으면 넣을수 없음
		
		//저장공간이 3개인 String배열을 만들고,
		//3개의 주소를 입력받고 각 변수에 저장하고
		//출력하세요.
		
		String[] address=new String[3];
		
		//address=new String[2];  /저장공간 두개밖에 안생겨서 에러뜸
		//배열의 길이를 확인하려면 배열명.length 
		
		Scanner sc=new Scanner(System.in);
		//for(int i=0;i<3;i++) {
		address=new String[5]; //5번 입력받도록 늘어남
		for(int i=0; i<address.length;i++) {
			System.out.println("값입력 : ");
			address[i]=sc.nextLine(); //배열 입력받기
		}
		
		for(int i=0;i<address.length;i++) {
			System.out.println(address[i]);
		}
		
		//System.out.println(address);  //배열저장소..
		//System.out.println(names);
		
		String[] studentName=new String[5];
		studentName[0]="지수현";
		studentName[1]="김상현";
		studentName[2]="신충현";
		studentName[3]="이진주";
		studentName[4]="이우식";
		
		//학생이름 중 신충현이 있는지 확인하는 로직
		boolean check=false;
	    for(int i=0;i<studentName.length;i++) {
		     if(studentName[i].equals("신충현")) {
		    	 check=true;
		     }
		
	        }
	    System.out.println(check?"있어!잘있어":"없어!넣어!");
	    
	    
	    //입력받은 이름이 있는지 찾는 로직 구현
	     
	    System.out.println("검색할 이름 :");
	    
	    //String searchName=new String[0];
	    String searchName=sc.nextLine();
	    for(int i=0;i<studentName.length;i++) {
	    	if(studentName[i].equals(searchName)) {
	    		check=true;
	    		
	    	}
	    }
	    System.out.println(searchName+"은 "+(check?"있어" : "없어!"));
	    
	    //배열을 생성과 동시에 초기화하기(값을 바로 대입하기)
	    double[] height=new double[10];
	    height[0]=180.5;
	    double[] height2= {180.5, 170.5, 176.8, 188.5, 190.4};
	    for(int i=0;i<height2.length;i++) {
	    	System.out.println(height2[i]);
	    }
	    //height= {10.2,20.3,32.3};
	    height= new double[] {10.2,20.3,32.3};  //new로 다시 지정해야 초기화됨
	    for(int i=0;i<height.length;i++) {
	    	System.out.println(height[i]);
	    }
	    
	   
	   
	}
	
	 //배열 저장공간활용하기
    public void changeData() {
    	//배열안에 저장된 데이터들간의 위치조정
    	//배열에는 순서가 있는데 그 순서를 변경
    	int[] num= {1,4,6,2,3,7};
    	//2인덱스 6 -> 3인덱스 2 위치변경
    	
    	for(int i=0;i<num.length;i++) {
    		System.out.print(num[i]+" ");
    	}
    	
    	System.out.println();
    	int temp=num[2]; //따로 먼저보관해야함
    	num[2]=num[3];
    	num[3]=temp;
    	
    	for(int i=0;i<num.length;i++) {
    		System.out.print(num[i]+" ");
    	}
    	 System.out.println();
    	 
    	 //배열 순차정렬하기
    	 for(int i=0;i<num.length;i++) {
    		
    		 for(int j=0;j<i;j++) {
    			 System.out.println(j+" "+num[i]+" : "+num[j]);
    			 //오름차순정렬
    			 if(num[i]<num[j]) { //부등호만 바꾸면 내림차순됨
    				 //변경하기
    				 int t=num[i];
    				 num[i]=num[j];
    				 num[j]=t;
    			 }
    		 }
    		 
    	     System.out.println();
        }
    	
    	 
    	 
    	 
	
    }
    
    
    public void  test() {
 
	 //int 10 배열을 선언하고
	 //4,5,9,10,22,4,53,12,16,68 대입
	 //값에서 짝수의 갯수 출력하기
	 //홀수의 갯수 출력하기
	 
	 int nums[]= {4,5,9,10,22,4,53,12,16,88};
	 int count=0;
	 for (int i=0;i<nums.length;i++) {
		 if(nums[i]%2==0) {
		 count++;
	    }
	 }
	 System.out.println("짝수 갯수 : " +count);
	 System.out.println("홀수 갯수 : " +(nums.length-count));
    }
    
	//랜덤값 출력하기 ->
    public void randomTest() {
    	//Math클래스에서 제공하는 random()기능이용
    	System.out.println(Math.random());//매소드가 호출(실행)
    	//random값을 정수로 변경하려면?
    	
    	System.out.println((int)(Math.random()*10));//0~9
    	System.out.println((int)(Math.random()*5)+1);//0~4/+1하면 0부터 5까지랜덤.
    	System.out.println((int)(Math.random()*44)+1);
    	//6개 자리에 각 번호들어감 ->중복값이 없어야 함.
    	
    	//배열 int 6개짜리 배열을 만들고
    	//각 배열인덱스에 랜덤값을 넣기 단, 1~28까지 수 중
    	int[] lotto=new int[6]; //6은 갯수
    	
    	for(int i=0;i<lotto.length;i++) {
    		lotto[i]=(int)(Math.random()*27)+1;
    		
    	}
    	for(int i=0;i<lotto.length;i++) {
    		System.out.println(lotto[i]+"  ");
    	}
    	
    	//랜덤값출력
    	//Random객체를 이용하는 방법
    	//Random객체의 nextInt()기능을 이용함.
    	System.out.println();
    	System.out.println(new Random().nextInt());//마이너스부터 숫자 다양하게나옴(정수)
    	//nextInt(범위값)-> nextInt(10); 
    	System.out.println(new Random().nextInt(10)+1); //0은 안나옴(1~10)
    	
    	
    	
    
    }
    
    
    public void copyArray() {
		//배열을 복사해보자
    	//두가지 방식
    	//1. 얇은복사 -> 배열명의 주소값을 복사
    	String[] hobby= {"스마트폰","축구","낚시","청소"};
    	String[] hobby2=hobby;//얇은복사
    	System.out.println(hobby);
    	System.out.println(hobby2);
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]); //동일한저장소
    	
    	hobby2[0]="잠자기";
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]);
    	hobby[0]="코딩";
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]);
    	
    	//2. 깊은복사 -> 배열에 연결된 공간복사
    	String[] hobby3=new String[hobby.length]; //hobby배열의 길이를 가져와서 넣음
		for(int i=0;i<hobby.length;i++) {
			
			hobby3[i]=hobby[i];			
		    }
		for(int i=0;i<hobby.length;i++) {
			
			
		  }
		 System.out.println("hobby3출력");
		 for(int i=0;i<hobby3.length;i++) {
			 System.out.print(hobby3[i]+" ");
		 }
    	 System.out.println();
    	 String[] hobby4=new String[5];
    	 System.arraycopy(hobby3,  1, hobby4, 1, 3); //hobby3의 0번값을 hobby4의 1번째로 0의길이만큼 , 원하는 자리에 원하는만큼 복사;
    	 
    	 for(int i=0;i<hobby4.length;i++) {
    		 System.out.print(hobby4[i]+" ");
    	 }
    	 System.out.println();
    	 hobby4[2]="농구";
    	 System.out.println(hobby[2]);
    	 System.out.println(hobby4[2]);
    	}

	
    
    
    
	
}
