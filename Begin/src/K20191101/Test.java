package K20191101;

//feat. MyDemo(), YourDemo(), OurDemo();

public class Test {

	public static void main(String[] args) {
		//MyDemo�� ��ü�� �����ϱ�
		//���� ��Ű���� ������ �����־�
		
		/* class������ ���� ����
			= (class var.name= new �������̸�();)
		*/
		
		MyDemo md;						//md��� ��ü�� ����, md�� stack�� ����
		md= new MyDemo();				//new �ϸ� MyDemo�����ڰ� heap�� ����ǰ�
		MyDemo md2= new MyDemo();		//md�� MyDemo�� �ּҸ� ����Ŵ
		MyDemo md3= new MyDemo();
		MyDemo md4= md;
		
		System.out.println(md);			//���� MyDemo�� ����������
		System.out.println(md2);		//���� ����Ű�� �ּҰ��� �� �ٸ�
		System.out.println(md3);		//���� �����Ȱ��� ����
		System.out.println(md4);
		
		System.out.println("==================\n");
				
		YourDemo yd= new YourDemo();	//YourDemo ��ü ����
		System.out.println(yd);
		
		YourDemo yd2= new YourDemo();
		
		yd2.str="���̿Ծ��";
		
		System.out.println("yd.str: "+yd.str);
		System.out.println("yd2.str: "+yd2.str);
		
		OurDemo od= new OurDemo();		//������ �ȸ��� ��ü�� ȣ�Ⱑ��?
		System.out.println(od.z);
		System.out.println(od.bool);
		System.out.println(od.str);
		
	}

}