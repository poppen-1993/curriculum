package study;

/**
 * Main.java
 *
 * �{�ۑ�ł́Amain���\�b�h�E�C���X�^���X�E���\�b�h�̌Ăяo���̎g�������w��ł����܂��傤�B
 * �ۑ�͈͈͂ȉ��̂Ƃ���ł��B
 *   Study.java: ��@
 *   Main.java: ��@�����A
 * �w�肳�ꂽ�l�ƕϐ���������ċL�q���Ă��������B
 *
 */
public class Main {

    public static void main(String[] args) {

        // �@ �ȉ��̃��[���ɏ]��Account�N���X�̃C���X�^���X�𐶐����Ă��������B
        // �ϐ���:�uaccount�v
    	Account account = new Account("hoge", 123, "abc123");
        // �A �@�̃C���X�^���X�ϐ����A�A�J�E���g�����R���\�[���o�͂��郁�\�b�h���Ăяo���Ȃ����B
    	account.printAccountInfo();
    }
}