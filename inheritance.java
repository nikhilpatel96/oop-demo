package oopconcept;


class Product {
	
	//private int pid;    // attributes
	int pid;
	String name;
	int price;
	
	//constructor
	Product(){
		System.out.println("product object constructed");
	}
	//methods
	//write the data
	void setproductdetails(int pid,String name, int price) {
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	//read the data
	void showproductdetails() {
		System.out.println(" product id : "+ pid );
		System.out.println(" name : " + name);
		System.out.println(" price : " + price);
	}
	
	void setpid(int pid) {
		this.pid =pid ;//this means refer to main current object
		}
	
	int getpid() {
		return pid;
	}
}

class Mobile extends Product{
	
	String os;
	int ram;
	int sdcardsize;
	
	Mobile(){
		System.out.println("mobile object constructed");
	}
	void setproductdetails(int pid,String name, int price ,String os, int ram,int sdcardsize) {
		this.pid=pid;
		this.name=name;
		this.price=price;
		this.os=os;
		this.ram=ram;
		this.sdcardsize=sdcardsize;
		System.out.println("data written in mobile object");
	}
	
	void showproductdetails() {
		System.out.println(" product id : "+ pid );
		System.out.println(" name : " + name);
		System.out.println(" price : " + price);
		System.out.println(" os: " + os);
		System.out.println(" ram : " + ram);
		System.out.println(" sdcardsize : " + sdcardsize);
	}
	
}
public class inheritance {

	public static void main(String[] args) {
//		Product product1 = new Product();
//		System.out.println("product "+ product1);
//		
//		//write the data in object
//		product1.setproductdetails(101,"iphone14",70000);
//		product1.showproductdetails();
//		
//		System.out.println();
//		
//		//lets write the data in object
//		
//		Product product2 =new Product();
//		product2.setpid(202);
//		product2.name = "googlepixel";
//		product2.price = 50000;
//		
//		product2.showproductdetails();
		Mobile mobile= new Mobile();
		mobile.setproductdetails(303,"iphone 12",60000,"ios",4,128);
		mobile.showproductdetails();


	}

}
