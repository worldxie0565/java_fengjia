public class Test01 {
	public static void main(String[] args) {
		new Play(){						//������������
			public void playGame(){		//��д�ӿ��еĳ��󷽷�
				System.out.println("����Ϸ");
			}
		}.playGame();					//ʹ�������������playGame()����
	}
}

interface Play {						//�ӿ�
	public void playGame();
}