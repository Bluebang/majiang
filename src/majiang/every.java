package majiang;
import javax.swing.ImageIcon;
public class every {
	private int number;// �齫����ֵ
    private int color;// �齫�Ļ�ɫ��1 ����Ͳ��2 �������� 3 ���� ��
    private boolean If_Touched;
    private boolean If_Konged;
    private ImageIcon img;
    every(int n, int c, boolean If_Touched, boolean If_Konged)
    {
    	setNumber(n);
    	setColor(c);
    	setIf_Touched(If_Touched);
    	setIf_Konged(If_Konged);
    }
    every()
    {
    	number=0;
    	color=1000;
    	If_Touched=false;
    	If_Konged=false;
    	img= new ImageIcon("picture\\1tiao.jpg");
    }
    every (every e)
    {
    	setNumber(e.getNumber());
    	setColor(e.getColor());
    	img=e.getImg();
    }
    public void setImage(String a)
    {
    	img=new ImageIcon(a);
    }
    public ImageIcon getImg(){ return img;}
    public void setNumber(int n){number=n;}
    public  void setColor(int a) { color=a;}
    /**
     * ������
     * @param a
     */
    public void setIf_Touched(boolean a) {If_Touched=a;}
    /**
     * ���ø�
     * @param a
     */
    public void setIf_Konged(boolean a) {If_Konged=a;}
    /**
     * ��ȡ�齫��ֵ
     * @return
     */
    public int getNumber() {return number;}
    /**
     * ��ȡ�齫��ɫ��1-Ͳ��2-����3-�f
     * @return
     */
    public int getColor() {return color;}
    /**
     * ��
     * @return
     */
    public boolean getIf_Touched() {return If_Touched;}
    /**
     * ��
     * @return
     */
    public boolean getIf_Konged() {return If_Konged;}
}
