package giao;

import java.awt.*;

public class Tank extends GameObject{

    private String upImage; //�����ƶ�ʱ��ͼƬ
    private String downImage;//�����ƶ�ʱ��ͼƬ
    private String rightImage;//�����ƶ�ʱ��ͼƬ
    private String leftImage;//�����ƶ�ʱ��ͼƬ
    //̹��size
    int width = 40;
    int height = 50;
    //̹�˳�ʼ����
    Direction direction = Direction.UP;
    //̹���ٶ�
    private int speed = 3;

    //̹�����꣬����ͼƬ���������
    public Tank(String img, int x, int y, String upImage, String downImage, String leftImage, String rightImage, GamePanel gamePanel) {
        super(img, x, y, gamePanel);
        this.upImage = upImage;
        this.leftImage = leftImage;
        this.downImage = downImage;
        this.rightImage = rightImage;
    }

    public void leftward(){
        direction = Direction.LEFT;
        setImg(leftImage);
        this.x -= speed;

    }
    public void rightward(){
        direction = Direction.RIGHT;
        setImg(rightImage);
        this.x += speed;

    }
    public void upward(){
        direction = Direction.UP;
        setImg(upImage);
        this.y -= speed;

    }
    public void downward(){
        direction = Direction.DOWN;
        setImg(downImage);
         this.y += speed;

    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
