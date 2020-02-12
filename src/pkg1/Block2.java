package pkg1;

public class Block2 extends Block1 {

	public Block2 ()
	{
		this("yuvaraj");
		System.out.println("Block2");
	}

	public Block2 (String Flat2)
	{
		System.out.println(Flat2);
	}
	public static void main(String[] args) {
		Block2 FF= new Block2();
		//Block2 FFF = new Block2("Ruby");
		
	}
}

