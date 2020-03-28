package com.atgugui.exer;

public class StudentTest {
	public static void main(String[] args) {
//		Student s1=new Seudent;();
//		Student s1=new Seudent;();
//		Student s1=new Seudent;();
		
		
		//声明student类型的数组
		Student[] stus=new Student[20];
		for(int i=0;i<stus.length;i++) {
			//给給每一个数组赋值
			stus[i]=new Student();
			//给Studen对象的属性赋值
			stus[i].number=(i+1);
			//年级；[ 1,6]
			stus[i].state=(int)(Math.random()*(6-1+1)+1);
			//成绩[0,100]
			stus[i].score=(int)(Math.random()*(100-0+1));
		}	
		//便利学生数组
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i].number+","+stus[i].state+
					","+stus[i].score);
		}
			
				
		//问题1； 打印出三年级学生的信息
		for(int i=0;i<stus.length;i++){
			if(stus[i].state==3){
				System.out.println(stus[i].number+","+stus[i].state+
						","+stus[i].score);
			}
		}
		//问题2,用冒泡排序按照学生成绩排序，并便利所有学生信息
		for(int i=0;i<stus.length;i++){
			for(int j=0;j<stus.length-1-i;j++){
				if(stus[j].score>stus[j+1].score) {
					//如果需要换顺序,要Student
					Student temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
			}
		}		
	}
	
	
}
	
	
	
class Student{
	int number;//学号
	int state;//年级
	int score;//成绩
	
	//现实学生信息的方法
	public String info() {
		return "aa"
}

