package com.array.controller;

import java.util.Scanner;
import java.util.Random;

public class ArrayController {
      
	public void basicArray() {
		//�迭�� ������ �ڷ����� ���� �������� �����ϴ� ��
		//�迭�� ���� -> ������ �����   �ڷ��� �ڿ� [] �Ǵ� ������ �ڿ� []
		//�迭�� ������ �Ѵٰ� �ٷ� ����� ���� ����! -> ���� �� �ݵ�� �Ҵ��� ����� ��.
		//�迭�� �Ҵ� -> new �����ڷ� �Ҵ��� ��.
		//�ڷ���[] ������=new �ڷ���[������ ������ ����];
		int num;
		num=10;
		
		//�迭�����ϱ�
		int[] nums;
		//System.out.println(nums[0]); nums�� �Ҵ� ���� �ؾ���!
		//�迭�Ҵ��ϱ�
		nums=new int[5];//nums[0], nums[1], nums[2], nums[3], nums[4], 
		for(int i=0;i<5;i++) {
			System.out.println(nums [i]);
		}
		int[] nums2=new int[3];
		
		//int age,age1,age2;
		
		//�迭�� ��������� �����ϱ�
		//�迭 �Ҵ�� �ο��� �ε�����ȣ�� ��������� ������
		//�迭��[�ε�����ȣ];== int a; a
		//nums[0];//->nums�迭 ��������� ù��° �������(����) �����°�.
		System.out.println("nums[0] : "+nums[0]);
		//�迭�� �Ҵ��� ���� ��������� ����� default������ �ʱ�ȭ��.
		//int -> 0, char -> ' ', double -> 0.0, String -> null
		
		//�迭�� ��������� �� �����ϱ�
		nums[0]=100;
		System.out.println("nums[0]���� �� : "+nums[0]);
		
		//index��ȣ�� �ִ밪�� �Ѿ ������ �ϸ�
		//System.out.println(nums[5]); //���� ���̶� ������
		
		//�迭�� �� ������ ������ �غ���.
		String[] names=new String[3]; // ->? ���ڿ� ���� 3�� ����� �̸� names
		names[0]="������";
		names[1]="������";
		names[2]="�Ǽ���";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		for(int i=0;i<3;i++) {     //�迭�� ������ ���
			//System.out.println(i);
			System.out.println(names[i]);    
		}
		
		//���Կ� for�� �����ϱ�
		for(int i=0;i<3;i++) { //i<=3���� �ϸ� ����.. 
			names[i]="������! �����!";
		}
		
		for(int i=0;i<3;i++) {
			System.out.println(names[i]);
		}
		
		//�迭�� ������ �������(����) �ڷ����� ������.
		 int[] ages=new int[5]; //int��
		ages[0]=100;
		//ages[1]="������"; //��������ȯ���� ������ ������ ����
		
		//��������� 3���� String�迭�� �����,
		//3���� �ּҸ� �Է¹ް� �� ������ �����ϰ�
		//����ϼ���.
		
		String[] address=new String[3];
		
		//address=new String[2];  /������� �ΰ��ۿ� �Ȼ��ܼ� ������
		//�迭�� ���̸� Ȯ���Ϸ��� �迭��.length 
		
		Scanner sc=new Scanner(System.in);
		//for(int i=0;i<3;i++) {
		address=new String[5]; //5�� �Է¹޵��� �þ
		for(int i=0; i<address.length;i++) {
			System.out.println("���Է� : ");
			address[i]=sc.nextLine(); //�迭 �Է¹ޱ�
		}
		
		for(int i=0;i<address.length;i++) {
			System.out.println(address[i]);
		}
		
		//System.out.println(address);  //�迭�����..
		//System.out.println(names);
		
		String[] studentName=new String[5];
		studentName[0]="������";
		studentName[1]="�����";
		studentName[2]="������";
		studentName[3]="������";
		studentName[4]="�̿��";
		
		//�л��̸� �� �������� �ִ��� Ȯ���ϴ� ����
		boolean check=false;
	    for(int i=0;i<studentName.length;i++) {
		     if(studentName[i].equals("������")) {
		    	 check=true;
		     }
		
	        }
	    System.out.println(check?"�־�!���־�":"����!�־�!");
	    
	    
	    //�Է¹��� �̸��� �ִ��� ã�� ���� ����
	     
	    System.out.println("�˻��� �̸� :");
	    
	    //String searchName=new String[0];
	    String searchName=sc.nextLine();
	    for(int i=0;i<studentName.length;i++) {
	    	if(studentName[i].equals(searchName)) {
	    		check=true;
	    		
	    	}
	    }
	    System.out.println(searchName+"�� "+(check?"�־�" : "����!"));
	    
	    //�迭�� ������ ���ÿ� �ʱ�ȭ�ϱ�(���� �ٷ� �����ϱ�)
	    double[] height=new double[10];
	    height[0]=180.5;
	    double[] height2= {180.5, 170.5, 176.8, 188.5, 190.4};
	    for(int i=0;i<height2.length;i++) {
	    	System.out.println(height2[i]);
	    }
	    //height= {10.2,20.3,32.3};
	    height= new double[] {10.2,20.3,32.3};  //new�� �ٽ� �����ؾ� �ʱ�ȭ��
	    for(int i=0;i<height.length;i++) {
	    	System.out.println(height[i]);
	    }
	    
	   
	   
	}
	
