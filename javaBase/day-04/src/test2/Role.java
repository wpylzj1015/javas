package test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英军", "五官端正"};
    String[] girlfaces = {"美色绝伦", "沉鱼落雁", "亭亭玉立", "相貌平平"};


    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //随机长相
        setFace(gender);
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     *
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     *
     * @param gender
     */
    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int ind = r.nextInt(boyfaces.length);
            this.face = boyfaces[ind];

        } else if (gender == '女') {
            int ind = r.nextInt(girlfaces.length);
            this.face = girlfaces[ind];
        } else {
            this.face = "四不像";
        }

    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相是：" + getFace());
    }

    public void attack(Role role) {

    }
}
