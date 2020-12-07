package study;

/**
 * Study.java
 */
class Account {

    // �t�B�[���h�ϐ�
    private String userName;
    private int id;
    private String password;

    // �R���X�g���N�^
    public Account(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // �@ �ȉ��̃��[���ɏ]���A�J�E���g���i���O�AID�A�p�X���[�h�j���o�͂��郁�\�b�h���쐬���Ă��������B
    // �A�N�Z�X�C���q:�uprotected�v
    // ���\�b�h��:�uprintAccountInfo�v
    protected void printAccountInfo() {
    	System.out.println("���[�U�[���́A" + this.userName);
    	System.out.println("ID�́A" + this.id);
    	System.out.println("�p�X���[�h�́A" + this.password);
    }

}