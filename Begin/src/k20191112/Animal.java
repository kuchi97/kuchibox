package k20191112;

//Ãß»ó¸Þ¼Òµå±¸¼º
//¿ïÀ½¼Ò¸®	public void crySound()
//»õ³¢³º¾Æ	public void getBaby(int num);

//ÀÚ½ÄÅ¬·¡½º °­¾ÆÁö °í¾çÀÌ ¿À¸®
//override	¸Û¸Û	¾ß¿Ë	²Ð²Ð
//»õ³¢		x¸¶¸®	x¸¶¸®	x°³ ¾Ë

abstract public class Animal {
	
	int num;
	
	abstract public void crySound();
	abstract public void getBaby(int num);

}

class Dog extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("’o’o");
	}
	public void getBaby(int num)
	{
		System.out.println("»õ³¢¸¦ "+num+"¸¶¸® ³º¾Ò¾î¿ä");
	}
}
class Cat extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("ÀÌ¾ß¿Ë");
	}
	public void getBaby(int num)
	{
		System.out.println("»õ³¢¸¦ "+num+"¸¶¸® ³º¾Ò¾î¿ä");
	}
}
class Duck extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("…x…x");
	}
	public void getBaby(int num)
	{
		System.out.println("¾ËÀ» "+num+"°³ ³º¾Ò¾î¿ä");
	}
}