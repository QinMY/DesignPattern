package cn.design.single;

public class SingleObject {
	//创建私有构造方法
	private SingleObject(){}
	//创建一个静态实例
	private static SingleObject instance = new SingleObject();
	public static SingleObject getInstance(){
		return instance;
	}
	public void showMessage(){
		system.out.print("Single Pattern");
	}
	
    }



}
