package may19;



	
		interface A
		{
			public void show();
		}
        interface B extends A
        {
        	public void display();
        }
        class C implements A,B {
        	{
        		System.out.println("Instance block");
        	}
        	public void show()
        	{
        		System.out.println("excuting show");
        	}
        	public void display(){
        		{
        			System.out.println("excuting display");
        		}
        	}
        	public class Interface
        	{ 
        	public void main(String[] args) 
        	{
        	C ff = new C();
        	ff.display();
        	ff.show();
        	}
        	}
        }
	


