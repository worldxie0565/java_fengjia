1,����һ������swap()���뼯�Ϻ������Ǳ�ʹ������Ԫ�ؽ���λ��
	a,����һ����ʱ����, ��ס����һ��Ԫ��
	b,�õ�һ��λ�ô�ŵڶ���λ���ϵ�Ԫ��
	c, �õڶ���λ�ô����ʱ������ס��Ԫ��
	
2,�Ѽ����д洢���Person����,Person������������,�ҳ���������
	a,����һ��Person���͵ı���, �ȼ�ס��һ��Ԫ��
	b,ѭ����������
	c,��ÿһ��Ԫ�غͱ����Ƚ�����, ��������е�Ԫ�رȱ�����ס�������
	d,�ñ�����ס�������ϴ��Ԫ��
	e,���ر�����ס��Ԫ��
3,�Ѽ����е�Ԫ�ط�ת
	a,����ѭ��, ѭ��size()/2��
	b,��һ�ν�����һ�������һ��, �ڶ��ν����ڶ����͵����ڶ���

4,public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("b");
		list1.add("f");
		list1.add("e");
		list1.add("c");
		list1.add("a");
		list1.add("d");
		sort1(list1);
		System.out.println(list1);	// a, b, c, d, e, f
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(5);
		list2.add(8);
		list2.add(3);
		list2.add(1);
		list2.add(4);

		sort2(list2);
		System.out.println(list2); //1,3,4,5,8
	}
	�Լ�������ӵ�Ԫ������
5,List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		
		System.out.println(frequency(list, "a"));	// 3
		System.out.println(frequency(list, "b"));	// 2
		System.out.println(frequency(list, "c"));	// 1
		System.out.println(frequency(list, "d"));	// 5
		System.out.println(frequency(list, "xxx"));	// 0
		���巽��ͳ�Ƽ�����ָ��Ԫ�س��ֵĴ���
6,����һ��replaceAll����,���������ֵ�滻�����е���ֵ(list,old,new)

