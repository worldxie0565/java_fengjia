public class Test01 {
	public static void main(String[] args) {
		Phone p = new Phone();		//�����ֻ������
		p.setBrand("IPhone");		//���ֻ���Ʒ�Ƹ�ֵ
		p.setPrice(6000);			//���ֻ��ļ۸�ֵ
		System.out.println(p.getBrand() + "***" + p.getPrice());	//��ӡ�ֻ�����Ϣ
		p.call();					//�����ֻ����call()����
		p.sendMessage();			//�����ֻ����sendMessage()����
		p.playGame();				//�����ֻ����playGame()����
	}
}

class Phone {
	private String brand;		 //Ʒ��
	private int price;			 //�۸�

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void call() {
		System.out.println("�ֻ����Դ�绰");
	}

	public void sendMessage() {
		System.out.println("�ֻ����Է�����");
	}

	public void playGame() {
		System.out.println("�ֻ����������Ϸ");
	}
}
