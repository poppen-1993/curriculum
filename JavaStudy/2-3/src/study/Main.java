package study;

/**
 *
 * �{�ۑ�ł́A�p���E�I�[�o�[���[�h���\�b�h�̊�{�I�Ȏg�������w��ł����܂��傤�B
 * �ۑ�͖�@�����B�܂ł���܂��B
 * �w�肳�ꂽ�l�ƕϐ���������ċL�q���Ă��������B
 *
 * @author s.nanaumi
 */
public class Main {

    public static void main(String[] args) {

        // �B Task�N���X�̃C���X�^���X�𐶐����A�udoTask()�v���\�b�h���Ăяo���Ȃ����B
    	Task task = new Task();
    	
    	task.doTask();
    	
    	boolean tr = true;
    	boolean fa = false;
    	
    	System.out.println(tr ? "�`�����[" : "�t�H�[���X");
    	System.out.println(fa ? "�`�����[" : "�t�H�[���X");
    }

}