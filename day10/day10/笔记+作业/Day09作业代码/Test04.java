public class Test04 {
	public static void main(String[] args) {
		Person p = new Person();			//�����ӿ�ʵ�������
		p.playGame();						//ʹ��ʵ����������playGame()����
	}
}

interface Play {							//�ӿ�
	public void playGame();
}

class Person implements Play{				//����һ���ӿڵ�ʵ����
	public void playGame(){					//��д�ӿ��еĳ��󷽷�
		System.out.println("����Ϸ");
	}
}