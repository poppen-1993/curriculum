package study;

public class TestStatic {
	int num1 = 0;
	static int num2 = 0;
	
	public void numPlus() {
		num1++;			//�C���X�^���X�Ƃ��Đ������ꂽ�e�C���X�^���X���Ƃ�num1�̒l�ɑ΂���+1���Ă���B
		num2++;			//�N���X�t�B�[���h�Ƃ��Ă̗B��̕ϐ�num2�ɑ΂���+1���Ă��邽�߁A���̃��\�b�h���Ăяo����A���s�������num2��+1����Ă����B
		
		System.out.println("static����:" + num1 );
		System.out.println("static�L��F" + num2 );
	}
}