	 //�迭 �������Ȱ���ϱ�
    public void changeData() {
    	//�迭�ȿ� ����� �����͵鰣�� ��ġ����
    	//�迭���� ������ �ִµ� �� ������ ����
    	int[] num= {1,4,6,2,3,7};
    	//2�ε��� 6 -> 3�ε��� 2 ��ġ����
    	
    	for(int i=0;i<num.length;i++) {
    		System.out.print(num[i]+" ");
    	}
    	
    	System.out.println();
    	int temp=num[2]; //���� ���������ؾ���
    	num[2]=num[3];
    	num[3]=temp;
    	
    	for(int i=0;i<num.length;i++) {
    		System.out.print(num[i]+" ");
    	}
    	 System.out.println();
    	 
    	 //�迭 ���������ϱ�
    	 for(int i=0;i<num.length;i++) {
    		
    		 for(int j=0;j<i;j++) {
    			 System.out.println(j+" "+num[i]+" : "+num[j]);
    			 //������������
    			 if(num[i]<num[j]) { //�ε�ȣ�� �ٲٸ� ����������
    				 //�����ϱ�
    				 int t=num[i];
    				 num[i]=num[j];
    				 num[j]=t;
    			 }
    		 }
    		 
    	     System.out.println();
        }
    	
    	 
    	 
    	 
	
    }
    
    
    public void  test() {
 
	 //int 10 �迭�� �����ϰ�
	 //4,5,9,10,22,4,53,12,16,68 ����
	 //������ ¦���� ���� ����ϱ�
	 //Ȧ���� ���� ����ϱ�
	 
	 int nums[]= {4,5,9,10,22,4,53,12,16,88};
	 int count=0;
	 for (int i=0;i<nums.length;i++) {
		 if(nums[i]%2==0) {
		 count++;
	    }
	 }
	 System.out.println("¦�� ���� : " +count);
	 System.out.println("Ȧ�� ���� : " +(nums.length-count));
    }
    
	//������ ����ϱ� ->
    public void randomTest() {
    	//MathŬ�������� �����ϴ� random()����̿�
    	System.out.println(Math.random());//�żҵ尡 ȣ��(����)
    	//random���� ������ �����Ϸ���?
    	
    	System.out.println((int)(Math.random()*10));//0~9
    	System.out.println((int)(Math.random()*5)+1);//0~4/+1�ϸ� 0���� 5��������.
    	System.out.println((int)(Math.random()*44)+1);
    	//6�� �ڸ��� �� ��ȣ�� ->�ߺ����� ����� ��.
    	
    	//�迭 int 6��¥�� �迭�� �����
    	//�� �迭�ε����� �������� �ֱ� ��, 1~28���� �� ��
    	int[] lotto=new int[6]; //6�� ����
    	
    	for(int i=0;i<lotto.length;i++) {
    		lotto[i]=(int)(Math.random()*27)+1;
    		
    	}
    	for(int i=0;i<lotto.length;i++) {
    		System.out.println(lotto[i]+"  ");
    	}
    	
    	//���������
    	//Random��ü�� �̿��ϴ� ���
    	//Random��ü�� nextInt()����� �̿���.
    	System.out.println();
    	System.out.println(new Random().nextInt());//���̳ʽ����� ���� �پ��ϰԳ���(����)
    	//nextInt(������)-> nextInt(10); 
    	System.out.println(new Random().nextInt(10)+1); //0�� �ȳ���(1~10)
    	
    	
    	
    
    }
    
    
    public void copyArray() {
		//�迭�� �����غ���
    	//�ΰ��� ���
    	//1. �������� -> �迭���� �ּҰ��� ����
    	String[] hobby= {"����Ʈ��","�౸","����","û��"};
    	String[] hobby2=hobby;//��������
    	System.out.println(hobby);
    	System.out.println(hobby2);
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]); //�����������
    	
    	hobby2[0]="���ڱ�";
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]);
    	hobby[0]="�ڵ�";
    	System.out.println(hobby[0]);
    	System.out.println(hobby2[0]);
    	
    	//2. �������� -> �迭�� ����� ��������
    	String[] hobby3=new String[hobby.length]; //hobby�迭�� ���̸� �����ͼ� ����
		for(int i=0;i<hobby.length;i++) {
			
			hobby3[i]=hobby[i];			
		    }
		for(int i=0;i<hobby.length;i++) {
			
			
		  }
		 System.out.println("hobby3���");
		 for(int i=0;i<hobby3.length;i++) {
			 System.out.print(hobby3[i]+" ");
		 }
    	 System.out.println();
    	 String[] hobby4=new String[5];
    	 System.arraycopy(hobby3,  1, hobby4, 1, 3); //hobby3�� 0������ hobby4�� 1��°�� 0�Ǳ��̸�ŭ , ���ϴ� �ڸ��� ���ϴ¸�ŭ ����;
    	 
    	 for(int i=0;i<hobby4.length;i++) {
    		 System.out.print(hobby4[i]+" ");
    	 }
    	 System.out.println();
    	 hobby4[2]="��";
    	 System.out.println(hobby[2]);
    	 System.out.println(hobby4[2]);
    	}

	
    
    
    
	
}
