package study;

/**
 *
 * �{�ۑ�ł́A�t�B�[���h�ϐ��A���\�b�h�̊�{�I�Ȏg�������w��ł����܂��傤�B
 * �ۑ�͈͈͂ȉ��̂Ƃ���ł��B
 *   Main.java: ��@�����B
 * �w�肳�ꂽ�l�ƕϐ���������ċL�q���Ă��������B
 *
 */
public class Main {

    public static void main(String[] args) {

      //�@ firstName��lastName�Ƃ������O�̕ϐ����`���A
      //   firstName�ɂ͎����̖��O�AlastName�ɂ͎����̖����ŏ��������Ȃ���
    	String firstName = "Yuu";
    	String lastName = "Sakai";

        //getName�֐��̌Ăяo���Əo��
        System.out.println(getName(firstName, lastName));
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //�B arr �z������[�v�����AisOdd�֐����g���Ĕz��̗v�f������ǂ����̔�����s���Ȃ����B
        //   �v�f����̏ꍇ�ɂ́un�͊�ł��B�v�Əo�͂���܂��B
        for (int i = 0; i < arr.length; i++) {
        	isOdd(arr[i]);
        }

    }

    //�A �֐����`���Ȃ����B
    //   �֐����FgetName
    //  �C���q�Fpublic
    //   �����ɂ͇@�Œ�`����firstName��lastName�������Ŏ󂯎��A
    //  last_name �� first_name ��A�������l��Ԃ�l�Ƃ���ϐ����`���Ȃ����B
    public static String getName(String first_name, String last_name) {
    	return last_name + first_name;
    }



    //��̔�����s���B
    public static void isOdd(int num) {
      if(num % 2 != 0) {
        System.out.println(num + "�͊�ł��B");
        }
  }
}